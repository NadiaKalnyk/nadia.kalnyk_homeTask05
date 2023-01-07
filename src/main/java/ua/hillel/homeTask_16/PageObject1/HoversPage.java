package ua.hillel.homeTask_16.PageObject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import ua.hillel.homeTask_16.Base.BasePage;

import java.util.List;

public class HoversPage extends BasePage {
    @FindBy(how = How.XPATH, using = "//*[@class ='example']/div/img[1]")
    private List<WebElement> images;
    @FindBy (how = How.TAG_NAME, using = "h5")
    private List<WebElement> userNames;
    public HoversPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public HoversPage displayUsernames() {
        for(WebElement image: images) {
            actions.moveToElement(image).perform();
            for (WebElement userName : userNames) {
                System.out.println(userName.getText().replaceAll("name:",""));
            }
        }
        return this;
    }
}
