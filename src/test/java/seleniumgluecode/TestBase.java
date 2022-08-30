package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import pages.FormsPage;
import pages.LoginPage;
import pages.SignUpPage;
import pages.WebviewPage;


public class TestBase {
    protected WebDriver driver = Hooks.getDriver();

    protected LoginPage loginPage = new LoginPage(driver) ;
    protected WebviewPage webviewPage = new WebviewPage(driver);
    protected SignUpPage signUpPage = new SignUpPage(driver);
    protected FormsPage formsPage = new FormsPage(driver);


}
