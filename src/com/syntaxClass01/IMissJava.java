package com.syntaxClass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IMissJava {

     public static void main(String[] args) {

          System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

          WebDriver driver=new ChromeDriver();
          driver.get("http://www.amazon.com");

          String title= driver.getTitle();
          System.out.println("The current of the page is " +title);
          driver.close();
     }


}
