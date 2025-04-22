package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_009Page;

public class tc_009Steps {
    tc_009Page page = new tc_009Page();

    @Given("Estoy en el ambiente con la versión actualizada")
    public void estoy_en_el_ambiente_con_la_version_actualizada() {
        page.irAlAmbienteActualizado();
    }

    @When("Realizo la exportación del Excel")
    public void realizo_la_exportacion_del_excel() {
        page.exportarExcel();
    }

    @Then("El Excel exportado muestra todas las modificaciones sin afectar otros reportes o funcionalidades")
    public void el_excel_exportado_muestra_todas_las_modificaciones_sin_afectar_otros_reportes_o_funcionalidades() {
        page.verificarModificacionesEnExcel();
    }

    @When("Valido las integraciones con otros módulos relacionados")
    public void valido_las_integraciones_con_otros_modulos_relacionados() {
        page.validarIntegraciones();
    }

    @Then("El sistema continúa operando sin errores después de la exportación")
    public void el_sistema_continua_operando_sin_errores_despues_de_la_exportacion() {
        page.verificarOperacionSistema();
    }
}