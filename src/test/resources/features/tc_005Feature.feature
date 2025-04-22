Feature: Validate renaming of 'Monto Acumulado Folio OPC'

  Scenario: Verify Excel export and column naming
    Given the application is launched
    When the user exports the Excel
    Then the Excel is downloaded successfully
    And the user checks the Column Z for 'Monto Acumulado Folio OPC' renamed as 'Monto Acumulado Folio OPC (2121)'
    And the column name is correct according to specification