package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Scanner;

public class HomePage {
    private WebDriver driver;
    private By signInButton = By.cssSelector(".login");


    public HomePage(WebDriver driver) {
        this.driver=driver;
    }

    public SignInPage clickSignIn() {
        driver.findElement(signInButton).click();
        return new SignInPage(driver);
    }


    }








