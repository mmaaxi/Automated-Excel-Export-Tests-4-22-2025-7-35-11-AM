Feature: Validate inclusion of 'Estado Código' column

  Scenario: Verify the successful addition of 'Estado Código' column in the Excel export
    Given I am on the Claim module page
    When I export the Excel file
    Then the Excel file should be downloaded successfully
    And the 'Estado Código' column should appear to the right of column 'i'
    And the column should display the correct name 'Estado Código'