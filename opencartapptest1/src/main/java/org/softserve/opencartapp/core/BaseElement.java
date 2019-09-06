package org.softserve.opencartapp.core;

import org.openqa.selenium.WebElement;

public class BaseElement {
    protected WebElement webElement;

    public BaseElement(WebElement webElement) {
        this.webElement = webElement;
    }

    public void click() {
        webElement.click();
    }

    public void sendKeys(String s) {
        webElement.sendKeys(s);
    }

    public boolean isExists() {
        return true;
    }

    public String getValue(){
        return webElement.getText();
    }
}
