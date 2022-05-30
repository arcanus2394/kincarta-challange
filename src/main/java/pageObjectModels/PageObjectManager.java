package pageObjectModels;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private WebDriver driver;
    private AmazonStorePage amazonStorePage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public AmazonStorePage getAmazonStorePage(){
        return (amazonStorePage == null) ? amazonStorePage = new AmazonStorePage(driver) : amazonStorePage;
    }

}
