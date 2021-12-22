package com.syntaxClass07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        // switch to the desired frame as our desired webelement is inside that frame
        driver.switchTo().frame("frame1");


        // getting the webelement

        WebElement text1=driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println(" the text is  "+ text1.getText());

        // as frame 2 doesn't lie in frame 1 so in order to get there we need to
        // switch out focus to the default page
        driver.switchTo().defaultContent();


        // switch to frame 2

        driver.switchTo().frame("frame2");
        //locate the web element
        WebElement text02=driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("the text is   "+text02.getText());

        // in order to click on webelement form
        // switch back to the default page
        driver.switchTo().defaultContent();

    }
}
