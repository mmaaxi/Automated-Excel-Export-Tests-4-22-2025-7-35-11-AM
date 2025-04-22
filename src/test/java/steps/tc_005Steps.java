package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_005Page;

public class tc_005Steps {
    tc_005Page excelPage = new tc_005Page();

    @Given("the application is launched")
    public void applicationIsLaunched() {
        excelPage.launchApplication();
    }

    @When("the user exports the Excel")
    public void userExportsExcel() {
        excelPage.exportExcel();
    }

    @Then("the Excel is downloaded successfully")
    public void excelDownloadedSuccessfully() {
        Assert.assertTrue(excelPage.isExcelDownloaded());
    }

    @Then("the user checks the Column Z for 'Monto Acumulado Folio OPC' renamed as 'Monto Acumulado Folio OPC (2121)'")
    public void checkColumnRename() {
        Assert.assertTrue(excelPage.isColumnNameCorrect());
    }

    @Then("the column name is correct according to specification")
    public void columnSpecifiedCorrectly() {
        // Already asserted in previous step
    }
}