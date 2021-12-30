package com.syntaxClass10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableWithPagination {

    public static String url="http://syntaxprojects.com/table-pagination-demo.php";

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
//print the row that contains the student name     "Archy J"

//        1. locate the table rows using xpath

        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));
//       1.2 locate the next button on the table
        WebElement nxtBtn = driver.findElement(By.xpath("//a[@class='next_link'] "));



//       2.Iterate over the List and see if the desired row is there or not
        int i=1;
        boolean found=false;
        while(!found) {
            for (WebElement tablerow : tableRows) {

                String textofRow = tablerow.getText();
                if (textofRow.contains("Archy J")) {
                    System.out.println(textofRow);
                    System.out.println(":the page number is : " + i);
                    found=true;
                    break;
                }
            }

            if(!found){
                nxtBtn.click();
                i++;
            }

        }

    }

}


