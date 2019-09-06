package org.softserve.opencartapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.softserve.opencartapp.core.BasePage;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void goToPage() {
        getDriver().get("http://taqc-dp170.zzz.com.ua/index.php?route=common/home");
    }

    By productPrice = By.xpath("//*[@id=\"content\"]/div[1]/div[2]/ul[2]/li[2]/h2");
    By productName = By.xpath("//*[@id=\"content\"]/div[1]/div[2]/h1");
    By macBookAddToCart = By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[1]");
    By macBookPicture1 = By.cssSelector("li:nth-child(1) img");
    By macBookPicture2 = By.cssSelector(".image-additional:nth-child(2) img");
    By macBookPicture3 = By.cssSelector(".image-additional:nth-child(3) img");
    By macBookPicture4 = By.cssSelector(".image-additional:nth-child(4) img");
    By macBookPicture5 = By.cssSelector(".image-additional:nth-child(5) img");
    By addToWishListBtn = By.cssSelector(".btn > .fa-heart");
    By compareBtn = By.cssSelector(".fa-exchange");
    By arrowRight = By.cssSelector(".mfp-arrow-right");
    By arrowLeft = By.cssSelector(".mfp-arrow-left");
    By crossButton = By.cssSelector(".mfp-close");
    By quantityField = By.id("input-quantity");
    By addToCartButton = By.id("button-cart");

    public ProductPage setQuantity() {
        getElement(quantityField).sendKeys(String.valueOf(quantityField));
        return this;
    }

    public ProductPage addProductToCart() {
        getElement(addToCartButton).click();
        return new ProductPage(getDriver());
    }

    public ProductPage addProductToCompare() {
        getElement(compareBtn).click();
        return new ProductPage(getDriver());
    }

    public ProductPage addProductToWishList() {
        getElement(addToWishListBtn).click();
        return new ProductPage(getDriver());
    }

    public ProductPage openProductPhoto() {
        getElement(macBookPicture1).click();
        getElement(arrowLeft).click();
        getElement(arrowRight).click();
        getElement(crossButton).click();
        return this;
    }

    public ProductPage getNameValue() {
        getElement(productName).getValue();
        return this;
    }

    public ProductPage getPriceValue() {
        getElement(productPrice).getValue();
        return this;
    }

    public void addToCartBtnClick()
    {
        getElement(macBookAddToCart).click();
    }
}
