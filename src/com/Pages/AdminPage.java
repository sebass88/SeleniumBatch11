package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.CommonMethods;

public class AdminPage extends CommonMethods {

    @FindBy(css = "a#menu_admin_viewAdminModule")
    public WebElement adminurl;

    @FindBy(css = "input#searchSystemUser_userName")
    public WebElement inpusername;

    @FindBy(css = "select#searchSystemUser_userType")
    public  WebElement role;

    @FindBy(id = "searchBtn")
    public WebElement search;

    public AdminPage(){
        PageFactory.initElements(driver,this);
    }
}
