package userAction;

import Nellytester.pageAction.LoginPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class pageAction {
    public static  void Login (WebDriver driver, String email, String password){
        LoginPage.loadPage(driver);
        LoginPage.Email(driver).sendKeys(Keys.CONTROL,"a");
        LoginPage.Email(driver).sendKeys(email);
        LoginPage.Password(driver).sendKeys(Keys.CONTROL,"a");
        LoginPage.Password(driver).sendKeys(password);
        LoginPage.SignIn(driver).click();
    }

}
