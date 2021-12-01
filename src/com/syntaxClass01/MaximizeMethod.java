package com.syntaxClass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeMethod {
    public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

            WebDriver driver=new ChromeDriver();
            driver.get("http://www.google.com");

            // To maximize the window
            driver.manage().window().maximize();
            // To show fullscreen of your browser
            driver.manage().window().fullscreen();


    }
}
