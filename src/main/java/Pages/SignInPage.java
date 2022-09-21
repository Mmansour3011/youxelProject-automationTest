package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    private WebDriver driver;
    private By email_createAccountText = By.id("email_create");
    private By createAccountButton = By.id("SubmitCreate");
    private By email_SignInText = By.id("email");
    private By password_SignInText = By.id("passwd");
    private By signInButton=By.id("SubmitLogin");


    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void type_Email_CreateAccount(String email){
        driver.findElement(email_createAccountText).sendKeys(email);
    }

    public void type_Email_SignIn(String email){
        driver.findElement(email_SignInText).sendKeys(email);
    }

    public void type_Password_SignIn(String password){
        driver.findElement(password_SignInText).sendKeys(password);
    }

    public CreateAccountPage clickCreateAccount() {
        driver.findElement(createAccountButton).click();
        return new CreateAccountPage(driver);
    }
    public MyAccountPage clickSignIn(){
        driver.findElement(signInButton).click();
        return new  MyAccountPage(driver);
    }

}
