package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    //1. create object of webdriver
    WebDriver ldriver;  //ldriver is - local driver

    //2. create constructor its of same name of class, will take the parameter of driver
    public loginPage(WebDriver rdriver){
        ldriver=rdriver;   // rdriver is - remote driver

        //now call init element
        PageFactory.initElements(rdriver, this); //use rdriver to search web elemnts
    }
    //identify web Element userId field on webPage
    @FindBy(id = "txtUserID")
    WebElement givUserId; //when webelememt will be found for user id.

    //identify web Elemnet password field on webPage
    @FindBy(id = "txtTradingPassword")
    WebElement givPassword;

    @FindBy(id = "loginBtn")
    WebElement loginBtn;

    //send email address to user id section on webelement- method creation
    public void enterUserId(String emailAdd){
        givUserId.sendKeys(emailAdd);
    }
    //creating method to send password in pw section
    public void enterPassword(String password){
        givPassword.sendKeys(password);
    }

    //method to perform action - click on sign in button
    public void clickSignInBtn(){
        loginBtn.click();
    }
}
