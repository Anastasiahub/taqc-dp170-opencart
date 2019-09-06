package org.softserve.opencartapp.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    private WebDriver driver;

    public BasePage (WebDriver driver){
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
    public BaseElement getElement (By elementBy) {
        return new BaseElement(driver.findElement(elementBy));
    }

    public abstract void goToPage();
}
