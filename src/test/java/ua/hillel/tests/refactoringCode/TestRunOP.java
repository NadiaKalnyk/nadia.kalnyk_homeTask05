package ua.hillel.tests.refactoringCode;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.homeTask_16.PageObject1.LoginPage;
import ua.hillel.homeTask_16.PageObject1.SecureAreaPage;
import ua.hillel.tests.Base.BaseTest;

public class TestRunOP extends BaseTest {
    @Test
    public void Checkboxes() {
        openMainPageTheInternetSite().goToCheckboxesPage().
                CheckUncheck().
                allAreChecked();
    }
    @Test
    public void clickOnButtonsAndShowElemOf4Colum(){
        openMainPageTheInternetSite().goToChallengingPage()
                .clickButtons()
                .valuesOfElemIn4Column();
    }
    @Test
    public void displayUsernames() {
        openMainPageTheInternetSite().goToHoversPage()
                .displayUsernames();
    }
    @Test
    public void dragAndDrop() {
        openMainPageCrossbrowserTestingSite().goToDragAndDropPage()
                .dragAndDropAction();
    }
    @Test
    public void validLogin() {
        SecureAreaPage secureAreaPage = openMainPageTheInternetSite().goToLoginPage()
                .setUsername("tomsmith")
                .setPassword("SuperSecretPassword!")
                .clickLoginButton();

        String text = secureAreaPage.getSuccessToast();
        Assert.assertTrue(text.contains("You logged into a secure area!"));

    }

    @Test
    public void invalidLogin() {
        openMainPageTheInternetSite().goToLoginPage()
                .setUsername("invalidUsername")
                .setPassword("invalidPassword")
                .clickLoginButton();
        LoginPage loginPage = new LoginPage(driver);
        String text = loginPage.getErrorToast();
        Assert.assertTrue(text.contains("Your username is invalid!"));
    }
}
