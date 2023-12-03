package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver ;
    private By chooseFilePathButton = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFile = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver){
        this.driver = driver ;
    }
    public void chooseFilePathToUpload(String path){
        driver.findElement(chooseFilePathButton).sendKeys(path);
    }
    public void clickSubmitButton(){
        driver.findElement(uploadButton).click();
    }
    public String getUploadedFiles(){
        return driver.findElement(uploadedFile).getText();
    }

}
