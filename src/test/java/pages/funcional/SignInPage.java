package pages.funcional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.PageBase;


public class SignInPage extends PageBase {
    By signInBtn = By.xpath("//a[@id='signin2']");
    By UserNameInput = By.xpath("//*[@id='sign-username']");
    By passwordInput = By.id("sign-password");
    By signUpBtn = By.xpath("//*[@id='signInModal']/div/div/div[3]/button[2]");
    By closeBtn = By.xpath("//*[@id='signInModal']/div/div/div[3]/button[1]");

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void clickSignUp () throws Exception {
        System.out.println(signInBtn);
        click(signInBtn);
    }


    public void typeUserName(String inputText) {
        System.out.println(UserNameInput);
        type(inputText, UserNameInput);
    }

    public void typePassword(String inputPass){
        type(inputPass, passwordInput);
    }

    public void clickSignUpBtn() throws Exception {
        click(signUpBtn);
    }

    public void clickCloseBtn() throws Exception {
        click(closeBtn);
    }
}
