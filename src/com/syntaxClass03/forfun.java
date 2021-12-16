package com.syntaxClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class forfun {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://peru.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

       driver.findElement(By.xpath(" //a[text()='Fútbol']")).click();
       Thread.sleep(2000);

       driver.navigate().to("https://www.google.com/");
       Thread.sleep(3000);

       driver.navigate().to("http://www.espn.com");













    }
}
