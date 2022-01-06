package Test;

import Pages.DashBoardPage;
import Pages.loginPageWithPageFactory;
import TestBase.BaseClass;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class DashBoardPageTest {

    public static void main(String[] args) {

        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        loginPageWithPageFactory login=new loginPageWithPageFactory();
        WebElement user=login.username;
        CommonMethods.sendText(user,"Admin");

        WebElement pass=login.password;
        CommonMethods.sendText(pass,"Hum@nhrm123");

        login.loginBtn.click();


        DashBoardPage dashboard=new DashBoardPage();
        WebElement message=dashboard.welcomeMessage;
        System.out.println(message.getText());

        CommonMethods.takeTheScreenShot("dashboardpage");


    }
}
