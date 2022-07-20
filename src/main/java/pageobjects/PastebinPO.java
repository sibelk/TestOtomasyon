package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.GlobalVariables;

public class PastebinPO extends BasePageObject {

    private @FindBy(id = "postpasswordverificationform-password")
    WebElement password_TextField;

    private @FindBy(xpath = "//*[@id='w1']/div[3]/button")
    WebElement login_button;

    private @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/ol/li/div")
    WebElement text;


    public void navigateTo_pastebin() {
        navigateTo_URL(GlobalVariables.PASTEBIN_URL);
    }

    public void setPassword(String password) {
        sendKeys(password_TextField, password);
    }

    public void clickOn_Button() {
        waitForWebElementAndClick(login_button);
    }

    public void show_Text() {
        waitFor(text);
        Assert.assertEquals(text.getText(), "PASTEBIN_URL");
    }
}
