package com.syntaxClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class forfun {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");

        WebElement hello=driver.findElement(By.xpath("//input[@type='text']"));
        hello.sendKeys("mikes america grill");
        hello.submit();
        Thread.sleep(2000);

        WebElement cliq=driver.findElement(By.xpath("//h3['text()=']"));
        cliq.click();
        Thread.sleep(2000);




    }
}
