import de.cgi.selenium.pageobjects.HornbachMainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitStartTeardown {

    private WebDriver driver;

    public JUnitStartTeardown() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setupTest() {
        driver = new ChromeDriver();
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void test() {
        driver.get("https://www.hornbach.de/");
        HornbachMainPage hbHomePage = new HornbachMainPage();
        hbHomePage.hoverOverSortiment(driver);
        hbHomePage.goToSortiment(driver);
        System.out.println(driver.getTitle());
    }
}
