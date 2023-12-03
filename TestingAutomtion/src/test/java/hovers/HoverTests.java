package hovers;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTests extends BaseTest {
    @Test
    public void testHoverUser1(){
        var hoversPage = homepage.clickOnHoversLink();
        var caption = hoversPage.hoverOverUsers(1);
        Assert.assertTrue(caption.checkTitleIsDisplayed());
        Assert.assertTrue(caption.getUsername().contains("user1"));
        Assert.assertTrue(caption.getLink().endsWith("/users/1"));
        Assert.assertTrue(caption.getlinkText().contains("View profile"));

    }
}
