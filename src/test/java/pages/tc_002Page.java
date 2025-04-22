package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {
    WebDriver driver;

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToClaimModule() {
        // Code to navigate to the Claim module page
    }

    public void exportExcel() {
        // Code to trigger the export of the Excel file
    }

    public boolean isExcelDownloaded() {
        // Code to verify if the Excel file is downloaded successfully
        // Example check could be presence in a specific download directory
        return true;
    }

    public boolean isEstadoCodigoColumnPresent() {
        // Code to verify the 'Estado Código' column is present in the downloaded Excel
        return true;
    }

    public boolean isEstadoCodigoColumnNamedCorrectly() {
        // Code to check if 'Estado Código' has the correct name in the Excel
        return true;
    }
}