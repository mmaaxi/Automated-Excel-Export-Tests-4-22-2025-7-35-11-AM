Feature: Validar la inclusión de nuevas columnas sin valores (HU 3676803)

  Scenario: Validar Exportación de Excel con nuevas columnas
    Given El usuario está en la página de exportación
    When El usuario exporta el Excel
    Then El Excel se descarga exitosamente
    And Se verifica que la columna 'Folio Pre solicitud' aparece a la derecha de 'Ramo'
    And La columna 'Folio de Pago' aparece a la derecha de 'Folio Pre Solicitud'
    And La columna 'Status Pago Código' aparece a la derecha de 'Fecha de Pago'
    And La columna 'Status de Pago' se renombra a 'Descripción Status Pago'