package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    WebDriver driver ;
    private By successfullMessage = By.xpath("//div[@class=\"flash success\"]");

    public SecureAreaPage(WebDriver driver){
        this.driver = driver ;
    }
    public String getSuccessfullmessageText(){
        return driver.findElement(successfullMessage).getText();
    }


}
