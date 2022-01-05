package ForFun;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Fun2 {
    public static String url="https://www.youtube.com/";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        WebElement search=driver.findElement(By.cssSelector("input#search"));
        search.sendKeys("soccer goals");
        Thread.sleep(2000);

        WebElement cliq=driver.findElement(By.cssSelector("button#search-icon-legacy"));
        cliq.click();

        driver.findElement(By.cssSelector("#img")).click();




    }
}
