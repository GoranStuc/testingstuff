package de.cgi.selenium.pageobjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NineGagMainPage {

    private By trending = By.xpath("//a[@href='/trending']");
    private By fresh = By.xpath("//a[@href='/fresh']");
    private By popupAccept = By.xpath("//button[contains(text(),'I ACCEPT')]");

    public void goToTrending(WebDriver driver){
        driver.findElement(trending).click();
    }

    public void goToFresh(WebDriver driver){
        driver.findElement(fresh).click();
    }

    public void closePopup(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(popupAccept));
        driver.findElement(popupAccept).click();
    }


}
