Feature: TransferGo rate Check

  Scenario: Validate Recieving Amounf is in range
    Given I accept cookies
    When I Select Sending From Country as "France"
    And Set Sending From amounf as "100"


