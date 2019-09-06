package org.softserve.opencartapp.pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.softserve.opencartapp.core.BasePage;


public class ContactUsPage extends BasePage {

    By contactUsTitle = By.xpath("//*[@id=\"content\"]/h1");
    By ourLocationInfoTitle = By.xpath("//*[@id=\"content\"]/h3");
    By ourLocationInfoInformation = By.xpath("//*[@id=\"content\"]/div");
    By contactFormBlockTitle = By.xpath("//*[@id=\"content\"]/form/fieldset/legend");
    By yourNameInputForm = By.xpath("//*[@id=\"input-name\"]");
    By eMailAdressForm = By.xpath("//*[@id=\"input-email\"]");
    By enquryForm = By.xpath("//*[@id=\"input-enquiry\"]");
    By submitButton = By.xpath("//*[@id=\"content\"]/form/div/div/input");
    String expectedTitle = "Contact Us";


    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public void goToPage() {
        getDriver().get("http://taqc-dp170.zzz.com.ua/index.php?route=information/contact");
    }
    
}
