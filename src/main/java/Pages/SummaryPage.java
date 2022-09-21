package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SummaryPage {
    private WebDriver driver;
    private By signOutButton=By.cssSelector(".logout");

    public SummaryPage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage clickSignOut(){
        driver.findElement(signOutButton).click();
        return new HomePage(driver);
    }
}
