package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Methods {
    public WebDriverWait wait = new WebDriverWait(BasicDriver.getDriver(), Duration.ofSeconds(10));

    public void sendKeysMethod(WebElement element, String keys) {
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(keys);
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) BasicDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickMethod(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        element.click();
    }

    public void verifyContainsText(WebElement element, String value) {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().contains(value));
    }

    public void waitMethod(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
