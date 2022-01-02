package com.syntaxClass11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalendarsDemo2 {
    public static String url="https://www.sastaticket.pk/";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);


        // Locating and clicking the calendar
        driver.findElement(By.xpath("(//*[@class='dt_label'])[1]")).click();

        // find the desired month
        WebElement month=driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']"));
        System.out.println(month.getText());

        // get the next button
        WebElement nextbtn=driver.findElement(By.xpath("//button[text()='Next Month']"));


        // go to the month of September
        boolean notfound=true;
        while (notfound){
            if(month.getText().equalsIgnoreCase("September 2022")){
                System.out.println(month.getText());
                notfound=false;

        // select the date
                List<WebElement> dates = driver.findElements(By.xpath("(//div[@class='react-datepicker__month'])[1]/div/div"));
        //  traverse through the dates and select the 15th date
            for(WebElement date:dates){
                if(date.getText().equalsIgnoreCase("15")){
                    date.click();
                    break;
                }
            }
            }
            else{
                nextbtn.click();
            }
        }
    }
}
