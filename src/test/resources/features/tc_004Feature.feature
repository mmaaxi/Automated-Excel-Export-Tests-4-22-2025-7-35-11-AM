Feature: Validación de la columna "Monto acumulado Folio Reserva 5401"

  Scenario: Verificar la columna "Monto acumulado Folio Reserva 5401" en el Excel exportado
    Given El usuario ha exportado el archivo Excel
    When Revisa la columna ubicada a la derecha de "Monto (reserva)"
    Then La columna "Monto acumulado Folio Reserva 5401" se muestra correctamente

  Scenario: Validar la fórmula de acumulación en "Monto acumulado Folio Reserva 5401"
    Given El Excel exportado está disponible
    When Verifica que la fórmula suma el acumulado anterior y el monto de reserva actual
    Then La acumulación se realiza correctamente en secuencia