package MainTest;

import Base.BaseTest;
import Pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Scanner;

import static org.testng.Assert.assertEquals;

public class mainTest extends BaseTest {
    private WebDriver driver;


    @Test
    @Parameters
            ({"email", "password", "firstName", "lastName", "city", "zipCode", "address", "mobilePhone"})

    public void orderTest(String email, String password, String firstName, String lastName,
                          String city, String zipCode, String address, String mobilePhone) {
        SignInPage signInPage = homePage.clickSignIn();
        signInPage.type_Email_CreateAccount(email);
        CreateAccountPage createAccountPage = signInPage.clickCreateAccount();
        createAccountPage.setFirstName(firstName);
        createAccountPage.setLastName(lastName);
        createAccountPage.setPassword(password);
        createAccountPage.setAddress(address);
        createAccountPage.setCity(city);
        createAccountPage.selectState("Alaska");
        createAccountPage.setZipCode(zipCode);
        createAccountPage.setMobilePhone(mobilePhone);
        SummaryPage summaryPage = createAccountPage.clickRegisterButton();
        homePage = summaryPage.clickSignOut();
        signInPage = homePage.clickSignIn();
        signInPage.type_Email_SignIn(email);
        signInPage.type_Password_SignIn(password);
        MyAccountPage myAccountPage = signInPage.clickSignIn();
        DressesPage dressesPage = myAccountPage.clickDresses();
        SummerDressPage summerDressPage = dressesPage.clickSummerDress();
        summerDressPage.clickLargeSize();
        summerDressPage.clickOrangeColour();
        summerDressPage.clickAddToCart();
        CheckoutPage checkoutPage = summerDressPage.clickCheckOut();
        AddressPage addressPage = checkoutPage.clickCheckOut();
        ShippingPage shippingPage = addressPage.clickCheckOut();
        shippingPage.clickAgree();
        PaymentPage paymentPage = shippingPage.clickCheckOut();
        ConfirmationPage confirmationPage = paymentPage.clickPayByCheck();
        CompleteOrderPage completeOrderPage = confirmationPage.clickConfirm();
        OrdersHistoryPage ordersHistoryPage = completeOrderPage.clickBackToOrders();
        String orderStatus = ordersHistoryPage.getOrderStatus();
        assertEquals(orderStatus, "On backorder", "Order not confirmed");


    }


}
