package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.utils.CommonMethods;

public class LogInPage extends CommonMethods {

           public WebElement usernameField=driver.findElement(By.xpath("//*[@name='txtUsername']"));
           public WebElement passwordField=driver.findElement(By.xpath("//*[@name='txtPassword']"));
           public WebElement loginbutton=driver.findElement(By.xpath("//*[@name='Submit']"));


}
