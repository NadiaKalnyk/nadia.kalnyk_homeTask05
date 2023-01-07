package ua.hillel.homeTask_16.PageObject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ua.hillel.homeTask_16.Base.BasePage;

public class SecureAreaPage extends BasePage {
    @FindBy(css = "a.radius")
    private WebElement LogoutButton;
    @FindBy(css = ".success")
    private WebElement SuccessToast;
    public SecureAreaPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPage logoutButton(){
        LogoutButton.click();
        return new LoginPage(driver);
    }

    public String getSuccessToast(){
        return SuccessToast.getText();
    }
}
