package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    private WebDriver driver;
    private By jsAlertButton = By.xpath("//button[text()=\"Click for JS Alert\"]");
    private By forJsAlertConfirmButton = By.xpath("//button[text()=\"Click for JS Confirm\"]");
    private By forJsPromptButton = By.xpath("//button[text()=\"Click for JS Prompt\"]");
    private By result = By.id("result");
    public JavaScriptAlertsPage(WebDriver driver){
        this.driver = driver ;
    }
    public void clickOnJsAlertButton(){
        driver.findElement(jsAlertButton).click();
    }
    public void clickforJsAlertConfirmButton(){
        driver.findElement(forJsAlertConfirmButton).click();
    }
    public void clickforJsAlertpromptButton(){
        driver.findElement(forJsPromptButton).click();
    }
    public void acceptJsAlert(){
        driver.switchTo().alert().accept();
    }
    public void dismissJsAlert(){
        driver.switchTo().alert().dismiss();
    }
    public void sendKeysToJsAlert(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public String getAlertText(){ return driver.switchTo().alert().getText();}
    public String getResultText(){
        return driver.findElement(result).getText();
    }


}
