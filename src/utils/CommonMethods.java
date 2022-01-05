package utils;

import TestBase.BaseClass;
import org.openqa.selenium.WebElement;

public class CommonMethods extends BaseClass {

    /**
     * Sends text to a given element
     * @param element -- webelement
     * @param text---> the text that you want to send
     */

    public static void sendText(WebElement element,String text){
        element.clear();
        element.sendKeys(text);

    }

    public void switchToFame(int index){

        driver.switchTo().frame(index);
    }
}
