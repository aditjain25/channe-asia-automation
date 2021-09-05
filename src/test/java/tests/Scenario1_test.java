package tests;
import base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.DetailedNewsPage;

public class Scenario1_test extends TestBase {
    @Test
    public void validateNewsHeadlineAndExpandThirdStory () throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        DetailedNewsPage detailedNewsPage = PageFactory.initElements(driver, DetailedNewsPage.class);
        TestBase.openBrowser("https://www.channelnewsasia.com/");
        String newsHeadline=homePage.getNewsHeadline();
        homePage.clickNewsHeadLine();
        Assert.assertEquals(newsHeadline,detailedNewsPage.getDetailedNewsHeadline());
        detailedNewsPage.scrollDownTillSecondNewsLoaded();
        detailedNewsPage.expandSecondFullStory();
    }
}
