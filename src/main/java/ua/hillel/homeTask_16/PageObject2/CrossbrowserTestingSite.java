package ua.hillel.homeTask_16.PageObject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ua.hillel.homeTask_16.Base.BasePage;

public class CrossbrowserTestingSite extends BasePage {
    @FindBy(linkText = "Drag and Drop")
    private WebElement DragAndDropLink;
    public CrossbrowserTestingSite(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public DragAndDropPage goToDragAndDropPage(){
        DragAndDropLink.click();
        return new DragAndDropPage(driver);
    }
}
