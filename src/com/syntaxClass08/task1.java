package com.syntaxClass08;

import com.syntaxClass05.DriverCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class task1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://syntaxprojects.com/dynamic-elements-loading.php");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        WebElement button=driver.findElement(By.cssSelector("button#startButton"));
        button.click();

       WebElement text= driver.findElement(By.xpath("//div[@id='finish']/h4"));
        System.out.println(text.getText());
    }
}
