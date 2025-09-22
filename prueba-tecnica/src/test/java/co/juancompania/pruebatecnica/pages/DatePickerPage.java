package co.juancompania.pruebatecnica.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DatePickerPage extends PageObject {

    private By iframeCalendario = By.cssSelector(".demo-frame");
    private By campoFecha = By.id("datepicker");
    private By botonSiguienteMes = By.cssSelector(".ui-datepicker-next");

    public void abrirPagina() {
        openUrl("https://jqueryui.com/datepicker/");
    }

    public void cambiarAlIframe() {
        WebElement iframe = find(iframeCalendario); // find devuelve WebElement
        getDriver().switchTo().frame(iframe);
    }

    public void hacerClickCampoFecha() {
        find(campoFecha).click();
    }

    public void seleccionarDia(String dia) {
        WebElement diaElemento = getDriver().findElement(By.xpath("//a[text()='" + dia + "']"));
        diaElemento.click();
    }

    public void navegarProximoMes() {
        find(botonSiguienteMes).click();
    }

    public String obtenerFechaSeleccionada() {
        return find(campoFecha).getValue();
    }

    public void intentarEditarManual(String fecha) {
        find(campoFecha).sendKeys(fecha);
    }

    public boolean campoEditable() {
        return find(campoFecha).isEnabled();
    }
}