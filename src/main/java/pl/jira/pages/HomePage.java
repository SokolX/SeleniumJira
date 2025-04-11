package pl.jira.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pl.base.BasePage;

import static pl.utilities.ActionsUtility.sendKeys;

public class HomePage extends BasePage {

    private final By usernameInput = By.cssSelector("input[type='email']");
    private final By loginSubmit = By.id("login-submit");
    private final By passwordInput = By.id("password");

    public void setUsername(String username) {
        sendKeys(find(usernameInput), Keys.chord(username));
    }

    public void setPassword(String password) {
        sendKeys(find(passwordInput), Keys.chord(password));
    }

    public void clickLogin() {
        click(loginSubmit);
        delay(3000);
    }
}
