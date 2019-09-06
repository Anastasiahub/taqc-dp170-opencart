package org.softserve.opencartapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.softserve.opencartapp.core.BaseElement;
import org.softserve.opencartapp.core.BasePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goToPage() {
        getDriver().get("http://taqc-dp170.zzz.com.ua/index.php?route=common/home");
    }

    By logoBtn = By.id("logo");
    By arrowRight = By.cssSelector("#slideshow0 .owl-next > .fa");
    By arrowLeft = By.cssSelector("#slideshow0 .owl-prev > .fa");
    By iPhoneSlider = By.xpath("//img[@alt='iPhone 6']");
    By macBookSlider = By.xpath("//img[@alt='MacBookAir']");
    By macBookFeatured = By.cssSelector(".product-layout:nth-child(1) .img-responsive");
    By iPhoneFeatured = By.cssSelector(".product-layout:nth-child(2) .img-responsive");
    By appleCinemaFeatured = By.cssSelector(".product-layout:nth-child(3) .img-responsive");
    By canonEosFeatured = By.cssSelector(".product-layout:nth-child(4) .img-responsive");

    public ProductPage goToIphoneSlider() {
        getElement(iPhoneSlider).click();
        return new ProductPage(getDriver());
    }

    public ProductPage goToMacBookSlider() {
        getElement(macBookSlider).click();
        return new ProductPage(getDriver());
    }

    public HomePage moveSliderManually() {
        getElement(arrowLeft).click();
        getElement(arrowRight).click();
        return this;
    }

    public HomePage returnToHomePage() {
        getElement(iPhoneSlider).click();
        getElement(logoBtn).click();
        return this;
    }

    public ProductPage goToMacBookPageFromFeatured() {
        getElement(macBookFeatured).click();
        return new ProductPage(getDriver());
    }

    public ProductPage goToIphonePageFromFeatured() {
        getElement(iPhoneFeatured).click();
        return new ProductPage(getDriver());
    }

    public ProductPage goToAppleCinemaPageFromFeatured() {
        getElement(appleCinemaFeatured).click();
        return new ProductPage(getDriver());
    }

    public ProductPage goToCanonEosPageFromFeatured() {
        getElement(canonEosFeatured).click();
        return new ProductPage(getDriver());
    }

}
