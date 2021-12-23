package com.syntaxClass07Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class task3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();
        String mainPageHandle = driver.getWindowHandle();

        WebElement bottonInst = driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Instagram']"));

        WebElement bottonFB = driver.findElement(By.xpath("//a[text()=' Like us On Facebook ']"));

        bottonFB.click();
        Thread.sleep(2000);
        bottonInst.click();
        Thread.sleep(2000);

        Set<String> allWindowsHandles = driver.getWindowHandles();

        Iterator<String> iterator = allWindowsHandles.iterator();
        mainPageHandle = iterator.next();
        String instPageHandle = iterator.next();
        String FBPageHandle = iterator.next();

        System.out.println("Handle for Instagram page is: " + instPageHandle);
        System.out.println("Handle for Facebook page is: " + FBPageHandle);
        System.out.println("Handle for the main page is: " + mainPageHandle);

        driver.quit();


    }
}
