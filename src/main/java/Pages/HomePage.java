package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    By electronicTabBy = By.id("sub-nav-5");
    By closeDiscountPopupBy = By.className("modal-close");
    By tvGoruntuSesTabBy = By.cssSelector("a[href*=\"/tv-goruntu-ses-sistemleri-x-c104035\"]");
    private By electronicFieldBy = By.cssSelector("a[href='/butik/liste/elektronik']");

    public HomePage(WebDriver webDriver) { super(webDriver);}

    public void closeDiscountPopup(){

        click(closeDiscountPopupBy,4);
    }


    public void hoverElectronicPage() {

        hoverElement(electronicFieldBy, 4);

    }

    public  void clickTvGoruntuSes(){
        click(tvGoruntuSesTabBy, 4);
    }


    public void clickElectronicPage(){

        click(electronicFieldBy,4);
    }
}
