Feature: Validar la consistencia y formato de datos en el Excel exportado

  Scenario: Verificar encabezados y formato del archivo Excel exportado
    Given el usuario ha exportado un archivo Excel
    When revisa manualmente las posiciones y nombres de las columnas
    Then todos los encabezados y fórmulas deben coincidir con la especificación del documento

  Scenario: Verificar lógica de valores nulos, positivos y negativos en el Excel exportado
    Given el usuario ha exportado un archivo Excel
    When evalúa los registros con valores nulos, positivos y negativos
    Then la lógica de acumulación, suma y concatenación debe aplicarse correctamente sin errores