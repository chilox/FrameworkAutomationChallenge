package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase{
    By loginBtnLink = By.xpath("//android.widget.Button[@content-desc='Login']");
    By inputEmail = By.xpath("//android.widget.EditText[@content-desc='input-email']");
    By inputPassword = By.xpath("//android.widget.EditText[@content-desc='input-password']");
    By btnLogin = AppiumBy.xpath("//android.view.ViewGroup[@content-desc='button-LOGIN']/android.view.ViewGroup");
    By validatorLogIn = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView");
    By btnOk = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button");



    public LoginPage(WebDriver driver) {
        super(driver);
    }



    public  void clickLoginBtnLink() {
        clickMobile(loginBtnLink);
    }
    public  void inputEmail(String inputTex){
        typeMobile(inputTex, inputEmail);
    }

    public  void inputPass(String inputTex){
        typeMobile(inputTex, inputPassword);
    }

    public  void clickBtnLogin() throws Exception {
        clickMobile(btnLogin);
    }

    public  void succesValidate(){
        isEnabled(validatorLogIn);
    }

    public  void clickBtnOk() throws Exception {
        clickMobile(btnOk);
    }

}
