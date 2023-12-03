package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WysiwygEditorPage {
    private WebDriver driver ;
    private String frameId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndentButton = By.xpath("//button[@aria-label=\"Increase indent\"]");
    public WysiwygEditorPage(WebDriver driver){
        this.driver = driver ;
    }
    public void clearTheTextArea(){
        switchToFrame();
//        WebDriverWait wait = new WebDriverWait(driver,5 );
//        wait.until(ExpectedConditions.elementToBeClickable(textArea));
        driver.findElement(textArea).click();
        driver.findElement(textArea).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        driver.findElement(textArea).clear();
        switchToMainArea();
    }
    public void typeInTheTextArea(String text){
        switchToFrame();
        WebDriverWait wait = new WebDriverWait(driver,5 );
        wait.until(ExpectedConditions.elementToBeClickable(textArea));
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }
    public String getText(){
        switchToFrame();
        WebDriverWait wait = new WebDriverWait(driver,5 );
        wait.until(ExpectedConditions.elementToBeClickable(textArea));
        String a = driver.findElement(textArea).getText();
        switchToMainArea();
        return a;
    }
    public void clickOnIncreaseIndentButton(){
        driver.findElement(increaseIndentButton).click();
    }
    private void switchToFrame(){
        driver.switchTo().frame(frameId);
    }
    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

}
