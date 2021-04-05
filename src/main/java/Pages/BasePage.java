package Pages;

import Services.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage extends WebDriverHelper {

    private By closePopUpButtonBy = By.className("fancybox-close");
    private By loginImageBy = By.className("account-user");

    public BasePage(WebDriver webDriver){ super(webDriver); }

    public LoginPage clickAccount() {


        click(loginImageBy, 5);
        return new LoginPage(webDriver);
    }

    public void closePopUp(){

        click(closePopUpButtonBy, 5);

    }



}
