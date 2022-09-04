Feature:  Transfer Funds Functionality Test

  Background: Login And Navigate to Pay Bills
    Given user navigate to the zero app
    When enter username and password and click login button
    Then user should login successfully
    When  user go to online Banking more services
    Then user click Pay Bills

  Scenario Outline: Transfer Funds Functionality Test
    When user click Transfer Funds
    When user select "<FromAccountValue>" From Account drop down menu
    And user select "<ToAccountValue>" To Account drop down menu
    And user enter amount "<Amount>" in Transfer Fund page
#    Then user click Calculate Cost button and verify Conversion Amount
    When user click Continue Button and Submit
    Then user should be able to see success message

    Examples:
      | FromAccountValue | ToAccountValue | Amount |
      | 2                | 2              | 1000   |
#      | 2                | 2              | 2100   |
#      | 3                | 3              | 3200   |
#      | 4                | 4              | 2400   |