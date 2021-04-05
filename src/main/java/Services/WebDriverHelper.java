package Services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverHelper {

    protected WebDriver webDriver;

    public WebDriverHelper(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void click(By byElement, int timeOut) {
        WebDriverWait wait = new WebDriverWait(webDriver, timeOut);
        wait.until(ExpectedConditions.elementToBeClickable(byElement)).click();
    }

    public void sendKeys(By byElement, String text) {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(byElement)).sendKeys(text);
    }

    public String getText(By byElement) {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(byElement)).getText();
    }
    public void hoverElement(By selectorOfItem, int timeOut){

        WebDriverWait wait = new WebDriverWait(webDriver, timeOut);
        Actions actions = new Actions(webDriver);

        WebElement hoverElement = webDriver.findElement(By.cssSelector(String.valueOf(selectorOfItem)));
        actions.moveToElement(hoverElement).perform();



    }
}