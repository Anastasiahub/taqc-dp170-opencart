package org.softserve.opencartapp.pages;

import org.openqa.selenium.WebDriver;
import org.softserve.opencartapp.core.BasePage;

public class CheckoutPage extends BasePage {

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void goToPage() {
        getDriver().get("http://taqc-dp170.zzz.com.ua/index.php?route=checkout/cart");
    }

    public void click(){

    }

    public boolean isVisible(){
        return true;
    }
}
