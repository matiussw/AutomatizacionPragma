Feature:As a user of the DEMO web portal
  I want to create a new user

  @creationSuccessfulAllFields
  Scenario:Successful user creation
    Given the user is on the homepage of "https://www.demoblaze.com/index.html"
    When User Creates an account
      | username       | password   |
      | teo101010 | Entra@2020 |
    Then User account is create and can See His Username "Welcome teo101010"