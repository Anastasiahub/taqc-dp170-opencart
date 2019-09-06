package org.softserve.opencartapp.tests;
import org.junit.Assert;
import org.junit.Test;
import org.softserve.opencartapp.core.BaseTest;
import org.softserve.opencartapp.pages.ProductPage;
import org.softserve.opencartapp.pages.WhatWouldYouLikeToDoNextPage;

public class FTC_WhatWouldYouLikeToDoNextTest extends BaseTest {

    private ProductPage productPage = new ProductPage(getDriver());
    private WhatWouldYouLikeToDoNextPage wwyltdNext = new WhatWouldYouLikeToDoNextPage(getDriver());

    @Test
    public void enterInvalidCouponCode() throws InterruptedException {
        productPage.goToPage();
        productPage.addProductToCart();
        //productPage.getElement(productPage.getImageMacBook()).click();
        wwyltdNext.goToPage();
        wwyltdNext.expandUseCouponCode();
        wwyltdNext.getElement(wwyltdNext.getEnterCouponField()).sendKeys("1234");
        wwyltdNext.getElement(wwyltdNext.getBtncoupon()).click();
        Assert.assertEquals(" Warning: Coupon is either invalid, expired or reached its usage limit!", wwyltdNext.getWarningmessagecoupon());
    }








}

