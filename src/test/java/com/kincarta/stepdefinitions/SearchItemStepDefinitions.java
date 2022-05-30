package com.kincarta.stepdefinitions;


import com.kincarta.config.DriverManager;
import com.kincarta.config.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjectModels.AmazonStorePage;
import pageObjectModels.ItemPage;


public class SearchItemStepDefinitions {
    private final AmazonStorePage amazonStorePage;
    private final TestContext testContext;
    private ItemPage itemPage;
    private DriverManager driverManager;
    private WebDriver driver;

    public SearchItemStepDefinitions(TestContext context) {
        testContext = context;
        amazonStorePage = testContext.getPageObjectManager().getAmazonStorePage();
    }

    @Given("the user navigates to {string}")
    public void navigateToURL(String url) {
        amazonStorePage.navigateToHomePage(url);
    }

    @When("Searches for {string}")
    public void searchForString(String item) {
        amazonStorePage.getSearchComponent().searchForItem(item);
    }

    @When("navigates to the second page")
    public void navigateToSecondPage() {
        amazonStorePage.getPaginationComponent().goToNextPage();
    }

    @When("selects the third item")
    public void selectItem() {
        amazonStorePage.selectItem(2);
    }

    @Then("assert that the item would be available for purchase")
    public void checkItemAvailableForPurchase() {
        itemPage = testContext.getPageObjectManager().getItemPage();
        Assert.assertTrue(itemPage.addToCartButtonIsPresent());
        testContext.getWebDriverManager().closeDriver();
    }

}