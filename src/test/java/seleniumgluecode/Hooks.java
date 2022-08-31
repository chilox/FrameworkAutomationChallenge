package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import runner.browserManager.DriveManagerFactory;
import runner.browserManager.DriverManager;
import runner.browserManager.DriverType;
import cucumber.api.java.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Hooks {

    private static WebDriver driver;
    private DriverManager driverManager;

    @Before("@browser")
    public void setUp() {

        driverManager = DriveManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Before("@appium")
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


    @After("@browser")
    public void tearDown(){
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
