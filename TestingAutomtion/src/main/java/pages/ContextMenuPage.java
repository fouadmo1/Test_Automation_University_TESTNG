package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ContextMenuPage {
    private WebDriver driver ;
    private By contextBox = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver ;
    }
    public void rightClickOnBox(){
        WebElement context = driver.findElement(contextBox);
        Actions action = new Actions(driver);
        action.contextClick(context).perform();
    }
    public void acceptJsAlert(){
        driver.switchTo().alert().accept();
    }
    public String getAlertText(){ return driver.switchTo().alert().getText();}


}
