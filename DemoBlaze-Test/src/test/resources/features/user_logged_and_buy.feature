Feature: As a Demoblaze store customer
  I need to view the prices of products in the Laptops category
  In order to make purchasing decisions

  Background:
    Given the user is on the homepage of "https://www.demoblaze.com/index.html"

  @buyPhone
  Scenario:Buy Phone
    Given User is in the Demo HomePage and Logged
      | username | password   |
      | teo4050  | Entra@2020 |
    When User buy And Enter Data
      | name  | country   | city  | cardnumber       | mounth | year |
      | Elver | Grolandia | miami | 1234852478916574 | abril  | 1999 |
    Then User pays his buy and see the message confirm 'Thank you for your purchase!'

  @listOfLaptops
  Scenario: Filtre By Laptops
    When the user clicks on the Laptops button
    Then the system displays the products filtered by Laptops

  @listOfPhones
  Scenario: Filtre By Phone
    When the user clicks on the Phone button
    Then the system displays the products filtered by Phone

  @listOfMonitor
  Scenario: Filtre By Monitor
    When the user clicks on the listOfMonitor button
    Then the system displays the products filtered by list Of Monitor

  @LoginAndSelectProduct
  Scenario: Validate the correct functionality of login and product selection
    When the user logs in and clicks on the Laptops button and selects a product
      | username | password |
      | teo3030 | Entra@2020 |
    Then the system should load the selected product and the "Add to cart" button should appear