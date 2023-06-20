package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.DataTable;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import pages.Project4Page;
import utils.Driver;

import java.util.List;
import java.util.NoSuchElementException;

public class Project4Steps {
    WebDriver driver;
    Project4Page project4Page;

    @Before
    public void setDriver() {
        driver = Driver.getDriver();
        project4Page = new Project4Page();
    }


    @Given("the user navigates to {string}")
    public void theUserNavigatesTo(String url) {
        driver.get(url);
    }

    @Then("the user should see the “Inventory” heading")
    public void theUserShouldSeeTheInventoryHeading() {
        Assert.assertEquals(project4Page.inventoryHeading.getText(), "Inventory");
    }

    @And("the user should see the table with the headers below")
    public void theUserShouldSeeTheTableWithTheHeadersBelow(DataTable dataTable) {
        //List<String> expectedText = dataTable.asList();
      //  for(int i = 0; i < expectedText.size(); i++){
          //  Assert.assertEquals(expectedText.get(i), project4Page.tableHeaders.get(i).getText());
        }


    @And("the user should see the table with the rows below")
    public void theUserShouldSeeTheTableWithTheRowsBelow() {

        Assert.assertEquals("1", project4Page.tableRowOneColumnOne.getText());
        Assert.assertEquals("iPhone", project4Page.tableRowOneColumnTwo.getText());
        Assert.assertEquals("1,000", project4Page.tableRowOneColumnThree.getText());
        Assert.assertEquals("1,000", project4Page.tableRowOneColumnFour.getText());
        Assert.assertEquals("3", project4Page.tableRowTwoColumnOne.getText());
        Assert.assertEquals("Airpods", project4Page.tableRowTwoColumnTwo.getText());
        Assert.assertEquals("100", project4Page.tableRowTwoColumnThree.getText());
        Assert.assertEquals("300", project4Page.tableRowTwoColumnFour.getText());
        Assert.assertEquals("2", project4Page.tableRowThreeColumnOne.getText());
        Assert.assertEquals("iPad", project4Page.tableRowThreeColumnTwo.getText());
        Assert.assertEquals("500", project4Page.tableRowThreeColumnThree.getText());
        Assert.assertEquals("1,000", project4Page.tableRowThreeColumnFour.getText());
    }

    @And("the user should see the “ADD PRODUCT” button is enabled")
    public void theUserShouldSeeTheADDPRODUCTButtonIsEnabled() {
        Assert.assertTrue(project4Page.addProductButton.isEnabled());
    }

    @And("the user should see the “Total = $” text displayed")
    public void theUserShouldSeeTheTotal$TextDisplayed() {
        Assert.assertEquals(project4Page.total.getText(), "Total = $2,300");
    }

    @When("the user clicks on the “ADD PRODUCT” button")
    public void theUserClicksOnTheADDPRODUCTButton() {
        project4Page.addProductButton.click();
    }

    @Then("the user should see the “Add New Product” modal with its heading")
    public void theUserShouldSeeTheAddNewProductModalWithItsHeading() {
        Assert.assertEquals(project4Page.addNewProductModalHeading.getText(), "Add New Product");
    }

    @And("the user should see the “X” button is enabled")
    public void theUserShouldSeeTheXButtonIsEnabled() {
        Assert.assertTrue(project4Page.closeButton.isEnabled());
    }

    @And("the user should see the “Please select the quantity” label")
    public void theUserShouldSeeThePleaseSelectTheQuantityLabel() {
        Assert.assertEquals(project4Page.quantityLabel.getText(), "Please select the quantity");
    }

    @And("the user should see the “Quantity” input box is enabled")
    public void theUserShouldSeeTheQuantityInputBoxIsEnabled() {
        Assert.assertTrue(project4Page.quantityInputBox.isEnabled());
    }

    @And("the user should see the “Please enter the name of the product” label")
    public void theUserShouldSeeThePleaseEnterTheNameOfTheProductLabel() {
        Assert.assertEquals(project4Page.productNameLabel.getText(), "Please enter the name of the product");
    }

    @And("the user should see the “Product” input box is enabled")
    public void theUserShouldSeeTheProductInputBoxIsEnabled() {
        Assert.assertTrue(project4Page.productNameInputBox.isEnabled());
    }

    @And("the user should see the “Please enter the price of the product” label")
    public void theUserShouldSeeThePleaseEnterThePriceOfTheProductLabel() {
        Assert.assertEquals(project4Page.productPriceLabel.getText(), "Please enter the price of the product");
    }

    @And("the user should see the “Price” input box is enabled")
    public void theUserShouldSeeThePriceInputBoxIsEnabled() {
        Assert.assertTrue(project4Page.productPriceInputBox.isEnabled());
    }

    @And("the user should see the “SUBMIT” button is enabled")
    public void theUserShouldSeeTheSUBMITButtonIsEnabled() {
        Assert.assertTrue(project4Page.submitButton.isEnabled());
    }

    @When("the user clicks on the “X” button")
    public void theUserClicksOnTheXButton() {
        project4Page.closeButton.click();
    }

    @Then("the user should not see the “Add New Product” modal")
    public void theUserShouldNotSeeTheAddNewProductModal() {
        try{
            Assert.assertFalse(project4Page.addNewProductModalHeading.isDisplayed());
        }
        catch (NoSuchElementException e){
            Assert.assertTrue(true);
        }
    }

    @And("the user enters the quantity as “”")
    public void theUserEntersTheQuantityAs() {
        project4Page.quantityInputBox.sendKeys("2");
    }

    @And("the user enters the product as “”")
    public void theUserEntersTheProductAsMouse() {
        project4Page.productNameInputBox.sendKeys("Mouse");
    }

    @And("the user enters the price as “”")
    public void theUserEntersThePriceAs() {
        project4Page.productPriceInputBox.sendKeys("100");
    }

    @And("the user clicks on the “SUBMIT” button")
    public void theUserClicksOnTheSUBMITButton() {
        project4Page.submitButton.click();
    }

    @Then("the user should see the table with the new row below")
    public void theUserShouldSeeTheTableWithTheNewRowBelow() {
        Assert.assertEquals("2", project4Page.tableRowFourColumnOne.getText());
        Assert.assertEquals("Mouse", project4Page.tableRowFourColumnTwo.getText());
        Assert.assertEquals("100", project4Page.tableRowFourColumnThree.getText());
        Assert.assertEquals("200", project4Page.tableRowFourColumnFour.getText());

    }


    @And("the user should see the “Total = ${int}” text displayed")
    public void theUserShouldSeeTheTotal$TextDisplayed(int total) {
        Assert.assertEquals(project4Page.total.getText(), "Total = $2,500");
    }

}
