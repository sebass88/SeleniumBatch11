package com.syntaxClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework02 {
    public static void main(String[] args) throws InterruptedException {

        //navigate to fb.com
        //click on create new account
        //fill up all the textboxes
        //click on sign up button
        //close the pop up
        //close the browser


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.partialLinkText("Create")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Lisa");
        driver.findElement(By.name("lastname")).sendKeys("simpson");
        driver.findElement(By.name("reg_email__")).sendKeys("7034321382");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Ilovemarge123");
        driver.findElement(By.name("birthday_month")).sendKeys("Jun");
        driver.findElement(By.name("birthday_day")).sendKeys("23");
        driver.findElement(By.name("birthday_year")).sendKeys("1984");
        driver.findElement(By.className("_58mt")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        driver.quit();



    }
}
