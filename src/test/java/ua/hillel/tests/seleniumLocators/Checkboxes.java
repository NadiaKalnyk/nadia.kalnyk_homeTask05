package ua.hillel.tests.seleniumLocators;

/*вивести на екран початковий стан чекбоксів (вибраний чи ні), потім вибрати обидва.*/

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkboxes {
    @Test
    public void CheckUncheck () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkbox1;
        WebElement checkbox2;
        checkbox1 = driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]"));
        checkbox2 = driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]"));

        if (checkbox1.isSelected()) {
            System.out.println("Checkbox1 is selected");
        } else {
            System.out.println("Checkbox1 is unselected");
        }

        if (checkbox2.isSelected()) {
            System.out.println("Checkbox2 is selected");
        } else {
            System.out.println("Checkbox2 is unselected");
        }
        driver.quit();
    }

    @Test (dependsOnMethods="CheckUncheck")
    public void allAreChecked() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).click();
        driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]"));
        driver.quit();
    }

}
