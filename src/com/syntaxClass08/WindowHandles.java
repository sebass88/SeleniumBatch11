package com.syntaxClass08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();

        // task is to open up a newtab and a new window
        //switch to a new tab and get the text

        //find button new tab
        WebElement newtab=driver.findElement(By.cssSelector("button#tabButton"));
        // find new window button
        WebElement newWindow=driver.findElement(By.cssSelector("button#windowButton"));

        // click on the newtab and new window button
        newtab.click();
        newWindow.click();
        // print the handle of the main/page/home page/parent page
        String parenthandle=driver.getWindowHandle();
        System.out.println("parent handle window is "+parenthandle);


        // to switch to new tab  and get the text
        // 1. get all the handles
        Set<String> allHandles=driver.getWindowHandles();

        //2. Find the desired handle of newtab by iterating through the set
        Iterator<String>it=allHandles.iterator();
        //3. Iterating over each handle to see if it is the desired one
        while (it.hasNext()){
            String handler= it.next();
            driver.switchTo().window(handler);
            // now get the title and check if it is the desired tab or not
            if(driver.getCurrentUrl().equalsIgnoreCase("https://demoqa.com/sample")){
                System.out.println(driver.getCurrentUrl());
                break;
            }
        }
        // succesfull switch
        WebElement text=driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println(text.getText());


        // click on the new window message button
        //driver.switchTo().defaultContent();
        driver.switchTo().window(parenthandle);
        driver.findElement(By.cssSelector("button#messageWindowButton")).click();


    }
}
