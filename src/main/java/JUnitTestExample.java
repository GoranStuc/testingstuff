import de.cgi.selenium.pageobjects.HornbachMainPage;
import io.github.bonigarcia.seljup.SeleniumExtension;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@ExtendWith(SeleniumExtension.class)
public class JUnitTestExample {
    ChromeDriver chromeDriver;
    FirefoxDriver firefoxDriver;

    public JUnitTestExample(ChromeDriver chromeDriver,FirefoxDriver firefoxDriver) {
        this.chromeDriver = chromeDriver;
        this.firefoxDriver=firefoxDriver;
    }

    public JUnitTestExample() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
    }

    @Test
    public void testWithOneChrome() {
        this.chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.hornbach.de/");
        HornbachMainPage hbHomePage = new HornbachMainPage();
        hbHomePage.hoverOverSortiment(chromeDriver);
        hbHomePage.goToSortiment(chromeDriver);
        System.out.println(chromeDriver.getTitle());
        chromeDriver.close();
    }

    @Test
    public void testWithOneFireFox() {
        this.firefoxDriver=new FirefoxDriver();
        firefoxDriver.get("https://www.hornbach.de/");
        HornbachMainPage hbHomePage = new HornbachMainPage();
        hbHomePage.hoverOverSortiment(firefoxDriver);
        hbHomePage.goToSortiment(firefoxDriver);
        System.out.println(firefoxDriver.getTitle());
        firefoxDriver.close();
    }

    @Test
    public void testWithChromeAndFirefox() {
        this.chromeDriver = new ChromeDriver();
        this.firefoxDriver=new FirefoxDriver();
        chromeDriver.get("https://www.hornbach.de/");
        firefoxDriver.get("https://www.hornbach.de/");
        HornbachMainPage hbHomePageF = new HornbachMainPage();
        HornbachMainPage hbHomePageC = new HornbachMainPage();
        hbHomePageC.hoverOverSortiment(chromeDriver);
        hbHomePageF.hoverOverSortiment(firefoxDriver);
        hbHomePageC.goToSortiment(chromeDriver);
        hbHomePageF.goToSortiment(firefoxDriver);
        System.out.println(chromeDriver.getTitle());
        System.out.println(firefoxDriver.getTitle());
        chromeDriver.close();
        firefoxDriver.close();
    }


}