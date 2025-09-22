package co.juancompania.pruebatecnica.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",  // carpeta donde están los .feature
        glue = "co.juancompania.pruebatecnica.steps", // package de tus Steps
        plugin = {"pretty"}  // formato legible en consola
)
public class DatePickerRunner {
    // No necesita código adicional
}

