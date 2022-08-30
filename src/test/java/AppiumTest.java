
import io.appium.java_client.AppiumBy;
import io.appium.java_client.PerformsActions;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import javax.swing.*;
import java.net.URL;


public class AppiumTest {
    WebDriver driver;
    WebDriverWait wait;
    /**
     Selectores para la seccion de login
     * */
    By loginBtnLink = By.xpath("//android.widget.Button[@content-desc='Login']");
    By inputEmail = By.xpath("//android.widget.EditText[@content-desc='input-email']");
    By inputPassword = By.xpath("//android.widget.EditText[@content-desc='input-password']");
    By btnLogin = AppiumBy.xpath("//android.view.ViewGroup[@content-desc='button-LOGIN']/android.view.ViewGroup");
    /**
     Selectores para la sección de sign up
     * */
    By signUpLink = By.xpath("//android.view.ViewGroup[@content-desc='button-sign-up-container']");
    By signupEmailInput = By.xpath("//android.widget.EditText[@content-desc='input-email']");
    By signupPassInput = By.xpath("//android.widget.EditText[@content-desc='input-password']");
    By confirmSingupPassInput = By.xpath("//android.widget.EditText[@content-desc='input-repeat-password']");
    By signUpBtn = By.xpath("//android.view.ViewGroup[@content-desc='button-SIGN UP']");
    By validadorSignUp = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView");
    By acceptBtnSignUp = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button");

    /**
     Selectores sección forms
     **/
    By formsLink = By.xpath("//android.widget.Button[@content-desc='Forms']");
    By typeSomentingInput = By.xpath("//android.widget.EditText[@content-desc='text-input']");
    By swicthBtn = By.xpath("//android.widget.Switch[@content-desc='switch']");
    By dropdownBtn = By.xpath("//android.view.ViewGroup[@content-desc='Dropdown']/android.view.ViewGroup/android.widget.EditText");
    By activeBtn = By.xpath("//android.view.ViewGroup[@content-desc='button-Active']/android.view.ViewGroup");
    By listDropDownBtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView");
    By lista = By.id("android:id/text1");
    By validatorFormActive = By.id("android:id/alertTitle");
    By aceptFormActiveBtn = By.id("android:id/button1");

    /**
     Selectores de la sección Webview
     **/
    By webviewLink = By.xpath("//android.widget.Button[@content-desc='Webview']");
    By searchInput = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.Button");
    By inputText = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");
    By menuBtn = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.Button");
    By docsLink = AppiumBy.xpath("//android.view.View[@content-desc='Docs']/android.widget.TextView");
    By apiLink = AppiumBy.xpath("//android.view.View[@content-desc='API']/android.widget.TextView");
    By contributeLink = AppiumBy.xpath("//android.view.View[@content-desc='Contribute']/android.widget.TextView");
    By versionLink = AppiumBy.xpath("//android.view.View[@content-desc='Community']/android.widget.TextView");
    By elementScrolleable = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView");
    By blogLink = AppiumBy.xpath("//android.view.View[@content-desc='Blog']/android.widget.TextView");

    String email = "prueba@gmail.com";
    String pass = "is123456789";
    String texto = "Texto de prueba";



    @Before
    public void openApp(){
        try {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(CapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "P963F50");
        cap.setCapability(MobileCapabilityType.UDID, "ca037924");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
        cap.setCapability("appPackage","com.wdiodemoapp");
        cap.setCapability("appActivity", "com.wdiodemoapp.MainActivity");
        //cap.setCapability("automationName", "UiAutomator1");
        cap.setCapability("noReset", true);
        cap.setCapability("noSing", true);
        cap.setCapability("autoGrantPermissions", true);
        URL url = new URL("http://127.0.0.1:4723/wd/hub/");
        driver = new RemoteWebDriver(url, cap);
        } catch (Exception e) {
            System.out.println("Error de conexion " + e);;
        }

    }

    @Test
    public void signIn() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(loginBtnLink).click();
        Thread.sleep(2000);
       // wait.until(ExpectedConditions.visibilityOfElementLocated(inputEmail));
        driver.findElement(inputEmail).sendKeys(email);
        driver.findElement(inputPassword).sendKeys(pass);
        driver.findElement(btnLogin).click();
    }

    @Test
    public void signUp() throws InterruptedException {
        System.out.println("Comienzo de la ejecución");
        Thread.sleep(3000);
        //wait.until(ExpectedConditions.elementToBeClickable(loginBtnLink));
        driver.findElement(loginBtnLink).click();
        //wait.until(ExpectedConditions.elementToBeClickable(signUpLink));
        Thread.sleep(2000);
        driver.findElement(signUpLink).click();
        //wait.until(ExpectedConditions.elementToBeSelected(signupEmailInput));
        driver.findElement(signupEmailInput).sendKeys(email);
        driver.findElement(signupPassInput).sendKeys(pass);
        driver.findElement(confirmSingupPassInput).sendKeys(pass);
        driver.findElement(signUpBtn).click();
        Thread.sleep(4000);
        if(driver.findElement(validadorSignUp).isEnabled()){
            driver.findElement(acceptBtnSignUp).click();
            System.out.println("Culmino la ejecución de manera correcta!!");
        }else{
            System.out.println("No se realizo el Alta del usuario correctamente");
        }

    }

    @Test
    public void activeForm() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(formsLink).click();
        Thread.sleep(3000);
        driver.findElement(typeSomentingInput).sendKeys(texto);
        driver.findElement(swicthBtn).click();
        driver.findElement(dropdownBtn).click();
        Thread.sleep(3000);
        driver.findElements(lista).get(2).click();
        driver.findElement(activeBtn).click();
        Thread.sleep(2000);
        if(driver.findElement(validatorFormActive).isEnabled()){
            driver.findElement(aceptFormActiveBtn).click();
            System.out.println("Se realizo la activación correctamente");
        }else{
            System.out.println("No se realizo la activación");
        }


    }

    @Test
    public void webviewSearch() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(webviewLink).click();
        Thread.sleep(3000);
        driver.findElement(searchInput).click();
        Thread.sleep(1000);
       driver.findElement(inputText).sendKeys("browser");
        Thread.sleep(3000);
        driver.findElement(inputText).sendKeys(Keys.ENTER);


    }


    @Test
    public void navMenuElements() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(webviewLink).click();
        Thread.sleep(3000);
        driver.findElement(menuBtn).click();
        Thread.sleep(2000);
        driver.findElement(docsLink).click();
        Thread.sleep(2000);
        driver.findElement(menuBtn).click();
        driver.findElement(apiLink).click();
        Thread.sleep(2000);
        driver.findElement(menuBtn).click();
        driver.findElement(blogLink).click();
        Thread.sleep(2000);
        driver.findElement(menuBtn).click();
        driver.findElement(contributeLink).click();
        Thread.sleep(2000);
        driver.findElement(menuBtn).click();
        driver.findElement(contributeLink).click();
        Thread.sleep(2000);
        driver.findElement(menuBtn).click();
        driver.findElement(versionLink).click();

    }


}
