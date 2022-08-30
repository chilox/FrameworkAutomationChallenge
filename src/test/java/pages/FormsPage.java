package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormsPage extends PageBase{
    By formsLink = AppiumBy.xpath("//android.widget.Button[@content-desc='Forms']");
    By typeSomentingInput = By.xpath("//android.widget.EditText[@content-desc='text-input']");
    By swicthBtn = By.xpath("//android.widget.Switch[@content-desc='switch']");
    By dropdownBtn = By.xpath("//android.view.ViewGroup[@content-desc='Dropdown']/android.view.ViewGroup/android.widget.EditText");
    By activeBtn = By.xpath("//android.view.ViewGroup[@content-desc='button-Active']/android.view.ViewGroup");
    By lista = By.id("android:id/text1");
    By validatorFormActive = By.id("android:id/alertTitle");
    By aceptFormActiveBtn = By.id("android:id/button1");
    private WebDriver driver;
    public FormsPage(WebDriver driver) {
        super(driver);
    }


    public void clickFormsLink(){
        clickMobile(formsLink);
    }

    public void clickDropdownBtn() throws InterruptedException {
        clickMobile(dropdownBtn);
        Thread.sleep(2000);
        getIndex(lista, 2);
        clickMobile(activeBtn);
    }

    public void typeTypeSomentingInput(String inputText){
        typeMobile(inputText, typeSomentingInput);
    }

    public void selectSwicthOption() {
        clickMobile(swicthBtn);

    }
    public void validatorSuccesForm(){
        isEnabled(validatorFormActive);
        clickMobile(aceptFormActiveBtn);
    }


}
