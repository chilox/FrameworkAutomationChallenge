package pages.appium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.PageBase;

public class SignUpPage extends PageBase {
    By loginBtnLink = By.xpath("//android.widget.Button[@content-desc='Login']");
    By signUpLink = By.xpath("//android.view.ViewGroup[@content-desc='button-sign-up-container']");
    By signupEmailInput = By.xpath("//android.widget.EditText[@content-desc='input-email']");
    By signupPassInput = By.xpath("//android.widget.EditText[@content-desc='input-password']");
    By confirmSingupPassInput = By.xpath("//android.widget.EditText[@content-desc='input-repeat-password']");
    By signUpBtn = By.xpath("//android.view.ViewGroup[@content-desc='button-SIGN UP']");
    By validadorSignUp = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView");
    By acceptBtnSignUp = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button");
    private WebDriver driver;
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void clickLoginBtnLink(){
        clickMobile(loginBtnLink);
    }


    public void clickSignUpBtn(){
        clickMobile(signUpLink);
    }

    public void typesignupEmailInput (String inputText){
        typeMobile(inputText, signupEmailInput);
    }

    public void typeSignUpPassInput (String inputText){
        typeMobile(inputText, signupPassInput);
    }

    public void typeConfirmSingUpPassInput (String inputText){
        typeMobile(inputText, confirmSingupPassInput);
    }

    public void clicksignUpBtnResgister(){
        clickMobile(signUpBtn);
    }
    public void validatorSucces(){
        isEnabled(validadorSignUp);
        clickMobile(acceptBtnSignUp);
    }


}
