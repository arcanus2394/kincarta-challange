package pageObjectModels;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private WebDriver driver;
    private AmazonStorePage amazonStorePage;

    private ItemPage itemPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public AmazonStorePage getAmazonStorePage(){
        return (amazonStorePage == null) ? amazonStorePage = new AmazonStorePage(driver) : amazonStorePage;
    }

    public ItemPage getItemPage(){
        return (itemPage == null) ? itemPage = new ItemPage(driver) : itemPage;
    }

}
