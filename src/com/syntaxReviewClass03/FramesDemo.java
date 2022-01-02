package com.syntaxReviewClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FramesDemo {
    public static String  url="https://demoqa.com/frames";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        driver.switchTo().frame("frame1");

        WebElement text=driver.findElement(By.cssSelector("h1#sampleHeading"));
        String actualText= text.getText();
        System.out.println(actualText);

        driver.quit();
    }
}
