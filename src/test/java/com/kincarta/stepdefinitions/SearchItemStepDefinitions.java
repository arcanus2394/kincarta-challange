package com.kincarta.stepdefinitions;


import com.kincarta.config.DriverManager;
import com.kincarta.config.TestContext;
import io.cucumber.java8.En;
import org.junit.Assert;
import pageObjectModels.AmazonStorePage;
import pageObjectModels.ItemPage;


public class SearchItemStepDefinitions implements En {
    private TestContext testContext;
    private AmazonStorePage amazonStorePage;
    private ItemPage itemPage;
    private DriverManager driverManager;

    public SearchItemStepDefinitions(){
        Given("the user navigates to {string}", (String url) -> {
            driverManager = new DriverManager();
            driverManager.getDriver().get(url);
        });
        When("Searches for {string}", (String item) -> {
            amazonStorePage = new AmazonStorePage(driverManager.getDriver());
            amazonStorePage.getSearchComponent().searchForItem(item);
        });
        When("navigates to the second page", () -> amazonStorePage.getPaginationComponent().goToNextPage());
        When("selects the third item", () -> amazonStorePage.selectItem(2));
        Then("assert that the item would be available for purchase", () -> {
            itemPage = new ItemPage(driverManager.getDriver());
            Assert.assertTrue(itemPage.addToCartButtonIsPresent());
            driverManager.closeDriver();
        });
    }

}
