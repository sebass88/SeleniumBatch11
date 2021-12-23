package com.syntaxClass07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
            driver.manage().window().maximize();
            //get the address/handle of the page/window
            String signUpPageHandle = driver.getWindowHandle();
            System.out.println("The window handle for signup page is: " + signUpPageHandle);
            //click on help
            WebElement helpBTN=driver.findElement(By.xpath("//a[text()='Help']"));
            WebElement termsBTN=driver.findElement(By.xpath("//a[text()='Terms']"));
            WebElement privacyBTN=driver.findElement(By.xpath("//a[text()='Privacy']"));

            //click on them to open up new windows
            helpBTN.click();
            termsBTN.click();
            privacyBTN.click();
            //to get all the window handles
            Set<String> allWindowHandles=driver.getWindowHandles();
            //print the size of allWindowHandles
            System.out.println(allWindowHandles.size());

            //in order to print all window handles we need to iterate through the set
            Iterator<String> it=allWindowHandles.iterator();

            //Iterate through each window handle
        while (it.hasNext()){
            String handle=it.next();
            // now switch to this particular handle/window
            driver.switchTo().window(handle);
            // i need to mae sure this is my desired window
            String title=driver.getTitle();
            //if condition
            if(title.equalsIgnoreCase("Google Account Help")){
                System.out.println(title);
            }
        }




            //signUpPageHandle=it.next();
           // String  helpPageHandle=it.next();
           // String termsPageHandle=it.next();
           // String privacyPageHandle=it.next();

           // System.out.println(signUpPageHandle);
           // System.out.println(helpPageHandle);
           // System.out.println(termsPageHandle);
          //  System.out.println(privacyPageHandle);


        }
    }

