package org.softserve.opencartapp.tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HeaderPageTest {

    private final String url = "http://taqc-dp170.zzz.com.ua/";

    @Test
    public void checkTitleTest()  {
        System.setProperty("webdriver.chrome.driver", "C:\\Java\\jdk1.8.0_211\\chromedriver.exe");
    }
}
