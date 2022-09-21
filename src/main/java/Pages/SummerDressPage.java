package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SummerDressPage {
    private WebDriver driver;
    private By size_large = By.id("layered_id_attribute_group_3");
    private By colour_orange = By.id("layered_id_attribute_group_13");
    private By dress = By.cssSelector("#center_column > ul > li > div > div.left-block > div > a.product_img_link > img");
    private By addToCart = By.cssSelector("#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");
    private By checkOut = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a");

    public SummerDressPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLargeSize() {
        driver.findElement(size_large).click();
    }

    public void clickOrangeColour() {
        driver.findElement(colour_orange).click();
    }

    public void clickAddToCart() {
        Actions actions = new Actions(driver);
        WebElement selectedDress = driver.findElement(dress);
        actions.moveToElement(selectedDress).perform();
        driver.findElement(addToCart).click();
    }

    public CheckoutPage clickCheckOut() {
        driver.findElement(checkOut).click();
        return new CheckoutPage(driver);
    }

}
