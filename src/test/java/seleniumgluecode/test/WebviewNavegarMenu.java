package seleniumgluecode.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumgluecode.TestBase;

public class WebviewNavegarMenu extends TestBase {

    @Given("^Ingresar a la sección Forms$")
    public void ingresar_a_la_sección_Forms() throws Throwable {
        Thread.sleep(2000);
        webviewPage.clickWebViewLink();
    }

    @When("^Abrir el menu$")
    public void abrir_el_menu() throws Throwable {
        Thread.sleep(2000);
        webviewPage.clickMenuBtn();
    }

    @Then("^Navegar por las opciones$")
    public void navegar_por_las_opciones() throws Throwable {
        Thread.sleep(1000);
        webviewPage.selectSectionDoc();
    }





}
