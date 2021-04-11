package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Services.GetEmailAccount.takeEmail;

public class LoginPage extends BasePage {

    By signInUpBy = By.cssSelector(".q-secondary.q-button-medium.q-button.tab.button.right");
    By sendEmailBy = By.id("register-email");
    By sendPasswordBy = By.id("register-password-input");
    By signUpButtonBy = By.cssSelector(".q-primary.q-fluid.q-button-medium.q-button.submit");
    String password = "Helenoy1";


    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickSignUp(){

        click(signInUpBy, 4);

    }

    public HomePage signUp() {

        sendKeys(sendEmailBy,takeEmail());
        sendKeys(sendPasswordBy, password);
        click(signUpButtonBy,4);

        return new HomePage(webDriver);
    }
}