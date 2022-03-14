package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.homePage;
import pageobjects.resultadoPage;

public class homeDefinition {

    homePage home;
    resultadoPage resultado;

    public homeDefinition() {
        home = new homePage();
        resultado = new resultadoPage();
    }

    @Given("que la web esta operativa")
    public void queLaWebEstaOperativa() {
        hooks.driver.get("https://pidetutarjeta.bbva.pe/");
    }

    @When("ingreso mi dni {string}, fecha de nacimiento {string} y celular {string}")
    public void ingresoMiDniFechaDeNacimientoYCelular(String dni, String fechaNacimiento, String celular) {
        home.ingresarDNI(dni);
        home.ingresarFechaNacimiento(fechaNacimiento);
        home.ingresarCell(celular);
    }

    @And("doy click en el boton DESCUBRELA")
    public void doyClickEnElBotonDESCUBRELA() {
        home.clickDescubrela();
    }

    @Then("se visualiza el mensaje {string}")
    public void seVisualizaElMensaje(String texto) {
        resultado.compararTexto(texto);
    }
}
