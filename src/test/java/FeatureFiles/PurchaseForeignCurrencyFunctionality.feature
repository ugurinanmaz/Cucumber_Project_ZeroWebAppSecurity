Feature:  Purchase Foreign Currency Functionality Test

  Background: Login And Navigate to Pay Bills
    Given user navigate to the zero app
    When enter username and password and click login button
    Then user should login successfully
    When  user go to online Banking more services
    Then user click Pay Bills

  Scenario Outline: Foreign Currency Functionality Test
    When user click Purchase Foreign Currency
    Then user should be able to select Currency with USD radio button
    And user enter amount "<Amount>"
#    Then user click Calculate Cost button and verify Conversion Amount
    When user click Purchase Button
    Then user should be able to see success message

    Examples:
      | Amount |
      | 100    |