package ua.hillel.tests.webDriverActions;

/*написати тест, який буде перетаскувати елементи і перевіряти результат (що текст "Dropped!" відображається)*/

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ua.hillel.listeners.CustomExtentReportListener;

@Listeners(CustomExtentReportListener.class)
public class DragAndDrop {
    static {
        System.setProperty("extent.reporter.html.start", "true");
        System.setProperty("extent.reporter.html.out", "target/extentReport/ExtentHtml.html");
    }
    WebDriver driver = new ChromeDriver();
    @BeforeTest
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
    }

    @Test
    public void dragAndDrop(){
        WebElement  elementSource = driver.findElement(By.xpath("//div[contains(@class, 'ui-widget-content ui-draggable ui-draggable-handle')]"));
        WebElement elementTarget = driver.findElement(By.xpath("//div[contains(@class, 'ui-widget-header ui-droppable')]"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(elementSource, elementTarget).perform();

        Assert.assertEquals(elementTarget.getText(), "Dropped!");
    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
