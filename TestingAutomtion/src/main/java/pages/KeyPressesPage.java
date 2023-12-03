package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver ;
    public By keysField = By.id("target");
    public By massage = By.id("result");
    public KeyPressesPage(WebDriver driver){
        this.driver = driver ;
    }
    public void typeOnField(String text){
        driver.findElement(keysField).sendKeys(text);
    }
    public String getMassageText(){
        return driver.findElement(massage).getText();
    }

}
