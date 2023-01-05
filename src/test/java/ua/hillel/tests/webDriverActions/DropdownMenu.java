package ua.hillel.tests.webDriverActions;

/*написати тест, який розкриває dropdown-меню, клікає по пункту Secondary Action і перевіряє,
що на сторінці показується текст "Secondary Page"*/

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropdownMenu {
    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html");
    }

    @Test
    public void dropDown() {
        WebElement dropDownMenu= driver.findElement(By.xpath("//a[@class='dropdown-toggle' and contains(text(), 'Dropdown ')]"));
        WebElement pointSecondaryMenu = driver.findElement(By.xpath("//a[@class='dropdown-toggle' and contains(text(), 'Secondary Menu ')]"));
        WebElement pointSecondaryAction = driver.findElement(By.xpath("//a[@onclick='handleSecondaryAction()']"));
        WebElement textSecondaryPage = driver.findElement(By.xpath("//div[@class='jumbotron secondary-clicked']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(dropDownMenu).moveToElement(pointSecondaryMenu).click(pointSecondaryAction).perform();

        Assert.assertTrue(textSecondaryPage.getText().contains("Secondary Page"));

    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
