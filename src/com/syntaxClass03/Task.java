package com.syntaxClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com");

        WebElement hi=driver.findElement(By.xpath("//a[@id='btn_basic_example']"));
        hi.click();
        Thread.sleep(2000);


        WebElement hello=driver.findElement(By.xpath("//a[@class='list-group-item']"));
        hello.click();
        Thread.sleep(2000);

        WebElement ho=driver.findElement(By.xpath("//input[@type='text']"));
        ho.sendKeys("hello there");

        WebElement he=driver.findElement(By.xpath("//button[@type='button']"));
        he.click();
        Thread.sleep(2000);

        driver.quit();






    }
}
