package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrdersHistoryPage {
    private WebDriver driver;
    private By orderStatus=By.cssSelector(".history_state");

    public OrdersHistoryPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getOrderStatus(){
        return driver.findElement(orderStatus).getText();
    }

}
