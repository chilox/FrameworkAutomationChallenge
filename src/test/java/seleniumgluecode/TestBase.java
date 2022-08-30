package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.funcional.AgregarProdcutoPage;
import pages.funcional.LogOutPage;
import pages.funcional.LoginPage;
import pages.funcional.SignInPage;



public class TestBase {

    protected WebDriver driver = Hooks.getDriver();
    protected LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    protected SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
    protected AgregarProdcutoPage agregarProdcutoPage = PageFactory.initElements(driver, AgregarProdcutoPage.class);
    protected LogOutPage logOutPage = PageFactory.initElements(driver, LogOutPage.class);


}
