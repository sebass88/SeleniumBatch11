package com.syntaxClass6hw;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
    public static void main(String[] args) throws InterruptedException {

        //HW1:goto
        //http://syntaxprojects.com/javascript-alert-box-demo.php
        //handle all alerts one by one
        //1.simple
        //2.confirmation
        //3.prompt

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://syntaxprojects.com/javascript-alert-box-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement simple=driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']"));
        simple.click();
        Thread.sleep(2000);

        Alert simplealert=driver.switchTo().alert();
        simplealert.accept();
        Thread.sleep(2000);


        WebElement confirm=driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']"));
        confirm.click();
        Thread.sleep(2000);

        Alert confalert=driver.switchTo().alert();
        System.out.println(confalert.getText());
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);


        WebElement prompt=driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']"));
        prompt.click();
        Thread.sleep(2000);

        Alert pr=driver.switchTo().alert();
        pr.sendKeys(" I like making memes ");

        pr.accept();
        Thread.sleep(2000);




    }

}
