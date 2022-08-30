package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PageBase {
    private WebDriver driver;


    public PageBase(WebDriver driver){
        this.driver = driver;
    }

    public void typeMobile(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public void sendType(By locator){
        driver.findElement(locator).sendKeys(Keys.ENTER);
    }

    public void clickMobile(By locator) {
        driver.findElement(locator).click();
    }

    public void getIndex(By locator, int index){
        driver.findElements(locator).get(index).click();
    }
    public Boolean isEnabled(By locator){
        try{

            return driver.findElement(locator).isEnabled();
        }catch (Exception e){
            System.out.println("No se ubico el Elemento seleccionado");
            return false;
        }
    }
}
