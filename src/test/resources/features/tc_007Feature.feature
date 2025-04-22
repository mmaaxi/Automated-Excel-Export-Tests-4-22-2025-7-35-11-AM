Feature: Validar la fórmula actualizada para 'Monto Acumulado Folio OPC (2121)' en movimientos de pago

  Scenario: Verificar que la fórmula y los valores se exporten y calculen correctamente
    Given El usuario exporta el archivo Excel de movimientos de pago
    When El usuario revisa la celda correspondiente a 'Monto Acumulado Folio OPC (2121)'
    Then La celda se descarga con datos
    When El usuario confirma que la fórmula =Z4+AD5+AE5+AH5+AC5+AB5+AM5 se aplica correctamente
    And Suma los montos de Descuento, IVA descuento, ISR, Impuesto cedular, IVA acumulable y IVA retenido
    Then La suma de los valores se efectúa de forma correcta y aritmética