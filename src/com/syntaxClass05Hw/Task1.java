package com.syntaxClass05Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        //HW1: Amazon link count:
        //Open chrome browser
        //Go to “https://www.amazon.com/”
        //Get all links
        //Get number of links that has text
        //Print to console only the links that has text

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");


        List<WebElement>links=driver.findElements(By.tagName("a"));
        System.out.println("the size of the list is "+links.size());

        for(WebElement link:links){
            String linkwtext= link.getText();

            if(!linkwtext.isEmpty()){
                System.out.println(linkwtext);

                String linkaddress=link.getAttribute("href");
                System.out.println(linkaddress);
            }
        }

    }
}
