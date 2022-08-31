package seleniumgluecode.test.appium;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumgluecode.TestBase;

public class WebviewBusqueda extends TestBase {

    @Given("^Ingresar a la sección Webview$")
    public void ingresarALaSecciónWebview() throws Throwable {
        Thread.sleep(1000);
        webviewPage.clickWebViewLink();
    }

    @When("^Seleccionar la casilla de busqueda$")
    public void seleccionarLaCasillaDeBusqueda() throws Throwable {
        Thread.sleep(3000);
        webviewPage.clickSearchInput();
    }

    @Then("^Realizar la busqueda \"([^\"]*)\"$")
    public void realizarLaBusqueda(String valorBusqueda) throws Throwable {
        Thread.sleep(1000);
        webviewPage.typeTextSearch(valorBusqueda);
    }
}
