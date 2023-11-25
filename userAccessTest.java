package Nellytester.testcases;

import Nellytester.common.TestListener;
import Nellytester.pageAction.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import userAction.pageAction;
@Listeners(TestListener.class)
public class userAccessTest {
    public static WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
    }

    @Test
    public void a_Test_SignIn() {
        pageAction.Login(driver, "client@demo.com", "riseDemo");
        Assert.assertTrue(HomePage.text_Dashboard(driver).isDisplayed());
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
