package pageobjects.contact;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import pageobjects.BasePageObject;
import utils.GlobalVariables;

public class ContactUsPO extends BasePageObject {
    private @FindBy(how = How.XPATH, using = "//input[@name='first_name']")
    WebElement firstName_TextField;

    private @FindBy(xpath = "//input[@name='last_name']")
    WebElement lastName_TextField;

    private @FindBy(xpath = "//input[@name='email']")
    WebElement emailAddress_TextField;

    private @FindBy(xpath = "//textarea[@name='message']")
    WebElement comment_TextField;

    private @FindBy(xpath = "//input[@value='SUBMIT']")
    WebElement submit_Button;

    private @FindBy(xpath = "//div[@id='contact_reply']/h1")
    WebElement successfulSubmission_Message_Text;

    public ContactUsPO() {
        super();
    }

    public void navigateTo_WebDriverUniversity_Contact_Us_Page() {
        navigateTo_URL(GlobalVariables.BASE_LOCAL_URL + "/Contact-Us/contactus.html");
    }

    public void setUnique_FirstName() {
        sendKeys(firstName_TextField, "AutoFN");
    }

    public void setUnique_LastName() {
        sendKeys(lastName_TextField, "AutoLN");
    }

    public void setUnique_EmailAddress() {
        sendKeys(emailAddress_TextField, "AutoEmail@mail.com");
    }

    public void setUnique_Comment() {
        sendKeys(comment_TextField, "Hello world");
    }

    public void setSpecific_FirstName(String firstName) {
        sendKeys(firstName_TextField, firstName);
    }

    public void setSpecific_LastName(String lastName) {
        sendKeys(lastName_TextField, lastName);
    }

    public void setSpecific_EmailAddress(String emailAddress) {
        sendKeys(emailAddress_TextField, emailAddress);
    }

    public void setSpecific_Comment(String comment) {
        sendKeys(comment_TextField, comment);
    }

    public void clickOn_Submit_Button() {
        waitForWebElementAndClick(submit_Button);
    }

    public void validate_Successful_SubmissionMessage_Text() {
        waitFor(successfulSubmission_Message_Text);
        Assert.assertEquals(successfulSubmission_Message_Text.getText(), "Thank You for your Message!");
    }
}
