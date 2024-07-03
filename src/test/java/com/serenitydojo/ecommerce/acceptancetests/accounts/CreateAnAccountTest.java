package com.serenitydojo.ecommerce.acceptancetests.accounts;

import com.serenitydojo.ecommerce.actions.LoginActions;
import com.serenitydojo.ecommerce.actions.NavigationActions;
import com.serenitydojo.ecommerce.actions.RegisterAccountActions;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class CreateAnAccountTest extends UIInteractions {

    @Steps
    NavigationActions navigation;

    @Steps
    RegisterAccountActions registerAccount;

    @Steps
    LoginActions login;

    @Test
    void shouldCreateANewCustomerAccount() {
        registerAccount.forANewCustomer("Sarah-Jane", "Smith", randomEmail(), "Secret123");
        waitForTextToAppear("Thank you for registering with Main Website Store.");
        WebDriver driver = getDriver();
        driver.close();
    }

    @Test
    void shouldBeAbleToLoginWithRegisteredAccount() {
        String email = randomEmail();
        registerAccount.forANewCustomer("Amelia", "Pond", email, "Secret123");
        login.signOut();
        navigation.openTheApplication();
        login.using(email, "Secret123");
        waitForTextToAppear("Welcome, Amelia Pond");
    }

    private String randomEmail() {
        return "some_random_address" + System.currentTimeMillis() + "@example.com";
    }
}
