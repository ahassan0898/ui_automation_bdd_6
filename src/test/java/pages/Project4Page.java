package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class Project4Page {

    public Project4Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "h1[class]")
    public WebElement inventoryHeading;

    @FindBy(css = "th[class]")
    public List<WebElement> tableHeaders;

    @FindBy(css = "tbody > tr:nth-child(1) > td:nth-child(1)")
    public WebElement tableRowOneColumnOne;

    @FindBy(css = "tbody > tr:nth-child(1) > td:nth-child(2)")
    public WebElement tableRowOneColumnTwo;

    @FindBy(css = "tbody > tr:nth-child(1) > td:nth-child(3)")
    public WebElement tableRowOneColumnThree;

    @FindBy(css = "tbody > tr:nth-child(1) > td:nth-child(4)")
    public WebElement tableRowOneColumnFour;

    @FindBy(css = "tbody > tr:nth-child(2) > td:nth-child(1)")
    public WebElement tableRowTwoColumnOne;

    @FindBy(css = "tbody > tr:nth-child(2) > td:nth-child(2)")
    public WebElement tableRowTwoColumnTwo;

    @FindBy(css = "tbody > tr:nth-child(2) > td:nth-child(3)")
    public WebElement tableRowTwoColumnThree;

    @FindBy(css = "tbody > tr:nth-child(2) > td:nth-child(4)")
    public WebElement tableRowTwoColumnFour;

    @FindBy(css = "tbody > tr:nth-child(3) > td:nth-child(1)")
    public WebElement tableRowThreeColumnOne;

    @FindBy(css = "tbody > tr:nth-child(3) > td:nth-child(2)")
    public WebElement tableRowThreeColumnTwo;

    @FindBy(css = "tbody > tr:nth-child(3) > td:nth-child(3)")
    public WebElement tableRowThreeColumnThree;

    @FindBy(css = "tbody > tr:nth-child(3) > td:nth-child(4)")
    public WebElement tableRowThreeColumnFour;

    @FindBy(css = "tbody > tr:nth-child(4) > td:nth-child(1)")
    public WebElement tableRowFourColumnOne;

    @FindBy(css = "tbody > tr:nth-child(4) > td:nth-child(2)")
    public WebElement tableRowFourColumnTwo;

    @FindBy(css = "tbody > tr:nth-child(4) > td:nth-child(3)")
    public WebElement tableRowFourColumnThree;

    @FindBy(css = "tbody > tr:nth-child(4) > td:nth-child(4)")
    public WebElement tableRowFourColumnFour;

    @FindBy(css = "button[class]")
    public WebElement addProductButton;

    @FindBy(id = "total_amount")
    public WebElement total;

    @FindBy(id = "modal_title")
    public WebElement addNewProductModalHeading;

    @FindBy(css = "button[class*='delete']")
    public WebElement closeButton;

    @FindBy(css = "label[for*='product_quantity']")
    public WebElement quantityLabel;

    @FindBy(id = "quantity")
    public WebElement quantityInputBox;

    @FindBy(css = "label[for*='product_name']")
    public WebElement productNameLabel;

    @FindBy(id = "product")
    public WebElement productNameInputBox;

    @FindBy(css = "label[for*='product_price']")
    public WebElement productPriceLabel;

    @FindBy(id = "price")
    public WebElement productPriceInputBox;

    @FindBy(id = "submit")
    public WebElement submitButton;


}



