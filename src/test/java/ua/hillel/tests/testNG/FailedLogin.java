package ua.hillel.tests.testNG;

import org.testng.annotations.Test;

public class FailedLogin extends TestLogin {
    @Test(dataProvider = "userData", dependsOnGroups = "login")
    public void failedTest (String username, String password, String role) {
        if (role.equals("")) {
            throw new RuntimeException("ERROR! " + username + " hasn't role");
        }
    }
}
