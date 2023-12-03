package wait;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitTests extends BaseTest {
    @Test
    public void example1LoadingIndicator(){
        var dynamicLoadingPage = homepage.clickOnDynamicLoadingLink().clickOnExample1();
        dynamicLoadingPage.clickOnStartButton();
        Assert.assertTrue(dynamicLoadingPage.getResultText().contains("Hello World!"));
    }
    @Test
    public void example2LoadingIndicator(){
        var dynamicLoadingPage = homepage.clickOnDynamicLoadingLink().clickOnExample2();
        dynamicLoadingPage.clickOnStartButton();
        Assert.assertTrue(dynamicLoadingPage.getResultText().contains("Hello World!"));
    }

}
