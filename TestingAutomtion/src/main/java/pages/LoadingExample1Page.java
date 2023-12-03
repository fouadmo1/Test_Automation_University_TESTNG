package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoadingExample1Page {
    private WebDriver driver ;
    private By startButton = By.cssSelector("#start button");
    private By loadingIndicator = By.id("loading");
    private By finishText = By.id("finish");
    public LoadingExample1Page(WebDriver driver){
        this.driver =driver;
    }
    public void clickOnStartButton(){
        driver.findElement(startButton).click();
//        WebDriverWait wait = new WebDriverWait(driver , 8);
//        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));

    }
    public String getResultText(){

        return driver.findElement(finishText).getText();
    }
}
