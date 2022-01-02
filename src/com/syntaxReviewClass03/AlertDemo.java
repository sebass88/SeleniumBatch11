package com.syntaxReviewClass03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AlertDemo {
    public static String url="http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        WebElement alertbtn=driver.findElement(By.cssSelector("button#alert"));
        alertbtn.click();

        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();

        driver.quit();


    }
}
