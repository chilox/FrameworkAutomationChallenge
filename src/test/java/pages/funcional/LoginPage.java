package pages.funcional;

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

    /*public void validarUsuario(String inputText) throws Exception {
        try {
            System.out.println("Este es el valor de aa: " + aa);
            System.out.println(welcome + inputText);
            Assert.assertEquals(aa, (welcome+inputText));
            //aa = (welcome+inputText);
            System.out.println("Su logueo se efectuo de manera correcta");

        }catch (Exception e){
            throw new Exception("No se realizo el logueo, veifique el usuario / contraseña");
        }
    }*/
}
