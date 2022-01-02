package ForFun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Fun1 {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

//      for Username
        WebElement username = driver.findElement(By.cssSelector("input#txtUsername"));
        username.sendKeys("Admin");
//      for password
        WebElement passw = driver.findElement(By.cssSelector("input#txtPassword"));
        passw.sendKeys("Hum@nhrm123");
//      for Login Button
        driver.findElement(By.cssSelector("input#btnLogin")).click();

        driver.findElement(By.cssSelector("a#menu_leave_viewLeaveModule")).click();

        driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();

        WebElement months=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        months.click();

        Select select=new Select(months);
        select.selectByIndex(5);

        List<WebElement> date= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

        for(WebElement dates:date){
            if(dates.getText().equals("22")){
                dates.click();
                break;
            }
        }

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='calToDate']/following-sibling::img")).click();

        WebElement rmonths=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/select"));
        rmonths.click();

        Select select1=new Select(rmonths);
        select1.selectByIndex(7);

        List<WebElement> day= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

        for(WebElement days:day){
            if(days.getText().equals("15")){
                days.click();
                break;
            }
        }
    }
}
