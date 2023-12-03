package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver ;
    private By example1Link = By.linkText("Example 1: Element on page that is hidden");
    private By example2Link = By.linkText("Example 2: Element rendered after the fact");
    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver ;
    }
    public LoadingExample1Page clickOnExample1(){
        driver.findElement(example1Link).click();
        return new LoadingExample1Page(driver);
    }
    public LoadingExample2Page clickOnExample2(){
        driver.findElement(example2Link).click();
        return new LoadingExample2Page(driver);
    }

}
