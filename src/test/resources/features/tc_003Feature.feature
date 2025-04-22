Feature: Validar la actualización de la columna 'estado' en el archivo Excel descargado

  Scenario: Comparar datos de la columna 'estado' en Excel con una figura y ID específicos
    Given El usuario ha iniciado sesión y está en la página de reportes
    When El usuario exporta el Excel con datos de prueba
    Then El Excel se descarga sin errores
    And El usuario compara los datos de la columna 'estado' con la figura 3 y ID 11
    Then Los datos se muestran y presentan conforme a lo esperado