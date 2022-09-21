package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Scanner;

public class CreateAccountPage {
    private WebDriver driver;
    private By firstNameLink = By.cssSelector("#customer_firstname");
    private By lastNameLink = By.cssSelector("#customer_lastname");
    private By passWordLink = By.cssSelector("#passwd");
    //    private By address_firstNameLink = By.id("firstname");
//    private By address_lastNameLink = By.id("lastname");
//    private By address_companyLink = By.id("company");
    private By address_addressLink = By.cssSelector("#address1");
    private By cityLink = By.cssSelector("#city");
    private By stateLink = By.cssSelector("#id_state");
    private By zipCodeLink = By.cssSelector("#postcode");
    private By mobilePhoneLink = By.cssSelector("#phone_mobile");
    private By registerButton = By.cssSelector("#submitAccount");

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setFirstName(String firstName) {
        driver.findElement(firstNameLink).sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        driver.findElement(lastNameLink).sendKeys(lastName);
    }

    public void setPassword(String password) {
        driver.findElement(passWordLink).sendKeys(password);
    }

    public void setAddress(String address_address) {
        driver.findElement(address_addressLink).sendKeys(address_address);
    }

    public void setCity(String city) {
        driver.findElement(cityLink).sendKeys(city);
    }

    private Select findDropDownElement() {
        return new Select(driver.findElement(stateLink));
    }

    public void selectState(String state) {
        findDropDownElement().selectByVisibleText(state);
    }

    public void setMobilePhone(String mobilePhone) {
        driver.findElement(mobilePhoneLink).sendKeys(mobilePhone);
    }

    public void setZipCode(String zipCode) {
        driver.findElement(zipCodeLink).sendKeys(zipCode);
    }

    public SummaryPage clickRegisterButton() {
        driver.findElement(registerButton).click();
        return new SummaryPage(driver);
    }



}
