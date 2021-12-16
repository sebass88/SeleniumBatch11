package com.syntaxClass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DriverCommands {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        // go to the website Ebay.com
        driver.get("http://ebay.com/");

        // get all the links that are there on ebay.com
        // as we have multiple elements with the tag name a so we use driver.findElements
        // as there are mulitple elements so we need to store it in list of webelements
        List<WebElement>links=driver.findElements(By.tagName("a"));

        // print the size of the list
        System.out.println("The size of list contains links is "+links.size());

        // print the text of all  links
        for(WebElement link:links){
            // get the text out of the webelement link
            String linktext=link.getText();
            // Only print the links that have some text and ignore the rest
            if(!linktext.isEmpty()){
                System.out.println(linktext);
                // print all the links also along with the text
                // use the method. getAttribute to have the value of particular attribute in the tag

                String linkaddress=link.getAttribute("href");
                System.out.println(linkaddress);
            }

        }

    }
}
