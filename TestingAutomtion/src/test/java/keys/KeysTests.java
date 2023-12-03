package keys;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeysTests extends BaseTest {
    @Test
    public void testBackSpace(){
        var keysPage = homepage.clickOnKeyPressesLink();
        keysPage.typeOnField("A"+ Keys.BACK_SPACE);
        Assert.assertTrue(keysPage.getMassageText().contains("BACK_SPACE"));
    }
}
