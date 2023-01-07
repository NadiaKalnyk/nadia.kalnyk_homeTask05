package ua.hillel.homeTask_16.PageObject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import ua.hillel.homeTask_16.Base.BasePage;

import java.util.List;

public class ChallengingPage extends BasePage {
    @FindBy (css ="div a:nth-of-type(1).button")
    private WebElement button1;
    @FindBy (css = ".button.alert")
    private  WebElement button2;
    @FindBy(css = ".button.success")
    private WebElement button3;
    @FindBy (how = How.XPATH, using = "//table/tbody/tr/td[4]")
    private List<WebElement> count;

    public ChallengingPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public ChallengingPage clickButtons(){
        button1.click();
        button2.click();
        button3.click();
        return this;
    }

    public ChallengingPage valuesOfElemIn4Column (){
        for (WebElement findElemOfSitColumn : count) {
            System.out.println(findElemOfSitColumn.getText());
        }
        return this;
    }
}
