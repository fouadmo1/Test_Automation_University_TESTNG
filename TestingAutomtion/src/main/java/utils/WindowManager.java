package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver ;
    private WebDriver.Navigation  navigate ;
    public WindowManager(WebDriver driver){
        this.driver = driver ;
        navigate = driver.navigate();
    }
    public void goForward(){
        navigate.forward();
    }
    public void goBack(){
        navigate.back();
    }
    public void goTo(String link){
        navigate.to(link);
    }
    public void refresh(){
        navigate.refresh();
    }
    public void switchToTabs(String title){
        //Set of windows
        var windows = driver.getWindowHandles();
        System.out.println("NumberOfTabs : " + windows.size());
        //printing all windowHandles
        windows.forEach(System.out::println);

        //Switching Between windows
        for(String window : windows){
            System.out.println("Switching To window: " + window);
            driver.switchTo().window(window);
            System.out.println("current Title " + driver.getTitle());
            if(driver.getTitle().equals(title)){
                break;
            }
        }
    }
    public void switchToNewTab(){
        var windows = driver.getWindowHandles();
        for(String window :windows);
    }

}
