package stepDefinitions;


import com.pages.WithoutLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import qa.factory.DriverFactory;

public class WithoutLoginSteps {
   private static String actual_details;





    WebDriver driver;
    private WithoutLoginPage withoutLoginPage=new WithoutLoginPage(DriverFactory.getDriver());
    @Given("user is on Amazon home page")
    public void user_is_on_amazon_home_page() {
    }

    @When("user clicks on Today's Deals")
    public void user_clicks_on_today_s_deals() {
        withoutLoginPage.clickOnTodayDeals();
    }
    @When("user clicks on 3rd Deals")
    public void user_clicks_on_3rd_deals() {
        withoutLoginPage.clickOnThirdDeal();
    }
    @When("user click on the product")
    public void user_click_on_the_product() {
        withoutLoginPage.clickOnProduct();
    }

    @When("user click on the Add to Cart button")
    public void user_click_on_the_add_to_cart_button() {
        withoutLoginPage.clickOnAddToCart();
    }

    @Then("user navigate to back")
    public void user_navigate_to_back() {
        withoutLoginPage.navigateToBack();
    }

    @When("user clicks on Amazon search field")
    public void user_clicks_on_amazon_search_field() {
        withoutLoginPage.clickOnSearchBox();
    }

    @Then("list of mobiles should shown")
    public void listOfMobilesShouldShown() {


    }

    @When("user enter Item name {string}")
    public void user_enter_item_name(String name) {
        withoutLoginPage.enterProductName(name);
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() throws InterruptedException {
        withoutLoginPage.clickOnSearchButton();
        Thread.sleep(2000);
    }

    @When("User scrolls down to footers of the page")
    public void user_scrolls_down_to_footers_of_the_page() throws InterruptedException {
        withoutLoginPage.scrollDown();
        Thread.sleep(2000);
    }

    @Then("user gets the last displayed item details")
    public void user_gets_the_last_displayed_item_details() {
        actual_details  =withoutLoginPage.getProductDetails();
        System.out.println("last displayed Product details is ="+ actual_details);
    }

    @When("User clicks on Amazon logo")
    public void user_clicks_on_amazon_logo() {
        withoutLoginPage.clickOnMainMenu();



    }


}
