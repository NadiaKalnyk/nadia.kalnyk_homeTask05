package ua.hillel.homeTask_16.PageObject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ua.hillel.homeTask_16.Base.BasePage;

public class TheInternetSite extends BasePage {
    @FindBy(linkText = "Form Authentication")
    private WebElement LoginPageLink;
    @FindBy(linkText = "Challenging DOM")
    private WebElement ChallengingLink;
    @FindBy(linkText = "Checkboxes")
    private WebElement CheckboxesLink;
    @FindBy(linkText = "Hovers")
    private WebElement HoversLink;

    public TheInternetSite(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPage goToLoginPage(){
        LoginPageLink.click();
        return new LoginPage(driver);
    }

    public ChallengingPage goToChallengingPage(){
        ChallengingLink.click();
        return new ChallengingPage(driver);
    }
    public CheckboxesPage goToCheckboxesPage(){
        CheckboxesLink.click();
        return new CheckboxesPage(driver);
    }
    public HoversPage goToHoversPage(){
        HoversLink.click();
        return new HoversPage(driver);
    }
}
