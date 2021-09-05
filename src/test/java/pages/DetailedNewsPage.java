package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DetailedNewsPage {
    WebDriver driver;
    JavascriptExecutor js;

    public DetailedNewsPage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(how = How.XPATH, using =
            "//h1[@class='h1 h1--page-title']")
    WebElement detailedNewsHeadline;

    @FindBy(how = How.XPATH, using =
            "//div[@class='source source--with-label']")
    WebElement newsSource;

    @FindBy(how = How.XPATH, using =
            "//section[@id='block-mc-cna-theme-mainpagecontent']/article[1]/div[@class='article__read-full-story-wrapper hidden']")
    WebElement ReadFirstFullStory;

    @FindBy(how = How.XPATH, using =
            "//section[@id='block-mc-cna-theme-mainpagecontent']/article[2]/div[@class='article__read-full-story-wrapper hidden']")
    WebElement ReadSecondFullStory;

    @FindBy(how = How.XPATH, using =
            "//section[@id='block-mc-cna-theme-mainpagecontent']/article[3]//a[@class='article__read-full-story-button article__read-full-story-button--']")
    WebElement ReadThirdFullStory;

    public void scrollDownTillSecondNewsLoaded() throws InterruptedException {
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",newsSource);
        Thread.sleep(5000);
        js.executeScript("arguments[0].scrollIntoView(true);",ReadFirstFullStory);
        js.executeScript("arguments[0].scrollIntoView(true);",ReadSecondFullStory);
    }

    public void expandSecondFullStory(){
        ReadThirdFullStory.click();
    }

    public String getDetailedNewsHeadline(){
        return detailedNewsHeadline.getText();
    }

}
