package pl.jira.pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pl.base.BasePage;
import pl.jira.pages.HomePage;

import static pl.base.BasePage.delay;

public class BaseTest {

    private WebDriver webDriver;
    protected BasePage basePage;
    protected HomePage homePage;

    private final String JIRA_TRAINING_GROUND = "https://your-address-jira/login";
    public final String EMAIL = "example@example.com";
    public final String PASSWORD = "your-password!";

    @BeforeClass
    public void setUp() {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication() {
        webDriver.get(JIRA_TRAINING_GROUND);
        delay(3000);
        basePage = new BasePage();
        basePage.setDriver(webDriver);
        homePage = new HomePage();
    }

    @AfterClass
    public void tearDown() {
        delay(3000);
        webDriver.quit();
    }
}