package ua.hillel.homeTask_16.PageObject2;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.hillel.homeTask_16.Base.BasePage;

public class DragAndDropPage extends BasePage {
    @FindBy(xpath = "//div[contains(@class, 'ui-widget-content ui-draggable ui-draggable-handle')]")
    private WebElement elementSource;
    @FindBy(xpath = "//div[contains(@class, 'ui-widget-header ui-droppable')]")
    private WebElement elementTarget;
    private String text = "Dropped!";
    public DragAndDropPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public DragAndDropPage dragAndDropAction(){
        actions.dragAndDrop(elementSource, elementTarget).perform();
        return this;
    }
    public DragAndDropPage getText(){

    Assert.assertTrue(elementTarget.getText().contains(text));
    System.out.println(text);
        return this;
    }
}