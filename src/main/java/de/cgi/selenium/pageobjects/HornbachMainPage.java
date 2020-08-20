package de.cgi.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HornbachMainPage {

    private By sortiment = By.xpath("//a[@title='Sortiment']");

    public HornbachMainPage(){
        //check if mainpage is loaded
    }

    public void goToSortiment(WebDriver driver){
        driver.findElement(sortiment).click();
    }

    public void hoverOverSortiment(WebDriver driver) {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(sortiment);
        action.moveToElement(we).moveToElement(driver.findElement(sortiment)).build().perform();
    }

}
