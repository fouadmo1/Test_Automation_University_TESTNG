package horizontalSlider;

import base.BaseTest;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HorizontalSliedrTests extends BaseTest {
        @Test
    public void sliderRangeTest() {
            String value = "4";
        var horizontalPage = homepage.clickOnHorizontalSliderLink();
        horizontalPage.setSliderValue(value);
        Assert.assertEquals(horizontalPage.getSliderValue(),value);

    }
//    @Test
//    public void testSlideToWholeNumber() {
//        String value = "4";
//        var sliderPage = homepage.clickOnHorizontalSliderLink();
//        sliderPage.setSliderValue(value);
//        Assert.assertEquals(sliderPage.getSliderValue(), value, "Slider value is incorrect");
//    }
}
