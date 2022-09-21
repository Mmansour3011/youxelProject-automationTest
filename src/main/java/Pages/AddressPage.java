package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressPage {
    private WebDriver driver;
    private By checkOutButton = By.cssSelector("#center_column > form > p > button");


    public AddressPage(WebDriver driver) {
        this.driver = driver;
    }

    public ShippingPage clickCheckOut() {
        driver.findElement(checkOutButton).click();
        return new ShippingPage(driver);
    }
}
