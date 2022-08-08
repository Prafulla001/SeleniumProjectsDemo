package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashIndex {

    //1. create object of webdriver
    WebDriver ldriver;  //ldriver is - local driver

    //2. create constructor its of same name of class, will take the parameter of driver
    public dashIndex(WebDriver rdriver){
        ldriver=rdriver;   // rdriver is - remote driver

        //now call init element
        PageFactory.initElements(rdriver, this); //use rdriver to search web elemnts
    }
    //identify web Elemnets
    @FindBy(linkText = "LOGIN / REGISTER")
    WebElement loginsv; //when webelememt wiil be found , it will store in loginssv.

    //identify click action on login button on webelement- method creation
    public void clickloginbtn(){
        loginsv.click();
    }


}
