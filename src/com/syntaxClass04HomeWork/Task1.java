package com.syntaxClass04HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
//task1:(use xpath)
//RMS Application Negative Login:
//Open chrome browser
//Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
//Enter valid username
//Leave password field empty
//Click on login button
//Verify error message with text “Password cannot be empty” is displayed.


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("javanoob123");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        WebElement error=driver.findElement(By.xpath("//span[@id='spanMessage']"));

        System.out.println(error.getText());
        driver.quit();



    }
}
