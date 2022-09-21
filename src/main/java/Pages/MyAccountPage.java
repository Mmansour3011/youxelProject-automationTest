package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {
    private WebDriver driver;
    private By dressesButton = By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a");

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public DressesPage clickDresses() {
        driver.findElement(dressesButton).click();
        return new DressesPage(driver);
    }

}
