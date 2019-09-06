package org.softserve.opencartapp.core;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;

public class BaseTest {

    protected WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    @Before
    public void setup() {
        String pathChromeDriver = "";
        try  {
            InputStream input = BaseTest.class.getClassLoader().getResourceAsStream("dev.properties");
            Properties prop = new Properties();
            if (input == null) {
                System.out.println("Sorry, unable to find dev.properties");
            }else{
                prop.load(input);
                pathChromeDriver = prop.getProperty("webdriver.path."+InetAddress.getLocalHost().getHostName());
            }
        }catch (IOException ex) {
            ex.printStackTrace();
        }
        System.setProperty("webdriver.chrome.driver", pathChromeDriver);
        setDriver(new ChromeDriver());
    }

    @After
    public void teardown(){
        driver.quit();
    }
}
