package tests;

import base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.NewsFilterPage;
import pages.WeatherPage;

public class Scenario3_test extends TestBase {
    @Test
    public void getWeather_Singapore ()  {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        NewsFilterPage newsFilterPage= PageFactory.initElements(driver, NewsFilterPage.class);
        WeatherPage weatherPage= PageFactory.initElements(driver, WeatherPage.class);
        TestBase.openBrowser("https://www.channelnewsasia.com/news/international");
        homePage.clickAllSectionsDropdown();
        newsFilterPage.clickWeather();
        weatherPage.waitForWeatherPageToLoad();
        System.out.println(weatherPage.getMaxTempSingapore());
        System.out.println(weatherPage.getMinTempSingapore());
        System.out.println(weatherPage.getWeatherConditionSingapore());
    }
}
