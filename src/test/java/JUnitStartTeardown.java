import de.cgi.selenium.pageobjects.HornbachMainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class JUnitStartTeardown {

    private WebDriver driver;

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void test() {
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),new ChromeOptions());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.get("https://www.hornbach.de/");
        HornbachMainPage hbHomePage = new HornbachMainPage();
        hbHomePage.hoverOverSortiment(driver);
        hbHomePage.goToSortiment(driver);
        System.out.println(driver.getTitle());
    }

    @Test
    public void testF() {
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),new FirefoxOptions());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.get("https://www.hornbach.de/");
        HornbachMainPage hbHomePage = new HornbachMainPage();
        hbHomePage.hoverOverSortiment(driver);
        hbHomePage.goToSortiment(driver);
        System.out.println(driver.getTitle());
    }
}
