Feature: Login Functionality

  Scenario Outline: Test login with valid credentials
    Given I launch web browser
    And I navigate to home page
    And I click login on account menu
    Then I click login link
    When I enter <username> and <password>
    And I click login button
    When I search for item
    And I should see the items on the result
    Then User logout

    Examples:
      | username | password |
      | josephm@gmail.com  | Joseph123 |