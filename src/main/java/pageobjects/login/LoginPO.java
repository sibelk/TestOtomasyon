package pageobjects.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePageObject;

public class LoginPO extends BasePageObject {

    private @FindBy(id = "text")     //PAGE FACTORY ANNOTATION
    WebElement username_TextField;

    private @FindBy(id = "password")
    WebElement password_TextField;

    private @FindBy(id = "login-button")
    WebElement login_Button;

    public LoginPO() {
        super();
    }

    public void navigateTo_WebDriverUniversity_Login_Page() {
        navigateTo_URL("https://www.webdriveruniversity.com/Login-Portal/index.html?");
    }

    public void setUsername(String username) {
        sendKeys(username_TextField, username);
    }

    public void setPassword(String password) {
        sendKeys(password_TextField, password);
    }

    public void clickOn_Login_Button() {
        waitForWebElementAndClick(login_Button);
    }

    public void validate_SuccessfulLogin_Message() {
        waitForAlertAndValidateTxt("validation succeeded");
    }

    public void validate_UnsuccessfulLogin_Message() {
        waitForAlertAndValidateTxt("validation failed");
    }
}
