package pages.funcional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.PageBase;

public class LogOutPage extends PageBase {
    By logIndValidador = By.xpath("//*[@id='nameofuser']");
    By logOutLink = By.id("logout2");
    By logInLink = By.id("login2");
    By userNameLogIn = By.id("loginusername");
    By passwordLogIn = By.id("loginpassword");
    By btnLogIn = By.xpath("//*[@id='logInModal']/div/div/div[3]/button[2]");

    public LogOutPage(WebDriver driver) {
        super(driver);
    }

    public void userLogIn(String user, String pass) throws Exception {
       click(logInLink);
       type(user, userNameLogIn);
       type(pass, passwordLogIn);
       click(btnLogIn);
    }

    public void logOut() throws Exception {
        click(logOutLink);
    }
    public void validarUserLogOut(){
        isDisplayed(logInLink);
    }
}
