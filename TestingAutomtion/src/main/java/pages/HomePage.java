package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    private void clickLink(String text){
        driver.findElement(By.linkText(text)).click();
    }
    public FormAuthenticationPage clickOnFormAuthentication(){
        clickLink("Form Authentication");
        return new FormAuthenticationPage(driver);
    }
    public DropDownPage clickOnDropDownPage(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    public HoversPage clickOnHoversLink(){
        clickLink("hovers");
        return new HoversPage(driver);
    }
    public KeyPressesPage clickOnKeyPressesLink(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public HorizontalSliderPage clickOnHorizontalSliderLink(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }
    public JavaScriptAlertsPage clickOnJavaScriptAlertsPage(){
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }
    public FileUploadPage clickOnFileUploadLink(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public ContextMenuPage clickOnContextMenuLink(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }
    public WysiwygEditorPage clickOnEditorLink(){
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }
    public DynamicLoadingPage clickOnDynamicLoadingLink(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public MultipleWindowsPage clickOnMultipleWindowsLink(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }

}
