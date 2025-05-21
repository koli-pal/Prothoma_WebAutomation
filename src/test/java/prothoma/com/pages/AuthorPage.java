package prothoma.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import prothoma.com.basedriver.PageDriver;
import prothoma.com.utilities.CommonMethods;

import java.util.List;

public class AuthorPage extends CommonMethods {
    public AuthorPage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath = "//div[@class='category_info_ct_block']//font//font[contains(text(),'Anisul Haque')]")
    WebElement AnisulHaque;

    /*@FindBy(xpath = "//label[@for='category723']") // assuming there's a dropdown for category
    WebElement categoryDropdown;

    @FindBy(xpath = "//div[@class='content']//div[3]//div[1]//div[2]//div[3]//a[1]") // assuming there's a dropdown for category
    WebElement detailsButton;

    @FindBy(xpath = "//a[@id='viewBuyURL']")
    List<WebElement> addToCartButtons;*/

    public void selectAuthor() {

        AnisulHaque.click();
    }

   /* public void filterByNobelCategory() {
        selectByVisibleText(categoryDropdown, "Film and theater"); // adjust if needed
    }

    public void detailsButton() {
        scrollToElement(categoryDropdown);
        detailsButton.click();
    }

    public void addAnyBookToCart() {
        waitForElementToBeClickable(addToCartButtons.get(0));
        addToCartButtons.get(0).click();
    }*/

}
