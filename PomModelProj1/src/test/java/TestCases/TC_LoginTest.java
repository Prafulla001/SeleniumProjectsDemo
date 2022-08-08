package TestCases;

import PageObject.dashIndex;
import PageObject.loginPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_LoginTest extends BaseClass{
    public TC_LoginTest() throws IOException {

    }
    @Test
    public void verifyUserLogin(){

        //1.launch browser
        driver.get(url);
        log.info("for url logg");   //logging record
        //click on signi link- 1st create the object of dashIndex page
        dashIndex ipg = new dashIndex(driver);
        ipg.clickloginbtn();
        log.info("log for click butn");

        //on clicking the login page will open, so now make the object of login page here
        loginPage lpg = new loginPage(driver);
        //2. send userid
        lpg.enterUserId("praftest@gmail.com");
        log.info("log for userid");  //logging for user id record
        //3. send password
        lpg.enterPassword("1234");
        log.info("log for password record");  //logging for password record
        //4. click login button
        lpg.clickSignInBtn();
        log.info("log for click SIGNIN Button");  //LOGGING FOR SIGNIN BTN CLICK
    }
}
