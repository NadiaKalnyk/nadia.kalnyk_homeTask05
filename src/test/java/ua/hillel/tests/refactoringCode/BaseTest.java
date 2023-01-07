package ua.hillel.tests.refactoringCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ua.hillel.homeTask_16.PageObject2.CrossbrowserTestingSite;
import ua.hillel.homeTask_16.PageObject1.TheInternetSite;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver !=null){
            driver.quit();
        }
    }

    public TheInternetSite openMainPageTheInternetSite(){
        driver.get("https://the-internet.herokuapp.com/");
        return new TheInternetSite(driver);
    }
    public CrossbrowserTestingSite openMainPageCrossbrowserTestingSite(){
        driver.get("https://crossbrowsertesting.github.io/");
        return new CrossbrowserTestingSite(driver);
    }
}
