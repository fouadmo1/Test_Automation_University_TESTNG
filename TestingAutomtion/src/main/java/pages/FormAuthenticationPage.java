package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormAuthenticationPage {
    WebDriver driver;

    public By usernameField = By.id("username");
    public By passwordField = By.id("password");
    public By loginButton = By.xpath("//i[@class=\"fa fa-2x fa-sign-in\"]");
    public FormAuthenticationPage(WebDriver driver){
        this.driver = driver;
    }

    public void fillUsernameField(String username){
        driver.findElement(usernameField).sendKeys(username);
    }
    public void fillPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }


}
