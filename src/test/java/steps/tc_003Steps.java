package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_003Page;

public class tc_003Steps {
    tc_003Page page = new tc_003Page();

    @Given("El usuario ha iniciado sesión y está en la página de reportes")
    public void el_usuario_ha_iniciado_sesión_y_está_en_la_página_de_reportes() {
        page.navigateToReportsPage();
    }
    
    @When("El usuario exporta el Excel con datos de prueba")
    public void el_usuario_exporta_el_excel_con_datos_de_prueba() {
        page.exportExcel();
    }

    @Then("El Excel se descarga sin errores")
    public void el_excel_se_descarga_sin_errores() {
        Assert.assertTrue(page.isExcelDownloadedSuccessfully());
    }

    @When("El usuario compara los datos de la columna 'estado' con la figura {int} y ID {int}")
    public void el_usuario_compara_los_datos_de_la_columna_estado_con_la_figura_y_ID(int figura, int id) {
        page.compareStateColumnWithFigureAndID(figura, id);
    }

    @Then("Los datos se muestran y presentan conforme a lo esperado")
    public void los_datos_se_muestran_y_presentan_conforme_a_lo_esperado() {
        Assert.assertTrue(page.verifyStateDataIsAccurate());
    }
}