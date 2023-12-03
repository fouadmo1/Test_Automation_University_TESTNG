package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    private WebDriver driver ;
    private By dropDownList = By.id("dropdown");

    public DropDownPage(WebDriver driver){
        this.driver = driver ;
    }
    public void selectFromDropDownList(String option){
       selectElement().selectByVisibleText(option);
    }
    private Select selectElement(){
        return new Select(driver.findElement(dropDownList));
    }
    public List<String> getSelectedElements(){
        List<WebElement> selectedElements = selectElement().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

}
