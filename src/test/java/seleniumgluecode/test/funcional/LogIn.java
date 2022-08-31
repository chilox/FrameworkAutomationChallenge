package seleniumgluecode.test.funcional;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import seleniumgluecode.TestBase;

public class LogIn extends TestBase {
    @Given("^Usuario con usuario valido para ingresar$")
    public void usuarioConUsuarioValidoParaIngresar() throws Throwable {
        loginPage.validarHome();
    }

    @When("^El usuario presiona el boton Log in$")
    public void elUsuarioPresionaElBotonLogIn() throws Throwable {
        loginPage.clickLogInBtn();
    }

    @When("^Ingresar el (.*) usuario$")
    public void ingresarElIlichUsuario(String username) throws Throwable {
        loginPage.typeUserLogIn(username);
    }

    @When("^ingresar la (.*) contraseña$")
    public void ingresarLaIContraseña(String password) throws Throwable {
        loginPage.typePasswordLogIn(password);
    }

    @When("^presionar el boton login$")
    public void presionarElBotonLogin() throws Throwable {
        loginPage.clickbtnLogin();
    }

    @Then("^el usuario se loguea de manera correcta (.*)$")
    public void elUsuarioSeLogueaDeManeraCorrectaIlich(String username) throws Throwable {

        WebElement texto = driver.findElement(By.xpath("//*[@id='nameofuser']"));
        if(texto.isDisplayed()){
            System.out.println("Bienvenido: " + username);
        }else{
            System.out.println("Usuario y/o constraseña incorrecta");
        }




    }
}
