import de.cgi.selenium.pageobjects.NineGagMainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NineGagTests {

    private WebDriver driver;

    public NineGagTests() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testChrome() {
        driver = new ChromeDriver();
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
        driver = new FirefoxDriver();
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
