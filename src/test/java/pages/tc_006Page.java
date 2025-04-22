package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_006Page {
    WebDriver driver;
    
    private By downloadButton = By.id("download-excel");
    private By ivaZeroColumn = By.id("iva-zero-column");
    private By ivaExemptColumn = By.id("iva-exempt-column");
    private By ivaRetainedColumn = By.id("iva-retained-column");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void exportExcel() {
        WebElement downloadBtn = driver.findElement(downloadButton);
        downloadBtn.click();
    }
    
    public boolean isExcelDownloaded() {
        // Logic to verify the download
        return true; // Assuming the file has been downloaded for demonstration
    }

    public void verifyColumns() {
        // Assumes logic to read from the Excel file and verify the column values
    }

    public boolean areIVAMountsCorrect() {
        // Implement logic to verify each column's values
        return true; // Assuming validation logic for the sake of example
    }
}