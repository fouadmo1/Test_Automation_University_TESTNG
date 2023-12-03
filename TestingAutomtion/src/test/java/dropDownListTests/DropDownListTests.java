package dropDownListTests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropDownPage;

import java.util.List;

public class DropDownListTests extends BaseTest {
    @Test
    public void verifySelectedOptions(){
        String option = "Option 1";
        DropDownPage dropDown = homepage.clickOnDropDownPage();
        dropDown.selectFromDropDownList(option);
        List<String> selectedElements =  dropDown.getSelectedElements();
        Assert.assertEquals(selectedElements.size(),1);
        Assert.assertTrue(selectedElements.contains(option));
    }
}
