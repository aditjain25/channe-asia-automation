package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WeatherPage {
    WebDriver driver;
    WebDriverWait wait;

    public WeatherPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using =
            "//div[@class='weather__card--today']//span[@class='info-today__temp--max']")
    WebElement maxTempSingapore;

    @FindBy(how = How.XPATH, using =
            "//div[@class='weather__card--today']//span[@class='info-today__temp--min']")
    WebElement minTempSingapore;

    @FindBy(how = How.XPATH, using =
            "//div[@class='weather__card--today']//div[@class='info-today__condition']")
    WebElement weatherConditionSingapore;

    public void waitForWeatherPageToLoad(){
        wait= new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.visibilityOf(maxTempSingapore));
    }

    public String getMaxTempSingapore(){
        return maxTempSingapore.getText();
    }

    public String getMinTempSingapore(){
        return minTempSingapore.getText();
    }

    public String getWeatherConditionSingapore(){
        return weatherConditionSingapore.getText();
    }


}
