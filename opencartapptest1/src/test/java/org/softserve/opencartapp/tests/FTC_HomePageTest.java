package org.softserve.opencartapp.tests;

import org.junit.Assert;
import org.junit.Test;
import org.softserve.opencartapp.core.BaseTest;
import org.softserve.opencartapp.pages.HomePage;

public class FTC_HomePageTest extends BaseTest {
    private HomePage homePage;

    @Test
    public void macBookSliderClickability() {
        HomePage homePage = new HomePage(getDriver());
        homePage.goToPage();
        homePage.goToMacBookSlider();
        Assert.assertEquals("MacBook", driver.getTitle());
    }

    @Test
    public void iPhoneSliderClickability() {
        HomePage homePage = new HomePage(getDriver());
        homePage.goToPage();
        homePage.goToIphoneSlider();
        Assert.assertEquals("iPhone", driver.getTitle());
    }

    @Test
    public void sliderMoving() {
        HomePage homePage = new HomePage(getDriver());
        homePage.goToPage();
        homePage.moveSliderManually();
    }
    @Test
    public void homePageReturning() {
        HomePage homePage = new HomePage(getDriver());
        homePage.goToPage();
        homePage.returnToHomePage();
        Assert.assertEquals("Your Store", driver.getTitle());
    }

    @Test
    public void macBookFeaturedClickability() {
        HomePage homePage = new HomePage(getDriver());
        homePage.goToPage();
        homePage.goToMacBookPageFromFeatured();
        Assert.assertEquals("MacBook", driver.getTitle());
    }

    @Test
    public void iPhoneFeaturedClickability() {
        HomePage homePage = new HomePage(getDriver());
        homePage.goToPage();
        homePage.goToIphonePageFromFeatured();
        Assert.assertEquals("iPhone", driver.getTitle());
    }

    @Test
    public void appleCinemaFeaturedClickability() {
        HomePage homePage = new HomePage(getDriver());
        homePage.goToPage();
        homePage.goToAppleCinemaPageFromFeatured();
        Assert.assertEquals("Apple Cinema 30", driver.getTitle());
    }

    @Test
    public void canonEosFeaturedClickability() {
        HomePage homePage = new HomePage(getDriver());
        homePage.goToPage();
        homePage.goToCanonEosPageFromFeatured();
        Assert.assertEquals("Canon EOS 5D", driver.getTitle());
    }
}
