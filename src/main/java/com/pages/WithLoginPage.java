package com.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WithLoginPage {
    private WebDriver driver;
    @FindBy(xpath = "//a[@id='nav-link-accountList']")
    private WebElement signIn;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailBox;
    @FindBy(xpath = "//input[@id='continue']")
    private WebElement next;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordBox;
    @FindBy(xpath = "//input[@id='signInSubmit']")
    private WebElement signInButton;
    //Prime checkbox
    @FindBy(id = "nav-hamburger-menu")
    private WebElement menu;
    @FindBy(xpath = "//div[text()='Mobiles, Computers']")
    private WebElement mobiles;
    @FindBy(linkText="All Mobile Phones")
    private WebElement allMobile;
    @FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[2]")
    private WebElement checkbox;
    @FindBy(xpath="//span[@class='a-color-base a-text-bold'][1]")
    private WebElement details;
    // Your Order
    @FindBy(xpath="//a[@id='nav-link-accountList']")
    private WebElement account;
    @FindBy(xpath="//div[@data-card-identifier='YourOrders']")
    private WebElement yourOrders;
    @FindBy(xpath="//span[@role='button']")
    private WebElement dropDown;
    @FindBy(xpath="//a[@id='time-filter_3']")
    private WebElement pastYear;
    //Payment Option
    @FindBy(xpath="//div[@data-card-identifier='PaymentOptions']")
    private WebElement paymentOptions;
    //Address
    @FindBy(xpath = "//div[@data-card-identifier='AddressesAnd1Click']")
    private WebElement address;
    @FindBy(xpath = "//div[@id='ya-myab-plus-address-icon']")
    private WebElement addAddress;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressFullName']")
    private WebElement fullName;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressPhoneNumber']")
    private WebElement mobileNumber;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressPostalCode']")
    private WebElement pinCode;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressLine1']")
    private WebElement flatNo;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressLine2']")
    private WebElement sector;
    @FindBy(xpath = "//input[@id='address-ui-widgets-landmark']")
    private WebElement landmark;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressCity']")
    private WebElement city;
    @FindBy(xpath = "//*[@id='address-ui-widgets-form-submit-button']/span/input")
    private WebElement submitAddress;
    @FindBy(xpath = "//div[@id='ya-myab-display-address-block-1']")
    private WebElement getAddress;

    public WithLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnHelloSignIn() {
        signIn.click();
    }

    public void enterEmailAddress(String userName) {
        emailBox.sendKeys(userName);
    }

    public void clickOnContinue() {
        next.click();
    }

    public void enterPassword(String pwd) {
        passwordBox.sendKeys(pwd);
    }

    public void clickOnLoginButton() {
        signInButton.click();
    }

    public String getLoginPageTitle() {
        return driver.getTitle();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    //Prime Checkbox
    public void clickOnALlMenu() {
        menu.click();
    }

    public void clickOnMobiles() {
        mobiles.click();
    }

    public void clickOnAllMobilePhones() {
        allMobile.click();
    }
    public void clickOnPrimeCheckbox() throws InterruptedException {
        checkbox.click();
        Thread.sleep(2000);
    }

    public String getFirstProductDeliveryDate() {
        String get =details.getText();
        return get;
    }
    // Your Order
    public void clickOnYourAccount() {
        account.click();
    }

    public void clickOnYourOrders() {
        yourOrders.click();
    }

    public void clickOnOrderDropdown() {
        dropDown.click();
    }

    public void selectPastOneYearOrder() {
        pastYear.click();
        System.out.println("Successfully Select past One year Order");
    }

    public void clickOnPaymentOptions() {
        paymentOptions.click();
    }

    public void navigateBack() {
       driver.navigate().back();
    }

    //Address
    public void clickOnYourAddress() {
        address.click();
    }

    public void clickOnAddAddress() {
        addAddress.click();
    }

    public void enterFullName(String name) {
            fullName.sendKeys(name);
    }

    public void enterMobileNumber(String number) {
            mobileNumber.sendKeys(number);
    }

    public void enterPinCode(String pinNo) {
            pinCode.sendKeys(pinNo);
    }

    public void enterFlatNo(String flatNumber) {
            flatNo.sendKeys(flatNumber);
    }

    public void enterSector(String sectorNo) {
            sector.sendKeys(sectorNo);
    }

    public void enterLandmarkName(String land) {
            landmark.sendKeys(land);
    }

    public void enterCityName(String cityName) {
            city.sendKeys(cityName);
    }

    public void scrollDown() {
            JavascriptExecutor vertical = ((JavascriptExecutor) driver);
            vertical.executeScript("scrollBy(0,500)");
    }

    public void clickOnSubmitAddress() {
            submitAddress.click();
    }

    public String getAddress() {
            String address = getAddress.getText();
            return address;
        }

}
