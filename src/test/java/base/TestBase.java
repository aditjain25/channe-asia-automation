package base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    public static WebDriver driver = null;

    @BeforeSuite
    public void initialize() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void openBrowser(String url){
        driver.get(url);
    }

    @AfterSuite
    public void TeardownTest() {
        TestBase.driver.quit();
    }
}
