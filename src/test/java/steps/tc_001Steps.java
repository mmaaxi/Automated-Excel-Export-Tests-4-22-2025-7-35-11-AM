import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class tc_001Steps {
    WebDriver driver;
    tc_001Page page;

    public tc_001Steps() {
        driver = Hooks.getDriver();
        page = new tc_001Page(driver);
    }

    @Given("el usuario abre el módulo Claim Accounting Report")
    public void abrirModuloClaimAccountingReport() {
        page.navigateToClaimAccountingReport();
    }

    @When("el usuario exporta el Excel")
    public void exportarExcel() {
        page.exportExcel();
    }

    @Then("el Excel se descarga exitosamente")
    public void verificarDescargaExitosa() {
        Assert.assertTrue(page.isExcelDownloaded());
    }

    @Then("la columna C contiene la llave generada correctamente")
    public void verificarLlaveGenerada() {
        Assert.assertTrue(page.isKeyGeneratedCorrectly());
    }
}