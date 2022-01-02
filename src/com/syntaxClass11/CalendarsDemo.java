package com.syntaxClass11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalendarsDemo {
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
//      Open the calendar
        driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();

        //      Find the Month
        WebElement month=driver.findElement(By.cssSelector("select.ui-datepicker-month"));
        Select select = new Select(month);
        select.selectByVisibleText("Jun");
        // Find the year
        WebElement year = driver.findElement(By.cssSelector("select.ui-datepicker-year"));
        Select select2= new Select(year);
        select2.selectByValue("2023");

        // Find the date
        List<WebElement> dates=driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td/a"));
        for(WebElement date:dates){
            String dateText=date.getText();
            if(dateText.equalsIgnoreCase("15")){
                date.click();
            }
        }


    }

}
