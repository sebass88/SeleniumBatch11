package com.syntaxClass11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionClass {
    public static String url="https://jqueryui.com/droppable/";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        // switch to the iframe
        driver.switchTo().frame(0);

        //locate the draggable
        WebElement draggable= driver.findElement(By.cssSelector("div#draggable"));

        // locate the drop off location
        WebElement dropoff=driver.findElement(By.cssSelector("div#droppable"));

        Actions actions=new Actions(driver);
        // drag the source to drop off
       // actions.dragAndDrop(draggable,dropoff).perform();

        actions.clickAndHold(draggable).moveToElement(dropoff).release().build().perform();


    }
}
