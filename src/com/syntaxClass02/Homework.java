package com.syntaxClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) {

        //navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        //fill out the form
        //click on register
        //close the browser


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Jose");
        driver.findElement(By.id("customer.lastName")).sendKeys("Cuervo");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 MemeWay");
        driver.findElement(By.id("customer.address.city")).sendKeys("springfield");
        driver.findElement(By.id("customer.address.state")).sendKeys("CA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("12345");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("703 123454845");
        driver.findElement(By.id("customer.ssn")).sendKeys("1231313215");

        driver.findElement(By.id("customer.username")).sendKeys("MemeManager123@gmail.com");
        driver.findElement(By.id("customer.password")).sendKeys("Iwilldomemes");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Iwilldomemes");
        driver.findElement(By.className("button")).click();
        driver.close();

    }
}
