package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingaporeEditionPage {
    WebDriver driver;
    WebDriverWait wait;

    public SingaporeEditionPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using =
            "//div[@class='top-stories-primary-section top-stories-primary-section--']//a[@class='h3__link h3__link-- list-object__heading-link']")
    WebElement newsHeadLine_singapore;

    public void waitForSingaporeEditionPageToLoad(){
        wait= new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.visibilityOf(newsHeadLine_singapore));
    }

    public String getNewsHeadline_singapore(){
        return newsHeadLine_singapore.getText();
    }

    public void clickNewsHeadLine_singapore() {
        newsHeadLine_singapore.click();
    }
}
