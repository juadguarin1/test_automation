package co.juancompania.pruebatecnica.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTestCorto {
    public static void main(String[] args) {
        // 1️⃣ Configura la ruta a tu ChromeDriver
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Juan Diego/Downloads/chromedriver-win64/chromedriver.exe");

        // 2️⃣ Inicializa ChromeDriver
        WebDriver driver = new ChromeDriver();

        // 3️⃣ Abre Google para validar que funciona
        driver.get("https://www.google.com");

        // 4️⃣ Imprime el título de la página en consola
        System.out.println("Título de la página: " + driver.getTitle());

        // 5️⃣ Cierra el navegador
        driver.quit();
    }
}
