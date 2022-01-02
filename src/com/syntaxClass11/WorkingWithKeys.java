package com.syntaxClass11;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WorkingWithKeys {
    public static String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        // locate the username
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));

        // locate the password
        WebElement password = driver.findElement(By.name("ctl00$MainContent$password"));

        // send user name
        username.sendKeys("Tester", Keys.TAB);

        // send password
        password.sendKeys("test",Keys.ENTER);

        // taking a screenshot

        TakesScreenshot ts=(TakesScreenshot)  driver;
        // to take the screen shot this step takes the screen shot
        File sourcefile=ts.getScreenshotAs(OutputType.FILE);

        //save the screen shot in our computer
        try {
            // copy the screen shot to a new directory inside the project and
            // give the path to that particular screenshot
            FileUtils.copyFile(sourcefile,new File("screenshot/login/adminlogin.png"));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
