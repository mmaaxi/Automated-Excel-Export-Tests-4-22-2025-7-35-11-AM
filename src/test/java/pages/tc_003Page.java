package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ExcelUtils;

public class tc_003Page {
    WebDriver driver;
    By exportButton = By.id("export-button-id"); // Example locator for export button

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToReportsPage() {
        // Code to navigate to the reports page
        driver.get("url-to-reports-page");
    }

    public void exportExcel() {
        // Code to click on export Excel button and handle download
        WebElement exportBtn = driver.findElement(exportButton);
        exportBtn.click();
    }

    public boolean isExcelDownloadedSuccessfully() {
        // Code to verify Excel is downloaded successfully
        return ExcelUtils.isFileDownloaded("expected-file-path");
    }

    public void compareStateColumnWithFigureAndID(int figura, int id) {
        // Code to open and compare the column 'estado' in the downloaded Excel with given figure and ID
        ExcelUtils.compareExcelData("expected-file-path", figura, id);
    }

    public boolean verifyStateDataIsAccurate() {
        // Code to verify the state data
        return ExcelUtils.isDataAccurate();
    }
}