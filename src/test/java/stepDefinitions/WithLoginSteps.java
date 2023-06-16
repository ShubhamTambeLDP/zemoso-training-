package stepDefinitions;

import com.pages.WithLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import qa.factory.DriverFactory;
import qa.util.ConfigReader;

import java.util.Properties;

public class WithLoginSteps {
    private static String loginPageTitle;
    private static String title;

    private static String actual_date;
    private static ConfigReader configReader;
    Properties prop;
    private WithLoginPage withLoginPage = new WithLoginPage(DriverFactory.getDriver());

    @Given("user is on Amazon landing page")
    public void user_is_on_amazon_landing_page() {
    }

    @When("user clicks on signIn button")
    public void user_clicks_on_sign_in_button() {
        withLoginPage.clickOnHelloSignIn();
    }

    @Then("user gets the title of the Login page")
    public void user_gets_the_title_of_the_login_page() {
        loginPageTitle = withLoginPage.getLoginPageTitle();
        System.out.println("Page title is: " + loginPageTitle);
    }

    @Then("Login page title should be {string}")
    public void login_page_title_should_be(String expectedTitleName) {
        Assert.assertTrue(loginPageTitle.contains(expectedTitleName));
    }
    @When("user enters {string} in username field")
    public void user_enters_in_username_field(String validUsername) {
        configReader = new ConfigReader();
        prop = configReader.init_prop();
        String userName = prop.getProperty(validUsername);
        withLoginPage.enterEmailAddress(userName);
    }

    @When("User clicks on continue button")
    public void user_clicks_on_continue_button() {
        withLoginPage.clickOnContinue();
    }

    @When("user enters {string} in password field")
    public void user_enters_in_password_field(String validPassword) {
        String password = prop.getProperty(validPassword);
        withLoginPage.enterPassword(password);
    }

    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        withLoginPage.clickOnLoginButton();
    }

    @Then("user is on home page")
    public void user_is_on_home_page() {
    }

    @When("User clicks on All menu")
    public void user_clicks_on_all_menu() {
        withLoginPage.clickOnALlMenu();
    }

    @When("User clicks on mobiles")
    public void user_clicks_on_mobiles() {
        withLoginPage.clickOnMobiles();
    }

    @When("User clicks on AllMobilePhones")
    public void user_clicks_on_all_mobile_phones() {
        withLoginPage.clickOnAllMobilePhones();
    }

    @When("User clicks on Prime Checkbox")
    public void user_clicks_on_prime_checkbox() throws InterruptedException {
        withLoginPage.clickOnPrimeCheckbox();
    }

    @Then("user gets the title of the page")
    public void user_gets_the_title_of_the_page() {
        title = withLoginPage.getPageTitle();
        System.out.println("Page title is: " + title);
    }

    @Then("page title should be {string}")
    public void page_title_should_be(String expectedTitleName) {
        Assert.assertTrue(title.contains(expectedTitleName));
    }

    @Then("user gets the first displayed item delivery date")
    public void user_gets_the_first_displayed_item_delivery_date() {
        actual_date = withLoginPage.getFirstProductDeliveryDate();
        System.out.println("First Product Delivery Date is =" + actual_date);
    }

    @When("User clicks on Account")
    public void user_clicks_on_account() {
        withLoginPage.clickOnYourAccount();
    }

    @When("User clicks on Your Orders")
    public void user_clicks_on_your_orders() {
        withLoginPage.clickOnYourOrders();
    }

    @When("User clicks on dropdown")
    public void user_clicks_on_dropdown() {
        withLoginPage.clickOnOrderDropdown();
    }

    @When("User select Past one year order")
    public void user_select_past_one_year_order() {
        withLoginPage.selectPastOneYearOrder();
    }

    @Then("User checks the Past one year order details")
    public void user_checks_the_past_one_year_order_details() {

    }

    @When("User clicks on Payment Option")
    public void user_clicks_on_payment_option() {
        withLoginPage.clickOnPaymentOptions();
    }

    @When("user clicks on navigate Back")
    public void user_clicks_on_navigate_back() {
        withLoginPage.navigateBack();
    }


    @Then("User is displayed Your Account page")
    public void user_is_displayed_your_account_page(){

    }

    @When("User clicks on Your Addresses")
    public void user_clicks_on_your_addresses() {
        withLoginPage.clickOnYourAddress();
    }

    @When("User clicks on Add Address")
    public void user_clicks_on_add_address() {
        withLoginPage.clickOnAddAddress();
    }

    @When("User enters Full Name {string}")
    public void user_enters_full_name(String name) {
        withLoginPage.enterFullName(name);
    }

    @When("User enters Mobile number {string}")
    public void user_enters_mobile_number(String number) {
        withLoginPage.enterMobileNumber(number);
    }

    @When("User enters Pin code {string}")
    public void user_enters_pin_code(String pinNo) {
        withLoginPage.enterPinCode(pinNo);
    }

    @When("User enters Flat number {string}")
    public void user_enters_flat_number(String flatNumber) {
        withLoginPage.enterFlatNo(flatNumber);
    }

    @When("User enters Sector number {string}")
    public void user_enters_sector_number(String sectorNo) {
        withLoginPage.enterSector(sectorNo);
    }

    @When("User enters landmark name {string}")
    public void user_enters_landmark_name(String land) {
        withLoginPage.enterLandmarkName(land);
    }
    @When("User scrolls down to footer of the page")
    public void user_scrolls_down_to_footer_of_the_page() {
        withLoginPage.scrollDown();
    }
    @When("User clicks on Submit Address button")
    public void user_clicks_on_submit_address_button() {
        withLoginPage.clickOnSubmitAddress();
    }

    @Then("User gets the Address")
    public void user_gets_the_address() {
        String actual_address = withLoginPage.getAddress();
        String expected_address = "Manisha gaikwad\n" +
                "E-56 Bhagya Nagri 2, Mahesh Society, Bibwewadi\n" +
                "Bibwewadi\n" +
                "PUNE, MAHARASHTRA 411037\n" +
                "India\n" +
                "Phone number: \u202A1234567890\u202C\n" +
                "Add delivery instructions";
        Assert.assertEquals(expected_address, actual_address);
    }

    @Then("User is displayed new added Address")
    public void user_is_displayed_new_added_address() {

    }

}
