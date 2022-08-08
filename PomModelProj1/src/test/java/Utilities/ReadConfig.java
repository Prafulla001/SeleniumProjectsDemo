package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
    //create object of class Properties in java - to read config file
    Properties properties;
    //create a string that will have path of properties file from configuration file
    String path = "C:\\Users\\06327L744\\IdeaProjects\\PomModelProj1\\Configuration\\config.properties";

    //now create a constructor
    public ReadConfig() throws IOException {
        //Initialize the properties object --crated above
        properties = new Properties(); //Initialization of properties Object
        FileInputStream fil = new FileInputStream(path);
        properties.load(fil);
    }

    //Create Methods to read the key from the config.properties file
    public String getbaseurl() {
        String value = properties.getProperty("baseurl");
        if (value!=null)
            return value;
        else
            throw new RuntimeException("URL not found in config.properties file");
    }
    //Creat methods to read browser from config.properties file
    public String getbrowser() {
        String value = properties.getProperty("browser");
        if (value!=null)
            return value;
        else
            throw new RuntimeException("Browser not found in config.properties file");
    }
}
