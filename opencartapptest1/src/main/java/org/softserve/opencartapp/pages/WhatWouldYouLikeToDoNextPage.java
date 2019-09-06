package org.softserve.opencartapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.softserve.opencartapp.core.BasePage;

public class WhatWouldYouLikeToDoNextPage extends BasePage{

    public WhatWouldYouLikeToDoNextPage(WebDriver driver) {
        super(driver);
    }

    By useCouponCode = By.xpath("//*[@id=\"accordion\"]/div[1]/div[1]");
    By estimateShippingTaxes = By.xpath("//*[@id=\"accordion\"]/div[2]/div[1]");
    By useGiftCertificate = By.xpath("//*[@id=\"accordion\"]/div[3]/div[1]");
    By enterCouponField = By.id("input-coupon");
    By btncoupon = By.id("button-coupon");
    By warningmessagecoupon = By.xpath("/html/body/div[4]/div[1]");


    public void goToPage() {
        getDriver().get("http://taqc-dp170.zzz.com.ua/index.php?route=checkout/cart");
    }

    public void expandUseCouponCode(){
        getElement(useCouponCode).click();
    }

    public void expandEstimateShippingTaxes(){
        getElement(estimateShippingTaxes).click();
    }

    public void expandUseGiftCertificate(){
        getElement(useGiftCertificate).click();
    }

    public By getEnterCouponField() {
        return enterCouponField;
    }

    public By getBtncoupon() {
        return btncoupon;
    }

    public String getWarningmessagecoupon() {
        return getElement(warningmessagecoupon).getValue();
    }
}
