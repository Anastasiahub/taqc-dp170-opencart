package org.softserve.opencartapp.tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class STC_ContactUsPage_Smoke_WholePageVisibility {

    @Test
    public void test(){

       System.setProperty("webdriver.chrome.driver", "C:\\Java\\jdk1.8.0_211\\chromedriver.exe");
       WebDriver dr = new ChromeDriver();
       dr.get("http://taqc-dp170.zzz.com.ua/index.php?route=information/contact");
//        ContactUsPage page = new ContactUsPage();
//        page.smokeWholePageVisibility();
    }
}