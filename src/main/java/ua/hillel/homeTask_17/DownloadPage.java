package ua.hillel.homeTask_17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import ua.hillel.homeTask_16.Base.BasePage;

import java.io.*;
import java.nio.file.Paths;
import java.util.List;

public class DownloadPage extends BasePage {
    @FindBy(how = How.XPATH, using = "//a[contains(@href, '.txt')]")
    private List<WebElement> downloadFiles;
    public DownloadPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public DownloadPage selectTxtFile(){
        downloadFiles.get(0).click();
        return this;
    }

    public DownloadPage changeTxtFile() throws IOException {
        String text = "This file was changed";
        List<File> folderWithDownloadedFiles = (List<File>) new File("target/downloads");
        File[] filesInFolder = new File("target/downloads").listFiles();
        FileWriter writer = new FileWriter(filesInFolder[1]);
        writer.write(text);
        writer.close();
        return this;
    }
}
