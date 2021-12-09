package com.syntaxClass04HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {

        //  task3:(use css)
        //goto:http://syntaxprojects.com/input-form-demo.php
        //fill in all the textboxes in the form

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://syntaxprojects.com/input-form-demo.php");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input.form-control")).sendKeys("Jose");
        driver.findElement(By.cssSelector("input[name='last_name'")).sendKeys("Cuervo");
        driver.findElement(By.cssSelector("input[name='email'")).sendKeys("josec123@gmail.com");
        driver.findElement(By.cssSelector("input[name='phone'")).sendKeys("305 455-1382");
        driver.findElement(By.cssSelector("input[name='address']")).sendKeys("1234 Im confused Lane");
        driver.findElement(By.cssSelector("input[placeholder='city']")).sendKeys("Fairfax");
        driver.findElement(By.cssSelector("select[name='state']")).sendKeys("Virginia");
        driver.findElement(By.cssSelector("input[name='zip']")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[name='website']")).sendKeys("www.syntaxiscool.com");
        driver.findElement(By.cssSelector("input[value='no']")).click();
        driver.findElement(By.cssSelector("textarea[name='comment']")).sendKeys("learning syntax");
        Thread.sleep(2000);




    }
}
