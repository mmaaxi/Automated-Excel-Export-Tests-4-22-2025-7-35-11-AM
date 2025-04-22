package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_008Page;

public class tc_008Steps {

    WebDriver driver;
    tc_008Page exportPage = new tc_008Page(driver);

    @Given("El usuario está en la página de exportación")
    public void el_usuario_está_en_la_página_de_exportación() {
        exportPage.navigateToExportPage();
    }

    @When("El usuario exporta el Excel")
    public void el_usuario_exporta_el_excel() {
        Assert.assertTrue("El Excel no se descargó exitosamente", exportPage.exportExcel());
    }

    @Then("El Excel se descarga exitosamente")
    public void el_excel_se_descarga_exitosamente() {
        Assert.assertTrue("El archivo Excel no fue descargado", exportPage.verifyExcelDownloaded());
    }

    @And("Se verifica que la columna 'Folio Pre solicitud' aparece a la derecha de 'Ramo'")
    public void verificar_columna_folio_pre_solicitud() {
        Assert.assertTrue("La columna 'Folio Pre solicitud' no está en la posición correcta", exportPage.verifyFolioPreSolicitudColumnPosition());
    }

    @And("La columna 'Folio de Pago' aparece a la derecha de 'Folio Pre Solicitud'")
    public void verificar_columna_folio_de_pago() {
        Assert.assertTrue("La columna 'Folio de Pago' no está en la posición correcta", exportPage.verifyFolioDePagoColumnPosition());
    }

    @And("La columna 'Status Pago Código' aparece a la derecha de 'Fecha de Pago'")
    public void verificar_columna_status_pago_codigo() {
        Assert.assertTrue("La columna 'Status Pago Código' no está en la posición correcta", exportPage.verifyStatusPagoCodigoColumnPosition());
    }

    @And("La columna 'Status de Pago' se renombra a 'Descripción Status Pago'")
    public void verificar_renombramiento_de_columna_status() {
        Assert.assertTrue("La columna 'Status de Pago' no fue renombrada correctamente", exportPage.verifyStatusPagoColumnRenamed());
    }
}