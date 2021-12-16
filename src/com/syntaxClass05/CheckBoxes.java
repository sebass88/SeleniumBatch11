package com.syntaxClass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        // locate the webelement checkbox
        WebElement singlecheckbox=driver.findElement(By.cssSelector("input#isAgeSelected"));
        singlecheckbox.click();
        Thread.sleep(2000);

        // unchecked the check box
        singlecheckbox.click();

        // Task 2 check all the the text boxes simultaneously
        // select an xpath that has common attributes value for all the checkboxes

        List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));
        // print the number of checkboxes
        int size=checkboxes.size();
        System.out.println("The total number of checkboxes is : "+ size);

        for(WebElement checkbox:checkboxes){

        // select the checkbox 3

        // get the attribute value
            String valueofAttribute=checkbox.getAttribute("value");
            System.out.println(valueofAttribute);

        // check only whose value is Option-3
        if(valueofAttribute.equalsIgnoreCase("Option-3")){
            // click on the checkbox whose attribute value is Option-3
            checkbox.click();
        }



        }
    }
}
