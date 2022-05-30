package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchComponent {
    private WebDriver webDriver;

    @FindBy(how = How.ID, using = "twotabsearchtextbox")
    private WebElement searchBarInput;

    public SearchComponent(WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchForItem(String item) {
        //new WebDriverWait(webDriver, Duration.ofMillis(5000)).until(ExpectedConditions.elementToBeClickable(searchBarInput));
        searchBarInput.sendKeys(item);
        searchBarInput.submit();
    }
}
