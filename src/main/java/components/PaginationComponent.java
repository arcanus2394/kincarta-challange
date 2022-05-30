package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PaginationComponent {
    private WebDriver webDriver;

    @FindBy(how = How.CSS, using = "a.s-pagination-next.s-pagination-button")
    private WebElement nextPageButton;

    public PaginationComponent(WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToNextPage() {
        nextPageButton.click();
    }
}
