package ua.hillel.tests.seleniumLocators;

/*написати 2 тести на коректний та некоректний логін. В першому випадку перевірити,
що відображається повідомлення "You logged into a secure area!", в другому випадку -
що відображається повідомлення про неправильний логін/пароль*/

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.cssSelector;

public class Login {
    @Test(groups = "login")
    public void validLogin() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.xpath("//label[text()='Username']/../input")).click();
        driver.findElement(By.xpath("//label[text()='Username']/../input")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//label[text()='Password']/../input")).click();
        driver.findElement(By.xpath("//label[text()='Password']/../input")).sendKeys("SuperSecretPassword!");

        driver.findElement(cssSelector(".fa")).click();


        driver.findElement(cssSelector(".success")).getText().compareTo("You logged into a secure area!");
        driver.quit();
    }

    @Test(dependsOnGroups = "login")
    public void invalidLogin() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.xpath("//label[text()='Username']/../input")).click();
        driver.findElement(By.xpath("//label[text()='Username']/../input")).sendKeys("anotherUsername");
        driver.findElement(By.xpath("//label[text()='Password']/../input")).click();
        driver.findElement(By.xpath("//label[text()='Password']/../input")).sendKeys("userPassword");

        driver.findElement(cssSelector(".fa")).click();

        driver.findElement(cssSelector(".error")).getText().compareTo("Your username is invalid!");
        driver.quit();
    }
}
