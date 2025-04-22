package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_004Page;
import org.junit.Assert;

public class tc_004Steps {

    tc_004Page page = new tc_004Page();

    @Given("El usuario ha exportado el archivo Excel")
    public void elUsuarioHaExportadoElArchivoExcel() {
        page.exportarExcel();
    }

    @When("Revisa la columna ubicada a la derecha de {string}")
    public void revisaLaColumnaUbicadaADerechaDe(String columnaBase) {
        Assert.assertTrue(page.verificarColumnaExistente(columnaBase, "Monto acumulado Folio Reserva 5401"));
    }

    @Then("La columna {string} se muestra correctamente")
    public void laColumnaSeMuestraCorrectamente(String columnaEsperada) {
        Assert.assertTrue(page.verificarColumnaMostradaCorrectamente(columnaEsperada));
    }

    @Given("El Excel exportado está disponible")
    public void elExcelExportadoEstaDisponible() {
        Assert.assertTrue(page.isExcelDisponible());
    }

    @When("Verifica que la fórmula suma el acumulado anterior y el monto de reserva actual")
    public void verificaFormulaDeAcumulacion() {
        Assert.assertTrue(page.verificarFormulaAcumulacion());
    }

    @Then("La acumulación se realiza correctamente en secuencia")
    public void laAcumulacionSeRealizaCorrectamenteEnSecuencia() {
        Assert.assertTrue(page.validarAcumulacionCorrecta());
    }
}