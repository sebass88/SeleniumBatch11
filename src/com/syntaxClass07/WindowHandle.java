package com.syntaxClass07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.manage().window().maximize();

        // get the address /handle of the page/window
        String signupPageHandle=driver.getWindowHandle();
        System.out.println("the window handle for signup page is " +signupPageHandle);

        // Locate  the buttons Help,Privacy,Terms
        WebElement helpbutton=driver.findElement(By.xpath("//a[text()='Help']"));
        WebElement termsbutton=driver.findElement(By.xpath("//a[text()='Terms']"));
        WebElement privacybutton=driver.findElement(By.xpath("//a[text='Privacy']"));

        // click on them to open up new Windows

        helpbutton.click();
        termsbutton.click();
        privacybutton.click();

        // we haven't switched the focus so it is still on the main/home/sign up pgae
        // to get all the windows handles

        Set<String> allwindows=driver.getWindowHandles();
        // print the size of all windowhandles
        System.out.println("number of windows handles is  "+allwindows.size());

        // In order to print all the window handles we need to ITERATE over the Set

        Iterator<String >it=allwindows.iterator();
        signupPageHandle=it.next();
        String helpPageHandle=it.next();
        String TermPageHandle=it.next();
        String privacyPageHandle=it.next();

        System.out.println("The handle for sign up page is "+signupPageHandle);
        System.out.println("The handle for helpPage page is "+helpPageHandle);
        System.out.println("The handle for term page is "+TermPageHandle);
        System.out.println("The handle for Privacy page is "+privacyPageHandle);

        // switch to help page
        driver.switchTo().window(helpPageHandle);
        System.out.println(driver.getTitle());

    }
}
