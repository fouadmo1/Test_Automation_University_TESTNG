package navigation;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.WindowManager;


public class Navigation extends BaseTest {
    @Test
    public void navigationTest(){
        homepage.clickOnDynamicLoadingLink().clickOnExample1();
        windowManager().goBack();
        windowManager().refresh();
        windowManager().goForward();
        windowManager().goTo("https://apps.microsoft.com/");
    }
    @Test
    public void switchToTabTest(){
        homepage.clickOnMultipleWindowsLink().clickHere();
        windowManager().switchToTabs("New Window");
    }
}
