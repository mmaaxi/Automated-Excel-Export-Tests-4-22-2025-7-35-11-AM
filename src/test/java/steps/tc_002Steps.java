package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_002Page;

public class tc_002Steps {
    tc_002Page claimPage = new tc_002Page();

    @Given("I am on the Claim module page")
    public void iAmOnTheClaimModulePage() {
        claimPage.navigateToClaimModule();
    }

    @When("I export the Excel file")
    public void iExportTheExcelFile() {
        claimPage.exportExcel();
    }

    @Then("the Excel file should be downloaded successfully")
    public void theExcelFileShouldBeDownloadedSuccessfully() {
        Assert.assertTrue(claimPage.isExcelDownloaded());
    }

    @Then("the 'Estado Código' column should appear to the right of column 'i'")
    public void theEstadoCodigoColumnShouldAppearToTheRightOfColumnI() {
        Assert.assertTrue(claimPage.isEstadoCodigoColumnPresent());
    }

    @Then("the column should display the correct name 'Estado Código'")
    public void theColumnShouldDisplayTheCorrectNameEstadoCodigo() {
        Assert.assertTrue(claimPage.isEstadoCodigoColumnNamedCorrectly());
    }
}