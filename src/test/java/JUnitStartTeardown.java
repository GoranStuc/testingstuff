import de.cgi.selenium.pageobjects.HornbachMainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JUnitStartTeardown {

    private WebDriver driver;

    public JUnitStartTeardown() {
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
    public void test() {
        driver = new ChromeDriver();
        driver.get("https://www.hornbach.de/");
        HornbachMainPage hbHomePage = new HornbachMainPage();
        hbHomePage.hoverOverSortiment(driver);
        hbHomePage.goToSortiment(driver);
        System.out.println(driver.getTitle());
    }

    @Test
    public void testF() {
        driver = new FirefoxDriver();
        driver.get("https://www.hornbach.de/");
        HornbachMainPage hbHomePage = new HornbachMainPage();
        hbHomePage.hoverOverSortiment(driver);
        hbHomePage.goToSortiment(driver);
        System.out.println(driver.getTitle());
    }
}
