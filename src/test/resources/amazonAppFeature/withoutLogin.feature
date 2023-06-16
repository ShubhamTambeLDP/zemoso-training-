
Feature: Amazon Home Page

  Scenario: verify the cart if the quantity is as expected
    Given user is on Amazon home page
    When user clicks on Today's Deals
    Then user gets the title of the page
    And page title should be "Today's Deals"
    When user clicks on 3rd Deals
    And user click on the product
    And user click on the Add to Cart button
    Then user gets the title of the page
    And page title should be "Amazon Sign In"
    Then user navigate to back

  Scenario: Verify last displayed item details
    Given user is on Amazon home page
    When user clicks on Amazon search field
    And user enter Item name "Mobiles"
    And user clicks on search button
    Then list of mobiles should shown
    When User scrolls down to footers of the page
    Then user gets the last displayed item details
    And User clicks on Amazon logo
    Then user gets the title of the page
    And page title should be "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"


Scenario: Verify user should navigate main page
  When User clicks on All menu
  And User clicks on mobiles
  And User clicks on AllMobilePhones