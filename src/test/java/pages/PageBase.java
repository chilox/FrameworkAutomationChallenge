package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class PageBase {

    private WebDriver driver;
    WebDriverWait wait;

    public PageBase(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public WebDriver chormeDriverconection() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Documents/GitRepo/ChallencheQA-Automation/src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }


    public String getText(WebElement element){
        return element.getText();
    }

    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public void type(String inputText, By locator){
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By element) throws Exception {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            driver.findElement(element).click();
        }catch (Exception e){
            throw new Exception("No se puedo hacer click en el boton " + element);
        }
    }



    public void submit(By locator){
        driver.findElement(locator).submit();
    }

    public void clear(By locator){
        driver.findElement(locator).clear();
    }

    public Boolean isDisplayed(By locator){
        try{
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            return driver.findElement(locator).isDisplayed();
        }catch (Exception e){
            System.out.println("No se ubico el Elemento seleccionado");
            return false;
        }
    }
    public void urlPage(String url){
        driver.get(url);
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

