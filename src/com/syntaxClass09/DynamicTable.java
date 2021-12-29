package com.syntaxClass09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTable {
    public static String url="http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx";
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        //print all the rows of the webtable in the console

        WebElement username=driver.findElement(By.cssSelector("#ctl00_MainContent_username"));
        username.sendKeys("Tester");

        WebElement password=driver.findElement(By.cssSelector("#ctl00_MainContent_password"));
        password.sendKeys("test");

        WebElement btn=driver.findElement(By.cssSelector("#ctl00_MainContent_login_button"));
        btn.click();

        // get all the rows
        List<WebElement>rows=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
        // print all the rows
        for(int i=1; i< rows.size();i++){
            // get the text
            String rowtext=rows.get(i).getText();
            System.out.println(rowtext);
            // check the checkbox if the row has the product screensaver
            if(rowtext.contains("ScreenSaver")){
                List<WebElement>checkBoxes=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[1]"));
                checkBoxes.get(i-1).click();
            }
        }
    }
}
