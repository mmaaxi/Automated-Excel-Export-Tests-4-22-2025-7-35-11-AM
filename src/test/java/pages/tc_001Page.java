import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.nio.file.Files;
import java.nio.file.Paths;

public class tc_001Page {
    WebDriver driver;
    String downloadPath = "path/to/download";

    By claimAccountingReportModule = By.id("claimAccountingReportModule");
    By exportExcelButton = By.id("exportExcelButton");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToClaimAccountingReport() {
        driver.findElement(claimAccountingReportModule).click();
    }

    public void exportExcel() {
        driver.findElement(exportExcelButton).click();
        // wait for download to complete
    }

    public boolean isExcelDownloaded() {
        return Files.exists(Paths.get(downloadPath + "/ClaimAccountingReport.xlsx"));
    }

    public boolean isKeyGeneratedCorrectly() {
        // logic to open Excel file and verify the concatenation in column C
        // checking CONCATENATE(D, '_', H, '_', U, '_', O, '_', E) for each record
        return true; // Implement actual logic
    }
}