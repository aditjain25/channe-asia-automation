package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewsFilterPage {
    WebDriver driver;
    JavascriptExecutor js;

    public NewsFilterPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using =
            "//div[@id='hamburger-nav']//a[contains(text(),'Weather')]")
    WebElement weather;

    public void clickWeather(){
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", weather);
    }

}
