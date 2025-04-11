package pl.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static pl.base.BasePage.webDriver;

public class ActionsUtility {

    public static void sendKeys(WebElement source, CharSequence keys) {
        act().sendKeys(source, keys).perform();
    }

    private static Actions act() {
        return new Actions(webDriver);
    }
}
