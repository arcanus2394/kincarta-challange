package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ItemPage {
    WebDriver driver;
    @FindBy(how = How.ID, using = "addToCart")
    private WebElement addToCartSection;

    public ItemPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public Boolean addToCartButtonIsPresent() {
        return addToCartSection.findElement(By.id("add-to-cart-button")).isDisplayed();
    }
}
