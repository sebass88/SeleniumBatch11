package com.Test;

import com.Pages.AdminPage;
import com.Pages.loginPageWithPageFactory;
import com.TestBase.BaseClass;
import org.openqa.selenium.WebElement;
import com.utils.CommonMethods;

public class AdminPageTest {
    public static void main(String[] args) {

        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        loginPageWithPageFactory login=new loginPageWithPageFactory();
        WebElement user=login.username;
        CommonMethods.sendText(user,"Admin");

        WebElement passwrd= login.password;
        CommonMethods.sendText(passwrd,"Hum@nhrm123");

        login.loginBtn.click();

        AdminPage adminp=new AdminPage();
        adminp.adminurl.click();

        WebElement inpusername=adminp.inpusername;
        CommonMethods.sendText(inpusername,"AlexBrown");

        WebElement role=adminp.role;
        CommonMethods.DropDownbyIndex(role,2);

        adminp.search.click();

        CommonMethods.takeTheScreenShot("Task3");

    }
}
