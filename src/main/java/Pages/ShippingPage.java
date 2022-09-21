package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPage {
    private WebDriver driver;
    private By checkOutButton = By.cssSelector("#form > p > button");
    private By agreeButton=By.id("cgv");



    public ShippingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAgree(){
        driver.findElement(agreeButton).click();
    }

    public PaymentPage clickCheckOut() {
        driver.findElement(checkOutButton).click();
        return new PaymentPage(driver);
    }


}
