package ua.hillel.tests.seleniumLocators;

/*вивести на екран початковий стан чекбоксів (вибраний чи ні), потім вибрати обидва.*/

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Checkboxes {
    @Test
    public void CheckUncheck () {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");


        List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@id='checkboxes']/input"));
        for(int i = 0; i < checkboxes.size(); i++)
            System.out.println("Checkbox #" + (i+1) + " is " + (checkboxes.get(i).isSelected() ? "selected" : "unselected"));
        driver.quit();
    }

    @Test (dependsOnMethods="CheckUncheck")
    public void allAreChecked() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@id='checkboxes']/input"));
        for (WebElement checkbox : checkboxes) {
            if (checkbox.isSelected()) {
                System.out.println("ERROR: all checkboxes are selected");
            } else {
                checkbox.click();
            }
        }
        driver.quit();
    }

}
