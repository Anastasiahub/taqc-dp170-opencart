package org.softserve.opencartapp.tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.softserve.opencartapp.core.BaseElement;
import org.softserve.opencartapp.core.BaseTest;
import org.softserve.opencartapp.pages.CheckoutPage;

public class STC_CheckoutPage_ClickingContinue_Verify extends BaseTest {
    private CheckoutPage checkoutPage;

    @Test
    public void STC_CheckoutPage_ClickButton () {
        checkoutPage = new CheckoutPage(getDriver());
        checkoutPage.goToPage();
        BaseElement btnCont = checkoutPage.getElement(By.xpath("//*[@id=\"content\"]/div/div/a"));
        btnCont.click();
    }

}