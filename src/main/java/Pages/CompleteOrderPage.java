package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompleteOrderPage {
    private WebDriver driver;
    private By backToOrders=By.cssSelector("#center_column > p.cart_navigation.exclusive > a");

    public CompleteOrderPage(WebDriver driver) {
        this.driver = driver;
    }
    public OrdersHistoryPage clickBackToOrders(){
        driver.findElement(backToOrders).click();
        return new OrdersHistoryPage(driver);
    }
}
