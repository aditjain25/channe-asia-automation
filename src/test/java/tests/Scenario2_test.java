package tests;

import base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DetailedNewsPage;
import pages.HomePage;
import pages.SingaporeEditionPage;

public class Scenario2_test extends TestBase {
    @Test
    public void validateNewsHeadlineAndExpandThirdStory_Singapore () throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        SingaporeEditionPage singaporeEditionPage= PageFactory.initElements(driver,SingaporeEditionPage.class);
        DetailedNewsPage detailedNewsPage = PageFactory.initElements(driver, DetailedNewsPage.class);
        TestBase.openBrowser("https://www.channelnewsasia.com/news/international");
        homePage.clickSingaporeEdition();
        singaporeEditionPage.waitForSingaporeEditionPageToLoad();
        String newsHeadline_singapore=singaporeEditionPage.getNewsHeadline_singapore();
        singaporeEditionPage.clickNewsHeadLine_singapore();
        Assert.assertEquals(newsHeadline_singapore,detailedNewsPage.getDetailedNewsHeadline());
        detailedNewsPage.scrollDownTillSecondNewsLoaded();
        detailedNewsPage.expandSecondFullStory();
    }
}
