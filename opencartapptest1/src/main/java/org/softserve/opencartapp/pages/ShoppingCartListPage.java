package org.softserve.opencartapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.softserve.opencartapp.core.BasePage;

/**
 * Created by ababentc on 9/4/2019.
 */
public class ShoppingCartListPage extends BasePage{

    protected ProductPage productPage = new ProductPage(getDriver());
    public ShoppingCartListPage(WebDriver driver)
    {
        super(driver);
    }

    public void goToPage() {
        getDriver().get("http://taqc-dp170.zzz.com.ua/index.php?route=checkout/cart");
    }

    By imageLabel = By.linkText("Image");
    By productNameLabel = By.linkText("Product Name");
    By modelLabel = By.linkText("Model");
    By quantityLabel = By.linkText("Quantity");
    By unitPriceLabel = By.linkText("Unit Price");
    By totalLabel = By.linkText("Total");
    By image = By.className("img-thumbnail");
    By labelProducyName = By.className("text-left");
   //String productName = getDriver().findElement(By.className("text-left")).getText();

    public void isVisibleElement() {
        getElement(labelProducyName).getValue();
    }

    public void addItemToShoppingCart(){
        productPage.goToPage();
        productPage.addToCartBtnClick();
    }



}
