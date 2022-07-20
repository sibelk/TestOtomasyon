package driver;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.GlobalVariables;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Initializes web driver instance specific to browser type
 */
public class DriverFactory {
    //run all test parallel
    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (webDriver.get() == null) {
            webDriver.set(createDriver());
        }
        return webDriver.get();
    }

    private static WebDriver createDriver() {
        WebDriver driver = null;


        switch (getBrowserType()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", GlobalVariables.CHROME_DRIVER_PATH);
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                driver = new ChromeDriver(chromeOptions);
                break;

        }
        driver.manage().window().maximize();
        return driver;
    }

    private static String getBrowserType() {
        String browserType = null;

        try {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/properties/config.properties");
            properties.load(fileInputStream);
            browserType = properties.getProperty("browser").toLowerCase().trim();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return browserType;
    }

    public static void cleanupDriver() {
        webDriver.get().quit();
        webDriver.remove();
    }
}
