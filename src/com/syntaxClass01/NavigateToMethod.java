package com.syntaxClass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToMethod {

    public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com");
        Thread.sleep(2000);
        driver.navigate().to("http://www.amazon.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.close();


    }
}
