Feature: Validar la concatenación de llave en Columna C

  Scenario: Verificar llave en la Columna C del Excel exportado
    Given el usuario abre el módulo Claim Accounting Report
    When el usuario exporta el Excel
    Then el Excel se descarga exitosamente
    And la columna C contiene la llave generada correctamente