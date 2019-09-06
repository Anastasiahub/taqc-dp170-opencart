package org.softserve.opencartapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.softserve.opencartapp.core.BasePage;

public class LoginPage extends BasePage {



    By newCustomerBlock = By.xpath("//*[@id=\"content\"]/div/div[1]/div");
    By continueButtonFromNewCustomerBlock = By.xpath("//*[@id=\"content\"]/div/div[1]/div/a");
    By returningCustomerBlock = By.xpath("//*[@id=\"content\"]/div/div[2]/div");
    By eMailAddressForm2Fill = By.xpath("//*[@id=\"input-email\"]");
    By passwordForm2Fill = By.xpath("//*[@id=\"input-password\"]");
    By forgottenPasswordLink = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/div[2]/a");
    By loginButtonFromReturningCustomerBlock = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input[1]");
    By linkBlockOnTheRight = By.xpath("//*[@id=\"column-right\"]/div");
    By loginLinkFromLinkBlockOnTheRight= By.xpath("//*[@id=\"column-right\"]/div/a[1]");
    By registerLinkFromLinkBlockOnTheRight = By.xpath("//*[@id=\"column-right\"]/div/a[2]");
    By forgottenPasswordLinkFromLinkBlockOnTheRight = By.xpath("//*[@id=\"column-right\"]/div/a[3]");
    By myAccountLinkFromLinkBlockOnTheRight = By.xpath("//*[@id=\"column-right\"]/div/a[4]");
    By addressBookLinkFromLinkBlockOnTheRight = By.xpath("//*[@id=\"column-right\"]/div/a[5]");
    By wishListLinkFromLinkBlockOnTheRight = By.xpath("//*[@id=\"column-right\"]/div/a[6]");
    By orderHistoryLinkFromLinkBlockOnTheRight = By.xpath("//*[@id=\"column-right\"]/div/a[7]");
    By downloadsLinkFromLinkBlockOnTheRight = By.xpath("//*[@id=\"column-right\"]/div/a[8]");
    By reccuringPaymentsLinkFromLinkBlockOnTheRight = By.xpath("//*[@id=\"column-right\"]/div/a[9]");
    By rewardPointsLinkFromLinkBlockOnTheRight = By.xpath("//*[@id=\"column-right\"]/div/a[10]");
    By returnsLinkFromLinkBlockOnTheRight = By.xpath("//*[@id=\"column-right\"]/div/a[11]");
    By transactionLinkFromLinkBlockOnTheRight = By.xpath("//*[@id=\"column-right\"]/div/a[12]");
    By newsletterLinkFromLinkBlockOnTheRight = By.xpath("//*[@id=\"column-right\"]/div/a[13]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void goToPage() {
        getDriver().get("http://taqc-dp170.zzz.com.ua/index.php?route=account/login");
    }

}
