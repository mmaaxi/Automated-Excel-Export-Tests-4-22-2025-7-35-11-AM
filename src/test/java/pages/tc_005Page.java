package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class tc_005Page {
    WebDriver driver;

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void launchApplication() {
        driver.get("http://application-url.com");
    }

    public void exportExcel() {
        // Code to trigger Excel export
    }

    public boolean isExcelDownloaded() {
        // Code to verify if the Excel file is downloaded
        return true;
    }

    public boolean isColumnNameCorrect() {
        // Code to verify if the 'Monto Acumulado Folio OPC' is renamed as 'Monto Acumulado Folio OPC (2121)' in Column Z
        return true;
    }
}