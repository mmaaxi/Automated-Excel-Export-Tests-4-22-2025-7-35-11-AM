Feature: Pruebas de regresión y validación de integración

  Scenario: Validar exportación de Excel e integraciones
    Given Estoy en el ambiente con la versión actualizada
    When Realizo la exportación del Excel
    Then El Excel exportado muestra todas las modificaciones sin afectar otros reportes o funcionalidades
    And Valido las integraciones con otros módulos relacionados
    Then El sistema continúa operando sin errores después de la exportación