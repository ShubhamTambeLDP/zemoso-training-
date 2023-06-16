
Feature: Amazon with login
  Background:
    Given user is on Amazon landing page
    When user clicks on signIn button
    And user gets the title of the Login page
    And Login page title should be "Amazon Sign In"
    When user enters "validUsername" in username field
    And User clicks on continue button
    And user enters "validPassword" in password field
    And User clicks on login button
    Then user is on home page

  Scenario: Check first displayed item delivery date
    When User clicks on All menu
    And User clicks on mobiles
    And User clicks on AllMobilePhones
    And User clicks on Prime Checkbox
    Then user gets the title of the page
    And page title should be "Amazon.in"
    And user gets the first displayed item delivery date

  Scenario: Check your orders and select Past one year order
    When User clicks on Account
    And User clicks on Your Orders
    Then user gets the title of the page
    And page title should be "Your Order"
    When User clicks on dropdown
    And User select Past one year order
    Then User checks the Past one year order details

  Scenario: verify payment option is added
    When User clicks on Account
    And User clicks on Payment Option
    Then user gets the title of the page
    And page title should be "Manage Payment Methods"
    When user clicks on navigate Back
    Then User is displayed Your Account page

  Scenario: verify the address is added
    When User clicks on Account
    And User clicks on Your Addresses
    And User clicks on Add Address
    And User enters Full Name "Manisha gaikwad"
    And User enters Mobile number "1234567890"
    And User enters Pin code "411037"
    And User enters Flat number "E-56 Bhagya Nagri 2, Mahesh Society, Bibwewadi"
    And User enters Sector number "Bibwewadi"
    And User scrolls down to footer of the page
    And User clicks on Submit Address button
    Then User gets the Address
    And User is displayed new added Address



















