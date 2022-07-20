package stepdefinitions.contact;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.BasePageObject;
import pageobjects.contact.ContactUsPO;

public class ContactUsSteps extends BasePageObject {
    private ContactUsPO contactUsPO;

    public ContactUsSteps(ContactUsPO contactUsPO) {
        this.contactUsPO = contactUsPO;
    }

    @Given("I access the webdriver university contact us page")
    public void i_access_the_webdriver_university_contact_us_page() {
        contactUsPO.navigateTo_WebDriverUniversity_Contact_Us_Page();
    }

    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
        contactUsPO.setUnique_FirstName();
    }

    @And("I enter a unique last name")
    public void i_enter_a_unique_last_name() {
        contactUsPO.setUnique_LastName();
    }

    @And("I enter a unique email address")
    public void i_enter_a_unique_email_address() {
        contactUsPO.setUnique_EmailAddress();
    }

    @And("I enter a unique comment")
    public void i_enter_a_unique_comment() {
        contactUsPO.setUnique_Comment();
    }

    @When("I enter a specific first name {word}")
    public void i_enter_a_specific_first_name(String firstName) {
        contactUsPO.setSpecific_FirstName(firstName);
    }

    @When("I enter a specific last name {word}")
    public void i_enter_a_specific_last_name(String lastName) {
        contactUsPO.setSpecific_LastName(lastName);
    }

    @When("I enter a specific email address {word}")
    public void i_enter_a_specific_email_address(String email) {
        contactUsPO.setSpecific_EmailAddress(email);
    }

    @When("I enter a specific comment {string}")
    public void i_enter_a_specific_comment(String comment) {
        contactUsPO.setSpecific_Comment(comment);
    }

    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {
        contactUsPO.clickOn_Submit_Button();
    }

    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
        contactUsPO.validate_Successful_SubmissionMessage_Text();
    }
}
