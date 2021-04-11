package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultsPage extends BasePage{


//    By resultTitle = By.className("dscrptn");
    By resultTitle = By.cssSelector("div > h1");


    public ResultsPage(WebDriver webDriver) { super(webDriver); }

    public By getResultTitle() {
        return resultTitle;
    }
}
