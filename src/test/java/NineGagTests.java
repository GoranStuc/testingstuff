import de.cgi.selenium.pageobjects.NineGagMainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NineGagTests {

    private WebDriver driver;


    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testChrome() {
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),new ChromeOptions());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.get("https://9gag.com/");
        NineGagMainPage nineGagMainPage = new NineGagMainPage();
        //good way to wait for something
        nineGagMainPage.closePopup(driver);
        nineGagMainPage.goToFresh(driver);
        //bad way of waiting for something
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        nineGagMainPage.goToTrending(driver);
        System.out.println(driver.getTitle());
    }

    @Test
    public void testFireFox()  {
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),new FirefoxOptions());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.get("https://9gag.com/");
        NineGagMainPage nineGagMainPage = new NineGagMainPage();
        //good way to wait for something
        nineGagMainPage.closePopup(driver);
        nineGagMainPage.goToFresh(driver);

        //bad way of waiting for something
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        nineGagMainPage.goToTrending(driver);
        System.out.println(driver.getTitle());
    }
}
