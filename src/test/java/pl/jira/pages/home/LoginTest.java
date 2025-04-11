package pl.jira.pages.home;

import org.testng.annotations.Test;
import pl.jira.pages.base.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void shouldLogInToAppWithCorrectData() {
        homePage.setUsername(EMAIL);
        homePage.clickLogin();
        homePage.setPassword(PASSWORD);
    }
}
