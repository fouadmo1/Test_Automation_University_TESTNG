package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoadingExample2Page {
    private WebDriver driver ;
    private By resultText = By.id("finish");
    private By startButton = By.cssSelector("#start button");
    private By finishText = By.id("finish");
    public LoadingExample2Page(WebDriver driver){
        this.driver =driver;
    }
    public void clickOnStartButton(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver , 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(finishText));
    }
    public String getResultText(){

        return driver.findElement(finishText).getText();
    }
}
