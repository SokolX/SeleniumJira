package pl.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    public static WebDriver webDriver;

    public void setDriver(WebDriver driver) {
        BasePage.webDriver = driver;
    }

    protected WebElement find(By locator) {
        return webDriver.findElement(locator);
    }

    protected void click(By locator) {
        find(locator).click();
    }

    public static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
