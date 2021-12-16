package com.syntaxClass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        // navigate to this website
        // fill the username AON
        // delete the username
        // fill the new username "Tester"

        WebElement username= driver.findElement(By.cssSelector("input#ctl00_MainContent_username"));
        username.sendKeys("AON");
        // Delete the username entered
        Thread.sleep(2000);
        username.clear();
        //Enter the new username
        Thread.sleep(2000);
        username.sendKeys("Tester");
    }
}
