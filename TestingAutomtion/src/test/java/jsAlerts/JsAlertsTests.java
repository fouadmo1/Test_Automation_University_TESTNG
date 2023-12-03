package jsAlerts;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JsAlertsTests extends BaseTest {
    @Test
    public void confirmAlertTest(){
        var jsAlertPage = homepage.clickOnJavaScriptAlertsPage();
        jsAlertPage.clickOnJsAlertButton();
        jsAlertPage.acceptJsAlert();
        Assert.assertTrue(jsAlertPage.getResultText().contains("You successfully clicked an alert"));
    }
    @Test
    public void dismissAlertTest(){
        var jsAlertPage = homepage.clickOnJavaScriptAlertsPage();
        jsAlertPage.clickforJsAlertConfirmButton();
        jsAlertPage.dismissJsAlert();
        Assert.assertTrue(jsAlertPage.getResultText().contains("You clicked: Cancel"));

    }
    @Test
    public void sendHelloToJsAlertTest(){
        var jsAlertPage = homepage.clickOnJavaScriptAlertsPage();
        jsAlertPage.clickforJsAlertpromptButton();
        jsAlertPage.sendKeysToJsAlert("hello");
        jsAlertPage.acceptJsAlert();
        Assert.assertTrue(jsAlertPage.getResultText().contains("You entered: hello"));
    }
}
