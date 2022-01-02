package com.syntaxClass11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JavaScriptExecutorDemo {
    public static String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");

//      Create an instance of JS Executor
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].style.border='2px solid red'",username);


        js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');",password);


        // locate the element login button
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        // USING SELENIUM  loginButton.click();
        js.executeScript("arguments[0].click();", loginButton);




    }
}
