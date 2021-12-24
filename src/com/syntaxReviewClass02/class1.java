package com.syntaxReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class class1 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://demo.guru99.com/selenium/newtours/register.php");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        WebElement firstname=driver.findElement(By.xpath("//input[@name='firstName']"));
        firstname.clear();
        firstname.sendKeys("jose");

        WebElement lastname=driver.findElement(By.xpath("//input[@name='lastName']"));
        lastname.clear();
        lastname.sendKeys("rodriguez");

        WebElement phonenumber=driver.findElement(By.xpath("//input[@name='phone']"));
        phonenumber.clear();
        phonenumber.sendKeys("701-455-2385");

        WebElement email=driver.findElement(By.xpath("//input[@name='userName']"));
        email.clear();
        email.sendKeys("jrod123@google.com");

        WebElement home=driver.findElement(By.xpath("//input[@name='address1']"));
        home.clear();
        home.sendKeys("8547 javaishard street");

        WebElement City=driver.findElement(By.xpath("//input[@name='city']"));
        City.clear();
        City.sendKeys("fairfax");

        WebElement state=driver.findElement(By.xpath("//input[@name='state']"));
        state.clear();
        state.sendKeys("Virginia");

        WebElement zipcode=driver.findElement(By.xpath("//input[@name='postalCode']"));
        zipcode.clear();
        zipcode.sendKeys("22152");

        WebElement country=driver.findElement(By.xpath("//*[@name='country']"));
        Select select=new Select(country);
        select.selectByValue("UNITED STATES");

        WebElement username=driver.findElement(By.cssSelector("input#email"));
        username.clear();
        username.sendKeys("jose123");

        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        password.clear();
        password.sendKeys("seleniumisgood");

        WebElement confpass=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
        confpass.clear();
        confpass.sendKeys("seleniumisgood");

        WebElement submitBtn=driver.findElement(By.xpath("//input[@name='submit']"));
        submitBtn.click();

        WebElement message=driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > p:nth-child(3) > a > font > b"));

        driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
        if(message.isDisplayed()){
            System.out.println("Task is done");
        }else{
            System.out.println("work more and fix it");
        }
        driver.quit();

    }

}
