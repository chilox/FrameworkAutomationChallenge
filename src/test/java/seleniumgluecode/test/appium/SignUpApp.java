package seleniumgluecode.test.appium;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumgluecode.TestBase;

public class SignUpApp extends TestBase {

    @Given("^Ingresar en la sección Login / sign up$")
    public void ingresar_en_la_sección_Login_sign_up() throws Throwable {
        Thread.sleep(3000);
        signUpPage.clickLoginBtnLink();
        Thread.sleep(2000);
        signUpPage.clickSignUpBtn();
    }

    @When("^llenar todos los campos requeridos y presionar el boton \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void llenar_todos_los_campos_requeridos_y_presionar_el_boton(String email, String pass, String confirmPass) throws Throwable {

        signUpPage.typesignupEmailInput(email);
        signUpPage.typeSignUpPassInput(pass);
        signUpPage.typeConfirmSingUpPassInput(confirmPass);
        signUpPage.clicksignUpBtnResgister();
    }

    @Then("^Validar el alta del usuario$")
    public void validar_el_alta_del_usuario() throws Throwable {
        Thread.sleep(3000);
        signUpPage.validatorSucces();

    }

}
