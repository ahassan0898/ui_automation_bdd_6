package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.DataTable;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.EtsyPage;
import pages.WikiPage;
import utils.Driver;

import java.util.List;

public class EtsySteps {

    WebDriver driver;
    EtsyPage etsyPage;


    @Before
    public void setDriver(){
        driver = Driver.getDriver();
        etsyPage = new EtsyPage();
    }

    @Then("user should see below menu item links")
    public void user_should_see_below_menu_item_links(DataTable dataTable) {
      //  List<String> expected = dataTable.asList();

     //   for (int i = 0; i < expected.size(); i++) {
         //   Assert.assertEquals(expected.get(i), etsyPage.navigationBar.get(i).getText());
        }
    }

