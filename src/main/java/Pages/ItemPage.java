package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class ItemPage extends BasePage {

    private By resultTextBy = By.cssSelector(".dscrptn>h1");
    private By itemBy = By.cssSelector("a[href='/philips/hp8361-00-procare-keratin-sac-duzlestirici-p-100325']");
    private By itemTextBy = By.cssSelector("a[href='/philips/hp8361-00-procare-keratin-sac-duzlestirici-p-100325']>* .p-card-img");


    public ItemPage(WebDriver webDriver) { super(webDriver); }

    public String getMainCategoryText() {
        return webDriver.findElement(resultTextBy).getText();
    }

    public void goThirdPage(){
        String thirdPageUrl = webDriver.getCurrentUrl()+"?pi=3";
        webDriver.get(thirdPageUrl);
        try {
            webDriver.findElement(By.cssSelector(".overlay")).click();

        }catch (NoSuchElementException e){   }
    }

    public String getItemText() {
        return webDriver.findElement(itemTextBy).getAttribute("alt");
    }

    public void clickSpesificItem(){
        click(itemBy, 4);

    }

}
