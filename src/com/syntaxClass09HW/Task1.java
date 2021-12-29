package com.syntaxClass09HW;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Task1 {
    public static String url="https://chercher.tech/practice/explicit-wait";

    public static void main(String[] args) {

        //HW!
        //goto https://chercher.tech/practice/explicit-wait
        //1.click on open an alert after 5 sec and then using implicit wait manage that alert
        //2.click on display button after 10 sec and once the button is displayed  print the status of isDisplayed()

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("button#alert")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert simpleAlert=driver.switchTo().alert();
        simpleAlert.accept();


        driver.findElement(By.cssSelector("button#display-other-button")).click();
        WebDriverWait wait1=new WebDriverWait(driver,20);
        wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#hidden")));
        WebElement Button=driver.findElement(By.cssSelector("button#hidden"));
        boolean status=Button.isDisplayed();
        System.out.println(status);


    }
}
