import de.cgi.selenium.pageobjects.HornbachMainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstTest
{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\84\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.hornbach.de/");
        HornbachMainPage hbHomePage = new HornbachMainPage();
        hbHomePage.hoverOverSortiment(chromeDriver);
        hbHomePage.goToSortiment(chromeDriver);
        System.out.println(chromeDriver.getTitle());

        chromeDriver.close();
    }
}
