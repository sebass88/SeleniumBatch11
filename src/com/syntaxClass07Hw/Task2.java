package com.syntaxClass07Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

    public static void main(String[] args) throws InterruptedException {

        //goto https://demoqa.com/nestedframes
        //print the text childframe on console

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/nestedframes");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.switchTo().frame("frame1");

        WebElement childframe=driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
        driver.switchTo().frame(childframe);

        WebElement childtext=driver.findElement(By.xpath("//p[text()='Child Iframe']"));
        System.out.println(childtext.getText());

    }
}
