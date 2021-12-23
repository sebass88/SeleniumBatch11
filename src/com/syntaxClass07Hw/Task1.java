package com.syntaxClass07Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        //goto the Website https://syntaxprojects.com/window-popup-modal-demo.php
        //click on follow on instagram
        //click on facebook.com
        //get all windows handles
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();
        String mainpageHandle=driver.getWindowHandle();

        WebElement insta=driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Instagram']"));
        WebElement face=driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Facebook']"));
        face.click();
        Thread.sleep(2000);

        insta.click();
        Thread.sleep(2000);

        Set<String> allWindowsHandles=driver.getWindowHandles();
        System.out.println(allWindowsHandles.size());

        Iterator<String> iterator=allWindowsHandles.iterator();
        mainpageHandle=iterator.next();
        String instagramHandle=iterator.next();
        String facebookHandle=iterator.next();


        System.out.println("the handle for the main page is "+mainpageHandle);
        System.out.println("The handle for instagram is "+instagramHandle);
        System.out.println("The handle for facebook is "+facebookHandle);

    }
}
