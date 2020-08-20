import de.cgi.selenium.driver.helper.ChromeDriverBuilder;
import de.cgi.selenium.pageobjects.HornbachMainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstTest {
    public static void main(String[] args) {
        /*WebDriver chromeDriver = new ChromeDriverBuilder().setDriverLocation("C:\\chromedriver\\84\\chromedriver.exe").build();
        chromeDriver.get("https://www.hornbach.de/");
        HornbachMainPage hbHomePage = new HornbachMainPage();
        hbHomePage.hoverOverSortiment(chromeDriver);
        hbHomePage.goToSortiment(chromeDriver);
        System.out.println(chromeDriver.getTitle());
        chromeDriver.close();*/
        JUnitTestExample jUnitTestExample = new JUnitTestExample();
        jUnitTestExample.testWithOneChrome();
        jUnitTestExample.testWithOneFireFox();
        jUnitTestExample.testWithChromeAndFirefox();
    }
}
