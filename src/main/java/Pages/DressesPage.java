package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DressesPage {
    private WebDriver driver;

    private By summerDressButton=By.cssSelector("#subcategories > ul > li:nth-child(3) > div.subcategory-image > a > img");



    public DressesPage(WebDriver driver) {
        this.driver = driver;
    }
    public SummerDressPage clickSummerDress(){
        driver.findElement(summerDressButton).click();
        return new SummerDressPage(driver);

    }



}
