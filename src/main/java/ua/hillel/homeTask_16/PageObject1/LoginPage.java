package ua.hillel.homeTask_16.PageObject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ua.hillel.homeTask_16.Base.BasePage;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//label[text()='Username']/../input")
    private WebElement UsernameInput;
    @FindBy(xpath = "//label[text()='Password']/../input")
    private WebElement PasswordInput;
    @FindBy(css = ".fa")
    private WebElement LoginButton;
    @FindBy(css = ".error")
    private WebElement ErrorToast;

    public  LoginPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPage setUsername (String username){
        setText(UsernameInput, username);
        return this;
    }

    public LoginPage setPassword(String password){
        setText(PasswordInput, password);
        return this;
    }

    public SecureAreaPage clickLoginButton(){
        clickButton(LoginButton);
        return new SecureAreaPage(driver);
    }

    public SecureAreaPage validLogin(String username, String password) {
        setUsername(username);
        setPassword(password);
        clickLoginButton();
        return new SecureAreaPage(driver);
    }

    public LoginPage invalidLogin(String username, String password){
        setUsername(username);
        setPassword(password);
        clickLoginButton();
        return new LoginPage(driver);

    }
    public String getErrorToast(){
        return ErrorToast.getText();
    }
}
