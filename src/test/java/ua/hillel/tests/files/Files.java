package ua.hillel.tests.files;

import org.testng.annotations.Test;
import ua.hillel.tests.Base.BaseTest;

import java.io.IOException;

public class Files extends BaseTest {
    @Test
    public void downloadFile() throws IOException {
        openMainPageTheInternetSite().goToDownloadPage()
                .selectTxtFile()
                .changeTxtFile();
    }

}
