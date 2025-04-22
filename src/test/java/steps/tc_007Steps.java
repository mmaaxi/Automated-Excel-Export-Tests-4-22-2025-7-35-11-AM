package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import pages.tc_007Page;

public class tc_007Steps {

    tc_007Page page = new tc_007Page();

    @Given("El usuario exporta el archivo Excel de movimientos de pago")
    public void exportaArchivoExcel() {
        page.exportarExcel();
    }

    @When("El usuario revisa la celda correspondiente a 'Monto Acumulado Folio OPC (2121)'")
    public void revisaCeldaMontoAcumulado() {
        assertTrue(page.celdaTieneDatos());
    }

    @Then("La celda se descarga con datos")
    public void validaCeldaConDatos() {
        assertTrue(page.datosDescargados());
    }

    @When("El usuario confirma que la fórmula =Z4+AD5+AE5+AH5+AC5+AB5+AM5 se aplica correctamente")
    public void confirmaFormulaCorrecta() {
        assertTrue(page.fomulaAplicadaCorrectamente());
    }

    @When("Suma los montos de Descuento, IVA descuento, ISR, Impuesto cedular, IVA acumulable y IVA retenido")
    public void sumaMontos() {
        assertTrue(page.sumaMontosCorrecta());
    }

    @Then("La suma de los valores se efectúa de forma correcta y aritmética")
    public void validaSumaCorrecta() {
        assertTrue(page.resultadoCorrecto());
    }
}