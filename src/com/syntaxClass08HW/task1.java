package com.syntaxClass08HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class task1 {
    public static void main(String[] args) {
        //goto http://syntaxprojects.com/window-popup-modal-demo.php
        //click on follow on instagram
        //get the title of new window and print it on the console

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        WebElement instBtn=driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Instagram']"));
        instBtn.click();

        Set<String> allHandles=driver.getWindowHandles();

        Iterator<String> iterator=allHandles.iterator();
        while(iterator.hasNext()){
            String child= iterator.next();
            driver.switchTo().window(child);
            if(child.contains("Instagram login")){

            }
        }
        System.out.println(driver.getTitle());
    }
}
