package com.syntaxClass10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExamplePagiNation {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

//      for Username
       WebElement username= driver.findElement(By.cssSelector("input#txtUsername"));
       username.sendKeys("Admin");
//      for password
       WebElement passw=driver.findElement(By.cssSelector("input#txtPassword"));
       passw.sendKeys("Hum@nhrm123");
//      for Login Button
       driver.findElement(By.cssSelector("input#btnLogin")).click();
//      Click on PIM
        WebElement Pim=driver.findElement(By.cssSelector("a#menu_pim_viewPimModule"));
        Pim.click();

        WebElement Employeelist=driver.findElement(By.cssSelector("a#menu_pim_viewEmployeeList"));
        Employeelist.click();

//  -------------------- DEALING WITH THE TABLE-------------------------------
//  1. Locate the table and get the rows
        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr"));

//  1.2 Locate the next button
        //WebElement nextbutton=driver.findElement(By.xpath("//a[text()='Next']"));

//  2.  Iterate throught the list and look for the required id 26335A

//  declare a boolean that will be a flag to control the refilling of our list with new entries
//  of the next page till we have found the desired row of entry
    boolean notFound=true;
    while(notFound){
//  Relocate the rows after the page is refreshed to avoid stale element Exception
         tableRows = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr"));
        for(int i=0; i<tableRows.size();i++){
//   get the text out of the web element in list
            String text=tableRows.get(i).getText();
//   check if the row contains the id we are looking for
            if(text.contains("26335A")){
                System.out.println(" the index of the id in table is : "+i);
                WebElement chxbox=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td/input"));
                chxbox.click();

//  we found the desired row so we need to end the while loop
                notFound=false;
                break;
            }
        }
//  click on the next button once the loop has traversed whole list
//   but only click
        if(notFound){
            WebElement nextbutton=driver.findElement(By.xpath("//a[text()='Next']"));
            nextbutton.click();
        }

    }
    }
}
