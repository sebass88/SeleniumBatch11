package com.syntaxClass05Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {

        //Go to ebay.com
        //get all the categories and print them in the console
        //select Computers/Tables & Networking
        //click on search
        //verify the title of page

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();


        driver.get("http://ebay.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        List<WebElement>categorie=driver.findElements(By.cssSelector("select.gh-sb"));
        for(WebElement cat:categorie){
            System.out.println(cat.getText());
        }
        WebElement categories=driver.findElement(By.cssSelector("select#gh-cat"));

        Select select=new Select(categories);
        select.selectByValue("58058");
        Thread.sleep(2000);

        WebElement cliq=driver.findElement(By.cssSelector("input#gh-btn"));
        cliq.click();

        driver.findElement(By.cssSelector("span.b-pageheader__text"));
        System.out.println(" the title is "+driver.getTitle());
        Thread.sleep(2000);
        driver.quit();

    }
}
