package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    public WebDriver driver;
    private By figurebox = By.className("figure");
    public By figcaption = By.className("figcaption");

    public HoversPage(WebDriver driver){
        this.driver = driver ;
    }


    public FigureCaptions hoverOverUsers(int index){
        //we use this line to store list of elements from the images because there is more than user to hover on
        //we send the index as a parameter then we use get index to get the element and store it in images variable
        WebElement figure = driver.findElements(figurebox).get(index-1);
        Actions action = new Actions(driver);
        action.moveToElement(figure).perform();
        return new FigureCaptions(figure.findElement(figcaption));
    }
    //inner class
    public class FigureCaptions{
        WebElement caption;
        private By name = By.tagName("h5");
        private By link = By.tagName("a");
        public FigureCaptions(WebElement caption){
            this.caption = caption;
        }
        public String getUsername(){
            return caption.findElement(name).getText();
        }
        public boolean checkTitleIsDisplayed(){
            return caption.isDisplayed();
        }
        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }
        public String getlinkText(){
            return caption.findElement(link).getText();
        }
    }
}
