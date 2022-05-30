package pageObjectModels;

import components.PaginationComponent;
import components.SearchComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class AmazonStorePage {
    WebDriver driver;
    private SearchComponent searchComponent;
    private PaginationComponent paginationComponent;

    private final String URL = "";


    @FindAll(@FindBy(how = How.CSS, using = "div[data-component-type=\"s-search-result\"]"))
    private List<WebElement> searchItemsList;
    public AmazonStorePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.searchComponent = new SearchComponent(driver);
        this.paginationComponent = new PaginationComponent(driver);
    }
    public SearchComponent getSearchComponent(){
        return searchComponent;
    }

    public PaginationComponent getPaginationComponent(){
        return paginationComponent;
    }

    public void navigateToHomePage(String url){
        driver.get(url);
    }

    public void selectItem(int itemIndex){
        new WebDriverWait(driver, Duration.ofMillis(1000)).until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector("div[data-component-type=\"s-search-result\"]"),0));
        searchItemsList.get(itemIndex).findElement(By.cssSelector(".s-title-instructions-style a.s-underline-link-text.a-text-normal")).click();
    }

}
