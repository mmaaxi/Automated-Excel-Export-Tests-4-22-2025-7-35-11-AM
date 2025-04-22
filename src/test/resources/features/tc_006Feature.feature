Feature: Validar las columnas relacionadas con IVA

  Scenario: Exportar el Excel con registros que contengan diferentes IVA y validar las columnas
    Given el usuario ha exportado el Excel con registros que tienen IVA del 0%, exento y retenido
    When verifica las columnas 'IVA 0%', 'IVA exento' y 'IVA retenido'
    Then el archivo Excel debe descargarse sin problemas
    And los montos de IVA deben mostrarse correctamente en las columnas correspondientes