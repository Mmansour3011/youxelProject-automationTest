package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {
    private WebDriver driver;
    private By checkOutButton = By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public AddressPage clickCheckOut() {
        driver.findElement(checkOutButton).click();
        return new AddressPage(driver);
    }
}
