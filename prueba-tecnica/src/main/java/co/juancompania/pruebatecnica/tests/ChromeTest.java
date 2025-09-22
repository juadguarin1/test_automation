package co.juancompania.pruebatecnica.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

    public static void main(String[] args) {
        // 1. Configura la ruta correcta de ChromeDriver
        System.setProperty("webdriver.chrome.driver", 
            "C:/Users/Juan Diego/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");

        // 2. Inicializa Chrome
        WebDriver driver = new ChromeDriver();

        // 3. Abre la página de prueba
        driver.get("https://jqueryui.com/datepicker/");

        // 4. Espera 5 segundos para que veas Chrome abierto
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 5. Cierra el navegador
        driver.quit();
    }
}