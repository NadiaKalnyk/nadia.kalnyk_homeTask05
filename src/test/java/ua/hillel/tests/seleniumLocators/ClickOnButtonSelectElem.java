package ua.hillel.tests.seleniumLocators;

/*потрібно знайти і клікнути по кожній кнопці, після чого
вибрати всі значення з 4го стовбця таблиці і вивести їх на екран*/

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.By.cssSelector;

public class ClickOnButtonSelectElem {
    final int collectionSize = 11;
    @Test
    public void clickOnButtonsAndShowElemOf4Colum() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/challenging_dom ");

        driver.findElement(cssSelector("[id='323823e0-677f-013b-9e37-5efda14eb2e0']")).click();
        driver.findElement(cssSelector(".button.alert")).click();
        driver.findElement(cssSelector(".button.success")).click();

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < collectionSize; i++) {
            System.out.println(driver.findElement(cssSelector("tbody tr:nth-of-type("+i+") td:nth-of-type(4)")).getText());
        }
        driver.quit();
    }
}
