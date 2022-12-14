package seleniumgluecode.test.appium;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumgluecode.TestBase;


public class SignInApp extends TestBase {

    @Given("^Ingresar a la sección Login$")
    public void ingresar_a_la_sección_Login() throws InterruptedException {
        Thread.sleep(3000);
        loginPageApp.clickLoginBtnLink();
    }

    @When("^Ingresar email y password y presionar el boton Login \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresar_email_y_password_y_presionar_el_boton_Login(String email, String pass) throws Throwable {
        Thread.sleep(3000);
        loginPageApp.inputEmail(email);
        loginPageApp.inputPass(pass);
        loginPageApp.clickBtnLogin();
    }

    @Then("^Validar el Login$")
    public void validar_el_Login() throws Throwable {
        Thread.sleep(3000);
        loginPageApp.succesValidate();
        loginPageApp.clickBtnOk();
    }


}
