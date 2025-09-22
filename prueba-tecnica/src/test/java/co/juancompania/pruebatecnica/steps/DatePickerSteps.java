package co.juancompania.pruebatecnica.steps;

import co.juancompania.pruebatecnica.pages.DatePickerPage;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class DatePickerSteps {

    DatePickerPage datePickerPage;

    @Given("abro la página principal")
    public void abrirPagina() {
        datePickerPage.abrirPagina();
    }

    @When("cambio al iframe del calendario")
    public void cambiarIframe() {
        datePickerPage.cambiarAlIframe();
    }

    @When("hago clic en el campo de fecha")
    public void clicCampo() {
        datePickerPage.hacerClickCampoFecha();
    }

    @When("selecciono el día {string}")
    public void seleccionarDia(String dia) {
        datePickerPage.seleccionarDia(dia);
    }

    @When("navego al próximo mes")
    public void navegarMes() {
        datePickerPage.navegarProximoMes();
    }

    @Then("verifico que la fecha aparece en el campo de texto")
    public void verificarFecha() {
        assertNotNull(datePickerPage.obtenerFechaSeleccionada());
    }

    @When("intento ingresar fecha manualmente")
    public void intentarManual() {
        datePickerPage.intentarEditarManual("2025-12-25");
    }

    @Then("verifico que no se puede editar")
    public void verificarNoEditable() {
        assertFalse(datePickerPage.campoEditable());
    }
}