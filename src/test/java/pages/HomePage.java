package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage  {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using =
            "//a[@class='feature-card__heading-link feature-card__heading-link--']")
    WebElement newsHeadLine;

    @FindBy(how = How.XPATH, using =
            "//ul[@class='main-menu']//span[@class='all-section-menu main-menu__link']")
    WebElement allSectionsDropdown;

    @FindBy(how = How.XPATH, using =
            "//ul[@class='main-menu']//a[@href='/singapore']")
    WebElement singaporeEdition;

    public void clickNewsHeadLine() {
        newsHeadLine.click();
    }

    public String getNewsHeadline(){
        return newsHeadLine.getText();
    }

    public void clickAllSectionsDropdown() {
        allSectionsDropdown.click();
    }

    public void clickSingaporeEdition(){
        singaporeEdition.click();
    }

}
