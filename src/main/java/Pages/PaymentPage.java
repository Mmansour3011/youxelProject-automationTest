package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {
    private WebDriver driver;
    private By payByCheck=By.cssSelector("#HOOK_PAYMENT > div:nth-child(2) > div > p > a");

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    public ConfirmationPage clickPayByCheck(){
        driver.findElement(payByCheck).click();
        return new ConfirmationPage(driver);
    }


}
