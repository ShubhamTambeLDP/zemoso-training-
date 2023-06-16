package com.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WithoutLoginPage {
    private WebDriver driver;

    //Declaration
    @FindBy(xpath="//a[@data-csa-c-slot-id='nav_cs_4']")
    private WebElement todaysDeal;
    @FindBy(xpath="//a[@data-id='deals-collection-lightning-deals']")
    private WebElement thirdDeal;
    @FindBy(css="[data-csa-c-posx='1']")
    private WebElement product;
    @FindBy(xpath="//a[@class='a-button-text'][1]")
    private WebElement addToCart;
    //Search Mobiles
    @FindBy(id= "twotabsearchtextbox")
    private WebElement searchBox;
    @FindBy(id= "nav-search-submit-button")
    private WebElement searchButton;
    @FindBy(xpath = "(//div[@data-component-type='s-search-result'][last()]//a)[4]")
    private WebElement getDetails;
    //Navigation
    @FindBy(id = "nav-hamburger-menu")
    private WebElement menu;
    @FindBy(xpath = "//div[text()='Mobiles, Computers']")
    private WebElement mobiles;
    @FindBy(linkText="All Mobile Phones")
    private WebElement allMobile;
    @FindBy(id="nav-logo-sprites")
    private WebElement mainMenu;

    public WithoutLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnTodayDeals()  {
        todaysDeal.click();
    }

    public void clickOnThirdDeal(){
        thirdDeal.click();
    }

    public void clickOnProduct()
    {
        product.click();
    }

    public void clickOnAddToCart() {
        addToCart.click();
    }

    public void navigateToBack() {
        driver.navigate().back();
    }

    //Search Mobiles
    public void clickOnSearchBox() {
        searchBox.click();
    }

    public void enterProductName(String name) {
        searchBox.sendKeys(name);
    }

    public void clickOnSearchButton() {
        searchButton.click();
    }

    public void scrollDown() {
        JavascriptExecutor down = ((JavascriptExecutor) driver);
        down.executeScript("scrollBy(0,4000)");
    }

    public String getProductDetails() {
        String details = getDetails.getText();
        return details;
    }

    //Navigation
    public void back() {
        driver.navigate().back();
    }

    public void clickOnMainMenu() {
        mainMenu.click();
    }
}
