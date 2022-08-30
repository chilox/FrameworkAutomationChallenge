package pages.funcional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.PageBase;

public class AgregarProdcutoPage extends PageBase {
    By sonyVaioI7 = By.xpath("//*[@id='tbodyid']/div[9]/div/div/h4/a");
    By catLaptop = By.xpath("//*[@id='contcont']/div/div[1]/div/a[3]");
    By btnAgregarACarro = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
    By btnCart = By.id("cartur");
    By productoEnCarro = By.xpath("//*[@id='tbodyid']/tr/td[2]");

    public AgregarProdcutoPage(WebDriver driver) {
        super(driver);
    }
    public void seleccionCategoria() throws Exception {
        click(catLaptop);
    }

    public void clickProducto() throws Exception {
        click(sonyVaioI7);
    }

    public void addToCart() throws Exception {
        click(btnAgregarACarro);


    }

    public void cartBtn() throws Exception {
        click(btnCart);
    }

    public void validarProducto(){
        isDisplayed(productoEnCarro);
    }
}
