package com.syntaxClass07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesWithWebElementMethod {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        // Switching to the desired  frame using Webelement
        WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frame1);

        // switch to default page
        driver.switchTo().defaultContent();

        // switch to the frame using index
        driver.switchTo().frame(1);
        System.out.println(driver.findElement(By.cssSelector("h1#sampleHeading")).getText());

    }
}
