package contextBox;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextBoxTest extends BaseTest {
    @Test
    public void contextBoxTest() {
        var contextBoxPage = homepage.clickOnContextMenuLink();
        contextBoxPage.rightClickOnBox();
        Assert.assertTrue(contextBoxPage.getAlertText().contains("You selected a context menu"));
        contextBoxPage.acceptJsAlert();
    }
}
