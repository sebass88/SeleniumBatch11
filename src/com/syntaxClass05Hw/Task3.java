package com.syntaxClass05Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {

        //Go to facebook
        //click on create new account  page
        //Fill out the whole form
        //Click signup

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();


        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement cliq=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button'"));
        cliq.click();
        Thread.sleep(2000);

        WebElement name=driver.findElement(By.cssSelector("input[name='firstname']"));
        name.sendKeys("jonny");

        WebElement password=driver.findElement(By.cssSelector("input[name='reg_passwd__']"));
        password.sendKeys("ilovemyself2021");

        WebElement lastname= driver.findElement(By.cssSelector("input[name='lastname']"));
        lastname.sendKeys("bravo");

        WebElement email=driver.findElement(By.cssSelector("input[name='reg_email__']"));
        email.sendKeys("hotguy1234@gmail.com");

        WebElement reenteremail=driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']"));
        reenteremail.sendKeys("hotguy1234@gmail.com");

        WebElement month=driver.findElement(By.cssSelector("select#month"));
        Select select=new Select(month);
        select.selectByValue("6");

        WebElement day=driver.findElement(By.cssSelector("select#day"));
        Select select1=new Select(day);
        select1.selectByValue("22");

        WebElement year=driver.findElement(By.cssSelector("select#year"));
        Select select2=new Select(year);
        select2.selectByValue("1986");

        WebElement male=driver.findElement(By.cssSelector("input[name='sex'][value='2']"));
        male.click();

        WebElement sub=driver.findElement(By.cssSelector("button[name='websubmit']"));
        sub.click();
        Thread.sleep(2000);

        driver.quit();


    }
}
