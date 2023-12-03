package formAuthentication;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FormAuthenticationPage;
import pages.SecureAreaPage;

public class VerifyFormAuthentication extends BaseTest {


    @Test
    public void verifyFormAuthentication(){
        FormAuthenticationPage formAuthenticationpage = homepage.clickOnFormAuthentication();
        formAuthenticationpage.fillUsernameField("tomsmith");
        formAuthenticationpage.fillPasswordField("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = formAuthenticationpage.clickLoginButton();
        Assert.assertTrue(secureAreaPage.getSuccessfullmessageText().contains("You logged into a secure area!"));
    }
}
