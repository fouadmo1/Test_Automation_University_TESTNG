package jsAlerts;

import base.BaseTest;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadFileTests extends BaseTest {
    @Test
    public void uploadFileTest(){
        var fileUploadPage = homepage.clickOnFileUploadLink();
        fileUploadPage.chooseFilePathToUpload("C:\\Users\\a\\Downloads\\jax art.jpg");
        fileUploadPage.clickSubmitButton();
        Assert.assertTrue(fileUploadPage.getUploadedFiles().contains("jax art.jpg"));
    }
}
