package com.syntaxClass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");


        // getting the radio button
        WebElement female=driver.findElement(By.xpath("//input[@value='Female'][@name='optradio']"));
        //click the radio button
        //female.click();

        //check if the radio button is displayed
        boolean isDisplayed=female.isDisplayed();
        System.out.println("the female radio button is diplayed on the webpage "+isDisplayed);


        // check if the radio button is enabled
        boolean isEnabled=female.isEnabled();
        System.out.println("the female radio button is enabled on the webpage "+isEnabled);

        boolean isselected=female.isSelected();
        System.out.println("The female radio button is selected on the webpage "+isselected);

        //Select the female radio button only if its Enabled
        if(isEnabled){
            female.click();
        }
      // after clicking the button print if its selected or not
        isselected=female.isSelected();
        System.out.println("the female radio button is selected on the webpage "+isselected);

    }
}