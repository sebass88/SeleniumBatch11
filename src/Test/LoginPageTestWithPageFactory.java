package Test;

import Pages.loginPageWithPageFactory;
import TestBase.BaseClass;

public class LoginPageTestWithPageFactory {
    public static void main(String[] args) {

        // open the browser
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        // create an object of loginwithPageFactory
        loginPageWithPageFactory loginWPG=new loginPageWithPageFactory();
        loginWPG.username.sendKeys("Admin");




        loginWPG.password.sendKeys("Hum@nhrm123");
        loginWPG.loginBtn.click();


    }

}