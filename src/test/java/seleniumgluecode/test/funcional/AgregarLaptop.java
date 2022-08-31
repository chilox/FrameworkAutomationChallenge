package seleniumgluecode.test.funcional;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.openqa.selenium.Alert;
import seleniumgluecode.TestBase;

public class AgregarLaptop extends TestBase {

    @Given("^El usuario se encuentra en al pagina principal$")
    public void elUsuarioSeEncuentraEnAlPaginaPrincipal() throws Throwable {
        agregarProdcutoPage.validarHome();

    }

    @When("^el usuario seleciona la seccion Laptos$")
    public void elUsuarioSelecionaLaSeccionLaptos() throws Throwable {
        agregarProdcutoPage.seleccionCategoria();
    }

    @When("^el usuario selecciona un producto$")
    public void elUsuarioSeleccionaUnProducto() throws Throwable {
        agregarProdcutoPage.clickProducto();

    }

    @When("^presionar el boton Add to cart$")
    public void presionarElBotonAddToCart() throws Throwable {
        agregarProdcutoPage.addToCart();
        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
    }

    @When("^Ingresar a la seccion Cart$")
    public void ingresarALaSeccionCart() throws Throwable {
        agregarProdcutoPage.cartBtn();

    }

    @Then("^Validar que se agregara de manera correcta al carro de compras$")
    public void validarQueSeAgregaraDeManeraCorrectaAlCarroDeCompras() throws Throwable {
        agregarProdcutoPage.validarProducto();
    }
}
