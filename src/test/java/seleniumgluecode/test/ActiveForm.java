package seleniumgluecode.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumgluecode.TestBase;

public class ActiveForm extends TestBase {

    @Given("^Ingresar en la sección Forms$")
    public void ingresar_en_la_sección_Forms() throws Throwable {
        Thread.sleep(2000);
        formsPage.clickFormsLink();
    }

    @When("^llenar todos los campos requeridos \"([^\"]*)\"$")
    public void llenar_todos_los_campos_requeridos(String texto) throws Throwable {
        Thread.sleep(2000);
        formsPage.typeTypeSomentingInput(texto);
        formsPage.selectSwicthOption();
        formsPage.clickDropdownBtn();


    }

    @Then("^Validar la activación del form$")
    public void validar_la_activación_del_form() throws Throwable {
        Thread.sleep(2000);
        formsPage.validatorSuccesForm();
    }
}
