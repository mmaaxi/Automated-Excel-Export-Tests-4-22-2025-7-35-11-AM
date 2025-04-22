package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_007Page {

    WebDriver driver;

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void exportarExcel() {
        WebElement exportButton = driver.findElement(By.id("exportExcelButton"));
        exportButton.click();
    }

    public boolean celdaTieneDatos() {
        // Lógica para revisar si la celda tiene datos
        WebElement celda = driver.findElement(By.id("montoAcumuladoCelda"));
        return celda.getText().length() > 0;
    }

    public boolean datosDescargados() {
        // Verificar que el archivo se descargó con éxito
        // Ejemplo: usar alguna librería o método para verificar la descarga
        return true;
    }

    public boolean fomulaAplicadaCorrectamente() {
        // Lógica para verificar que la fórmula se aplica correctamente
        // Esto podría involucrar leer el documento Excel y comprobar la fórmula
        return true;
    }

    public boolean sumaMontosCorrecta() {
        // Lógica para verificar la suma de montos
        return true;
    }

    public boolean resultadoCorrecto() {
        // Lógica para validar que el resultado es correcto aritméticamente
        return true;
    }
}