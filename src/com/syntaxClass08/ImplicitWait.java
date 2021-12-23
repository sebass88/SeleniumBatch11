package com.syntaxClass08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://syntaxprojects.com/dynamic-data-loading-demo.php");
        driver.manage().window().maximize();

        // declaring a implicit wait for finding elements
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        // find the button to get new user
        WebElement getnewuser=driver.findElement(By.cssSelector("button#save"));
        getnewuser.click();
        // get the new user name
        WebElement fname=driver.findElement(By.xpath("//div[@id='First-Name']/p"));
        System.out.println(fname.getText());
    }
}
