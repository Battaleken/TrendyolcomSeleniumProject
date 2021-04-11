package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {
    By electronicTabBy = By.cssSelector("a[href*=\"/butik/liste/elektronik\"]");
    By kisiselBakimTabBy = By.cssSelector("a[href*=\"/elektronik-kisisel-bakim-x-c103109\"]");
    By closeDiscountPopupBy = By.className("modal-close");


    public HomePage(WebDriver webDriver) { super(webDriver);}

    public void closeDiscountPopup(){

        click(closeDiscountPopupBy,4);
    }

    public ItemPage selectSubCategoryAndCheck() throws InterruptedException {

        moveToElement(electronicTabBy);
        click(kisiselBakimTabBy,4);

    return new ItemPage(webDriver);
    }

    public void scrollThePage() throws InterruptedException {
        scrollPage();
    }


}
