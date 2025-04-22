package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_010Page;

import static org.junit.Assert.assertTrue;

public class tc_010Steps {
    tc_010Page exportPage = new tc_010Page();

    @Given("el usuario ha exportado un archivo Excel")
    public void el_usuario_ha_exportado_un_archivo_Excel() {
        exportPage.exportarArchivoExcel();
    }

    @When("revisa manualmente las posiciones y nombres de las columnas")
    public void revisa_manualmente_las_posiciones_y_nombres_de_las_columnas() {
        exportPage.revisarEncabezados();
    }

    @Then("todos los encabezados y fórmulas deben coincidir con la especificación del documento")
    public void todos_los_encabezados_y_fórmulas_deben_coincidir_con_la_especificación_del_documento() {
        assertTrue(exportPage.validarEncabezadosYFormulas());
    }

    @When("evalúa los registros con valores nulos, positivos y negativos")
    public void evalua_los_registros_con_valores_nulos_positivos_y_negativos() {
        exportPage.testValoresEnRegistros();
    }

    @Then("la lógica de acumulación, suma y concatenación debe aplicarse correctamente sin errores")
    public void la_logica_de_acumulacion_suma_y_concatenacion_debe_aplicarse_correctamente_sin_errores() {
        assertTrue(exportPage.validarLogicaRegistros());
    }
}