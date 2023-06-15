package pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class WikiPage {

    WebDriver driver;

    @Before
    public void setup() {
        driver = Driver.getDriver();
    }

    @Given("user navigates to {string}")
    public void userNavigatesTo(String url) {
        driver.get(url);
    }

    @Then("user should see {string} in the url")
    public void userShouldSeeInTheUrl(String key) {
//        String newKey = driver.getCurrentUrl().replaceAll("_", " ");
//        Assert.assertTrue(newKey.contains(key));

        for (String word : key.split(" ")) {
            Assert.assertTrue(driver.getCurrentUrl().contains(word));
        }
    }

    @And("user should see {string} in the title")
    public void userShouldSeeInTheTitle(String key) {
        Assert.assertTrue(driver.getTitle().contains(key));
    }
}