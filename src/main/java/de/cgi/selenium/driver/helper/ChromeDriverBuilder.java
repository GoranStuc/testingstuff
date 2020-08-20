package de.cgi.selenium.driver.helper;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverBuilder {
    /*
    System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\84\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();

     */


    private String driverLocation = "";
    //ToDo: implement additional WebDriver Properties as needed

    public ChromeDriverBuilder setDriverLocation(String driverLocation) {
        this.driverLocation = driverLocation;
        return this;
    }

    public ChromeDriver build() {
        System.setProperty("webdriver.chrome.driver", driverLocation);
        return new ChromeDriver();
    }


}
