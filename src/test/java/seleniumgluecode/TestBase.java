package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.appium.FormsPage;
import pages.appium.SignUpPage;
import pages.appium.WebviewPage;
import pages.appium.LoginPageApp;
import pages.funcional.AgregarProdcutoPage;
import pages.funcional.LogOutPage;
import pages.funcional.SignInPage;
import pages.funcional.LoginPage;



public class TestBase {

    protected WebDriver driver = Hooks.getDriver();
    protected LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    protected SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
    protected AgregarProdcutoPage agregarProdcutoPage = PageFactory.initElements(driver, AgregarProdcutoPage.class);
    protected LogOutPage logOutPage = PageFactory.initElements(driver, LogOutPage.class);
    protected WebviewPage webviewPage = new WebviewPage(driver);
    protected SignUpPage signUpPage = new SignUpPage(driver);
    protected LoginPageApp loginPageApp = new LoginPageApp(driver);
    protected FormsPage formsPage = new FormsPage(driver);

}
