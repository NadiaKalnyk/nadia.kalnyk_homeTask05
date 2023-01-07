package ua.hillel.homeTask_16.PageObject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import ua.hillel.homeTask_16.Base.BasePage;

import java.util.List;

public class CheckboxesPage extends BasePage {
    @FindBy(how = How.XPATH, using = "//*[@id='checkboxes']/input")
    private List<WebElement> allCheckboxes;

    public CheckboxesPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public CheckboxesPage CheckUncheck() {
        allCheckboxes.size();
        for (int i = 0; i < allCheckboxes.size(); i++)
            System.out.println("Checkbox #" + (i + 1) + " is " + (allCheckboxes.get(i).isSelected() ? "selected" : "unselected"));
        return this;
    }

    public CheckboxesPage allAreChecked(){
        boolean allSelected = true;
        for (WebElement checkbox : allCheckboxes) {
            if (!checkbox.isSelected()) {
                checkbox.click();
                allSelected = false;
            }
            if(allSelected){
                allSelected=true;
                System.out.println("ERROR: all checkboxes are selected");
            }
        }
        return this;
    }
}
