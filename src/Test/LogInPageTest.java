package Test;

import Pages.LogInPage;
import TestBase.BaseClass;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class LogInPageTest {
    public static void main(String[] args) {

        // open the browser and navigate to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/validateCredentials

        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");


        // locate the element and send keys
        LogInPage logInPage=new LogInPage();
        WebElement username= logInPage.usernameField;
        CommonMethods.sendText(username,"Admin");


        WebElement password= logInPage.passwordField;
        CommonMethods.sendText(password,"11513");

        logInPage.loginbutton.click();

        //Take the screen shot

        CommonMethods.takeTheScreenShot("loginPage");




    }
}