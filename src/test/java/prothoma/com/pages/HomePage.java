package prothoma.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import prothoma.com.basedriver.PageDriver;
import prothoma.com.utilities.CommonMethods;

public class HomePage extends CommonMethods {
    public HomePage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }
    @FindBys({
            @FindBy(xpath = "//li[@id='writer']//a"),// Bengali "Author" link
            @FindBy(xpath = "//li[@id='writer']//a[contains(text(),'লেখক')]")
             })
            WebElement authorMenu;

    public void clickAuthorMenu() {
        waitForElementToBeClickable(authorMenu);
        authorMenu.click();
    }
}
