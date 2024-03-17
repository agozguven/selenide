package steps;

import common.PageManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.BaseTest;

import static org.assertj.core.api.Assertions.assertThat;

public class ElementSteps extends BaseTest {
    PageManager pageManager = new PageManager();
    @Given("Open demoqa site")
    public void openDemoqaSite() {
        pageManager.elementPage.open();
    }

    @When("Click Buttons")
    public void clickButtons() {
        pageManager.elementPage.selectButtons.click();
    }

    @When("Click ClickMeButton")
    public void clickClickMeButton() {
        pageManager.elementPage.clickMeButton.click();
    }

    @Then("ClickMeButton is clicked successfully")
    public void clickmebuttonIsClickedSuccessfully() {
        assertThat(pageManager.elementPage.txtDynamicCLick.isDisplayed()).isTrue();
    }

    @When("Click Webtables")
    public void clickWebtables() {
        pageManager.elementPage.selectWebTables.click();
    }

    @When("Enter inputs for new item and click submit button")
    public void enterAndAndClickSubmitButton() {
        pageManager.elementPage.addItem("Gokce","Ozguven","gokce@gmail.com", "30","10000","test" );
    }

    @Then("User added item on webtable successfully")
    public void userAddedItemOnWebtableSuccessfully() {
        assertThat(pageManager.elementPage.addedItem.isDisplayed()).isTrue();
    }


    @When("click edit button and clear firstname and enter firstname and click submit button")
    public void clearFirstnameAndEnterAndClickSubmitButton() {
        pageManager.elementPage.editItem("Umut");
    }

    @Then("User editted firstname of added item on webtable successfully")
    public void userEdittedFirstnameOfAddedItemOnWebtableSuccessfully() {
        assertThat(pageManager.elementPage.updatedItem.isDisplayed()).isTrue();
    }
}
