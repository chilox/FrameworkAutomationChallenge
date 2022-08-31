package seleniumgluecode.test.funcional;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import seleniumgluecode.TestBase;

public class SignIn extends TestBase {


    @Given("^El usuario se encuentra en al pagina principal de demoblaze\\.com$")
    public void elUsuarioSeEncuentraEnAlPaginaPrincipalDeDemoblazeCom()  {
        signInPage.validarHome();
    }

    @When("^El usuario presiona el boton Sign up$")
    public void elUsuarioPresionaElBotonSignUp() throws Exception {
        //Thread.sleep(3000);
        signInPage.clickSignUp();
    }

    @When("^ingresa un (.*) username$")
    public void ingresaUnIlichUsername(String username) throws InterruptedException {
        //Thread.sleep(3000);
        signInPage.typeUserName(username);
    }

    @When("^ingresa un (.*) password$")
    public void ingresaUnIUsername(String password) throws InterruptedException {
        //Thread.sleep(3000);
        signInPage.typePassword(password);
    }

    @When("^presiona el boton Sign up$")
    public void presionaElBotonSignUp() throws Exception {
        //Thread.sleep(3000);
        signInPage.clickSignUpBtn();
    }

    @Then("^Se crea el usuario de manera correcta$")
    public void seCreaElUsuarioDeManeraCorrecta()  {
       System.out.println("bien");
    }



}
