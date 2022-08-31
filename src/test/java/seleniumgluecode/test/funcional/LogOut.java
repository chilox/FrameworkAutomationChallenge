package seleniumgluecode.test.funcional;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumgluecode.TestBase;

public class LogOut extends TestBase {

    @Given("^Iniciar session con (.*) y (.*)$")
    public void iniciarSessionConIlichYI(String username, String password) throws Throwable {
        logOutPage.userLogIn(username, password);

    }

    @When("^pesiona el boton log out$")
    public void pesionaElBotonLogOut() throws Throwable {
        logOutPage.logOut();
    }

    @Then("^en usuario cierra la sesion correctamente$")
    public void enUsuarioCierraLaSesionCorrectamente() throws Throwable {
        logOutPage.validarUserLogOut();
    }
}
