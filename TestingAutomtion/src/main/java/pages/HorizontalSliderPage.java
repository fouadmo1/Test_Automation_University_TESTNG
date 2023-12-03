package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By slider = By.xpath("//input[@type=\"range\"]");
//    private By slider = By.cssSelector(".sliderContainer input");
    private By sliderRange = By.xpath("//span[@id=\"range\"]");
    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }
    public void setSliderValue(String value){
        WebElement horizontalSLider = driver.findElement(slider);

        while(!getSliderValue().equals(value)){
            horizontalSLider.sendKeys(Keys.ARROW_RIGHT);

        }
    }
    public String getSliderValue(){
        return driver.findElement(sliderRange).getText();
    }
//private WebDriver driver;
//    private By sliderValue = By.id("range");
//    private By slider = By.cssSelector(".sliderContainer input");
//
//    public HorizontalSliderPage(WebDriver driver){
//        this.driver = driver;
//    }
//
//    public void setSliderValue(String value){
//        while(!getSliderValue().equals(value)){
//            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
//        }
//    }

//    public String getSliderValue(){
//        return driver.findElement(sliderValue).getText();
//    }

}
