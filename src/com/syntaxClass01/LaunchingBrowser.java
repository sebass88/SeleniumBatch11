package com.syntaxClass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {

    public static void main(String[] args) {

        // set the path to the driver Executable

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        // creating a object of ChromeDriver
        WebDriver driver=new ChromeDriver();


        // calling a GET method to get to a particular website
        driver.get("http://www.google.com");

        // returns the current url loaded in the browser
        String url =driver.getCurrentUrl();
        System.out.println("The current URL loaded in browser is :" +url);

        // returns the title of the current page in the browser
        String title= driver.getTitle();
        System.out.println("The current of the page is " +title);

        // close the browser
        driver.quit();



    }
}
