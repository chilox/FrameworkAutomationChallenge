package pages.appium;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.PageBase;

public class WebviewPage extends PageBase {
    By webviewLink = By.xpath("//android.widget.Button[@content-desc='Webview']");
    By searchInput = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.Button");
    By inputTextSearch = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");
    By menuBtn = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.Button");
    By  docsLink = AppiumBy.xpath("//android.view.View[@content-desc='Docs']/android.widget.TextView");
    By apiLink = AppiumBy.xpath("//android.view.View[@content-desc='API']/android.widget.TextView");
    By contributeLink = AppiumBy.xpath("//android.view.View[@content-desc='Contribute']/android.widget.TextView");
    By versionLink = AppiumBy.xpath("//android.view.View[@content-desc='Community']/android.widget.TextView");
    By elementScrolleable = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView");
    By blogLink = AppiumBy.xpath("//android.view.View[@content-desc='Blog']/android.widget.TextView");
    private WebDriver driver;


    public WebviewPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Webvie Search metodos
     **/

    public void clickWebViewLink() {
        clickMobile(webviewLink);
    }

    public void clickSearchInput() {
        clickMobile(searchInput);
    }

    public void typeTextSearch(String inputText) throws InterruptedException {
        typeMobile(inputText, inputTextSearch);
        Thread.sleep(3000);
        sendType(inputTextSearch);
    }

    /**
     * Metodos selección pociones de menu
     **/

    public void clickMenuBtn() {
        clickMobile(menuBtn);
    }

    public void selectSectionDoc() {
        clickMobile(docsLink);
    }
    public void selectSectionApi() {
        clickMobile(apiLink);
    }
    public void selectSectionContibute() {
        clickMobile(contributeLink);
    }
    public void selectSectionVersion() {
        clickMobile(versionLink);
    }
    public void selectSectionBlog() {
        clickMobile(blogLink);
    }



}
