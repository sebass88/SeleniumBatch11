package com.syntaxClass05Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {

        //HRMS Application Negative Login:
        //Open chrome browser
        //Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
        //Enter valid username
        //Leave password field empty
        //Click on login button
        //Verify error message with text “Password cannot be empty” is displayed.


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement username=driver.findElement(By.cssSelector("input#txtUsername"));
        username.sendKeys("Admin");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input#btnLogin")).click();

        WebElement empty=driver.findElement(By.cssSelector("span#spanMessage"));
        System.out.println(empty.getText());
        Thread.sleep(2000);
        driver.quit();


    }
}
