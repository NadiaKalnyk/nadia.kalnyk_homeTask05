package ua.hillel.tests.seleniumLocators;

/*написати 2 тести на коректний та некоректний логін. В першому випадку перевірити,
що відображається повідомлення "You logged into a secure area!", в другому випадку -
що відображається повідомлення про неправильний логін/пароль*/

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.cssSelector;

public class Login {
    WebDriver driver = new ChromeDriver();
    @Test
    public void validLogin() {
        WebDriverManager.chromedriver().setup();
        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.xpath("//label[text()='Username']/../input")).click();
        driver.findElement(By.xpath("//label[text()='Username']/../input")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//label[text()='Password']/../input")).click();
        driver.findElement(By.xpath("//label[text()='Password']/../input")).sendKeys("SuperSecretPassword!");

        driver.findElement(cssSelector(".fa")).click();

        String actualResult = driver.findElement(By.cssSelector(".success")).getText();
        String expectedResult = "You logged into a secure area!";


        Assert.assertEquals(expectedResult, actualResult);

        driver.quit();
    }

    @Test
    public void invalidLogin() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.xpath("//label[text()='Username']/../input")).click();
        driver.findElement(By.xpath("//label[text()='Username']/../input")).sendKeys("anotherUsername");
        driver.findElement(By.xpath("//label[text()='Password']/../input")).click();
        driver.findElement(By.xpath("//label[text()='Password']/../input")).sendKeys("userPassword");

        driver.findElement(cssSelector(".fa")).click();

        Assert.assertEquals(driver.findElement(By.cssSelector(".error")).getText(), "Your username is invalid!");

        driver.quit();
    }
    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
