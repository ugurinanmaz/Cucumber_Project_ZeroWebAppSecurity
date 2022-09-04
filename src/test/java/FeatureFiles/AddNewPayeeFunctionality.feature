Feature: Add new Payee Functionality Test

  Background: Login And Navigate to Pay Bills
    Given user navigate to the zero app
    When enter username and password and click login button
    Then user should login successfully
    When  user go to online Banking more services
    Then user click Pay Bills


  Scenario Outline: Add new Payee positive test
    When user click Add New Payee
    And user enter "<PayeeName>", "<PayeeAddress>", "<Account>" fields
    Then user should be able to see success message

    Examples:
      | PayeeName | PayeeAddress | Account   |
      | Alex      | New York     | 123123123 |
      | Robert    | Texas        | 987987987 |
      | Tom       | Utah         | 456654456 |

  Scenario Outline: Add new Payee negative test
    When user click Add New Payee
    And user enter "<PayeeName>", "<PayeeAddress>", "<Account>" fields
    Then user should see warning message

    Examples:
      | PayeeName | PayeeAddress | Account   |
      |           | New York     | 123123123 |
      | Robert    |              | 987987987 |
      | Tom       | Utah         |           |
