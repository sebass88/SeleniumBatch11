package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.CommonMethods;

public class loginPageWithPageFactory extends CommonMethods {

    @FindBy(id="txtUsername")
    public WebElement username;
    @FindBy(id="txtPassword")
    public WebElement password;

    @FindBy(id="btnLogin")
    public WebElement loginBtn;

    public loginPageWithPageFactory(){
        PageFactory.initElements(driver,this);
    }



}
