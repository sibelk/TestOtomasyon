package stepdefinitions.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageobjects.BasePageObject;
import pageobjects.login.LoginPO;

public class LoginSteps extends BasePageObject {
    private WebDriver driver = getDriver();

    private LoginPO loginPo;

    public LoginSteps(LoginPO loginPo) {
        this.loginPo = loginPo;
    }

    @Given("I access the webdriver university login page")
    public void i_access_the_webdriver_university_login_page() {
        loginPo.navigateTo_WebDriverUniversity_Login_Page();
    }

    @When("I enter a username {}")
    public void i_enter_a_username(String username) {
        loginPo.setUsername(username);
    }

    @And("I enter a password {}")
    public void i_enter_a_password(String password) {
        loginPo.setPassword(password);
    }

    @And("I click on the login button")
    public void i_click_on_the_login_button() {
        loginPo.clickOn_Login_Button();
    }

    @Then("I should be presented with the successful login message")
    public void i_should_be_presented_with_the_successful_login_message() {
        String login_Message = driver.switchTo().alert().getText();
        Assert.assertEquals(login_Message, "validation succeeded");
    }

    @Then("I should be presented with the unsuccessful login message")
    public void i_should_be_presented_with_the_unsuccessful_login_message() {
        String login_Message = driver.switchTo().alert().getText();
        Assert.assertEquals(login_Message, "validation failed");
    }

    @Then("I should be presented with the following login validation message {}")
    public void i_should_be_presented_with_the_following_login_validation_message(String expectedMessage) {
        String login_Message = driver.switchTo().alert().getText();
        Assert.assertEquals(login_Message, expectedMessage);
    }
}

