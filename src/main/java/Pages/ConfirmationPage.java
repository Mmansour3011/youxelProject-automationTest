package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage {
    private WebDriver driver;
    private By confirmationButton=By.cssSelector("#cart_navigation > button");

    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    public CompleteOrderPage clickConfirm(){
        driver.findElement(confirmationButton).click();
        return new CompleteOrderPage(driver);
    }

}
