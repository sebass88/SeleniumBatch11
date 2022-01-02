package com.syntaxReviewClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckBoxDemo {
    public static String url="http://syntaxprojects.com/basic-checkbox-demo.php";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        WebElement checkbox=driver.findElement(By.xpath("//*[@value='Option-1']"));

        if(checkbox.isSelected()){
            System.out.println("it is already selected");
        }else {
            checkbox.click();
        }
        Thread.sleep(2000);
        driver.quit();

    }
}
