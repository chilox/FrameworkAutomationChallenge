package pages.funcional;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.PageBase;

public class LoginPage extends PageBase {
    By logInBtn = By.id("login2");
    By userNameLogIn = By.id("loginusername");
    By passwordLogIn = By.id("loginpassword");
    By btnLogIn = By.xpath("//*[@id='logInModal']/div/div/div[3]/button[2]");
    By btnCloseLogIn = By.xpath("//*[@id='logInModal']/div/div/div[3]/button[1]");
    By welcomeUser = By.xpath("//*[@id='nameofuser']");



    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickLogInBtn() throws Exception {
        click(logInBtn);
    }

    public void typeUserLogIn(String inputText){
        type(inputText, userNameLogIn);
    }

    public void typePasswordLogIn(String inputText){
        type(inputText, passwordLogIn);
    }

    public void clickbtnLogin() throws Exception {
        click(btnLogIn);
    }

    public void clickBtnCloseLogIn() throws Exception {
        click(btnCloseLogIn);
    }

    public void validarHome(){
        String titulo = getTitle();
        Assert.assertEquals("STORE", titulo);
        System.out.println("estamos en la Pagina");

    }
}
