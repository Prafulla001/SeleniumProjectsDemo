package TestCases;
import Utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.*;
import org.apache.logging.log4j.core.Logger;
import java.io.IOException;
import java.time.Duration;


public class BaseClass {
    /*this Base class will have all the Reusable case that may be used in all test case like - login etc
    Like baseurl and browser are common =-use in all test cases so..
    create the object of readConfig file here */
    ReadConfig readConfig = new ReadConfig();
    //create string for url & browser
    String url = readConfig.getbaseurl();
    String browser = readConfig.getbrowser();
    //instiating driver
    public static WebDriver driver;
    //creating object of Logger for generating logs
    //public static Logger logger;
    Logger log = (Logger) LogManager.getLogger("PomModelProj1");

    public BaseClass() throws IOException {
        //String url = readConfig.getbaseurl();
        //String browser = readConfig.getbrowser();
        //Logger logger = (Logger) LogManager.getLogger("PomModelProj1");
    }
    @BeforeClass
    //method to launch browser- setup
    public void setup()
    {
        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver();
                driver = new FirefoxDriver();
                break;
            default:
                driver=null;
                break;
        }

        //implicit wait command to hold for few seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //for logging- initializing logger
        //Logger log = (Logger) LogManager.getLogger("PomModelProj1");
        log.debug("for debug logg");
    }
    @AfterClass
    //teardown method to close browser
    public void tearDown(){
        //driver.close();
        driver.quit();
    }
}
