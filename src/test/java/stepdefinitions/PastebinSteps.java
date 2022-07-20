package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.PastebinPO;

public class PastebinSteps {

    private PastebinPO pastebinPO;

    public PastebinSteps(PastebinPO pastebinPO) {
        this.pastebinPO = pastebinPO;
    }

    @Given("I access the pastebin page")
    public void i_access_the_pastebin_page() {
        pastebinPO.navigateTo_pastebin();
    }

    @When("I enter a pastebin password sibel")
    public void i_enter_a_pastebin_password_sibel() {
        pastebinPO.setPassword("sibel");
    }

    @When("I click on the show button")
    public void i_click_on_the_show_button() {
        pastebinPO.clickOn_Button();
    }

    @Then("I should be presented with text PASTEBIN_URL")
    public void i_should_be_presented_with_text_sibel() {
        pastebinPO.show_Text();
    }

}
