package ua.hillel.tests.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestLogin {
    @DataProvider(name = "userData")
    public Object[][] getDataFromDataProvider() {
        return new Object[][] {
                {"firstUser", "firstPassword", "admin"},
                {"secondUser", "secondPassword", "member"},
                {"thirdUser", "thirdPassword", ""},
                {"forthUser", "thirdPassword", "guest"}
        };
    }

    @Test(dataProvider = "userData", priority = 10)
    public void loginTest (String username, String password, String role){
        System.out.println("User " + username +" has role - " + role);
    }
}
