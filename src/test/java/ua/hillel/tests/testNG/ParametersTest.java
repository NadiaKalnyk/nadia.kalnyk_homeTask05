package ua.hillel.tests.testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

    @Test (priority = 30)
    @Parameters ({"userValue", "passwordValue", "roleValue"})
    public void parametersTest (@Optional ("userNameDefault") String userValue, @Optional ("passDefault") String passwordValue, @Optional ("roleDefault") String roleValue) {
        System.out.println("Test with parameters " + userValue +" "+ passwordValue+" "+ roleValue);
    }
}
