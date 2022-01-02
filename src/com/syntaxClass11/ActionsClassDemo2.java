package com.syntaxClass11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionsClassDemo2 {
    public static String url = "http://amazon.com/";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);


        // find the element
        WebElement accountsAndList=driver.findElement(By.cssSelector("a#nav-link-accountList"));

        Actions action=new Actions(driver);
        action.moveToElement(accountsAndList).perform();




    }
}
