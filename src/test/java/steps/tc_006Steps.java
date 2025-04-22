package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_006Page;
import static org.junit.Assert.assertTrue;

public class tc_006Steps {
    tc_006Page ivaPage = new tc_006Page();
    
    @Given("^el usuario ha exportado el Excel con registros que tienen IVA del 0%, exento y retenido$")
    public void exportExcelWithIVAVariants() {
        ivaPage.exportExcel();
    }

    @When("^verifica las columnas 'IVA 0%', 'IVA exento' y 'IVA retenido'$")
    public void verifyIVAVariantsColumns() {
        ivaPage.verifyColumns();
    }

    @Then("^el archivo Excel debe descargarse sin problemas$")
    public void verifyExcelDownload() {
        assertTrue(ivaPage.isExcelDownloaded());
    }
    
    @Then("^los montos de IVA deben mostrarse correctamente en las columnas correspondientes$")
    public void verifyIVAMounts() {
        assertTrue(ivaPage.areIVAMountsCorrect());
    }
}