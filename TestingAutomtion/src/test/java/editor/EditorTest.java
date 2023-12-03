package editor;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditorTest extends BaseTest {
    @Test
    public void editorTest() throws InterruptedException {
        var editorPage = homepage.clickOnEditorLink();

        editorPage.clearTheTextArea();
        editorPage.typeInTheTextArea("hello");

        editorPage.clickOnIncreaseIndentButton();

        editorPage.typeInTheTextArea(" World");

        Assert.assertTrue(editorPage.getText().contains("hello World"));

    }
}
