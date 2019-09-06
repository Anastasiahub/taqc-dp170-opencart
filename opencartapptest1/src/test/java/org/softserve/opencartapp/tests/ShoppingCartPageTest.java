package org.softserve.opencartapp.tests;

import org.junit.Test;
import org.softserve.opencartapp.core.BaseTest;
import org.softserve.opencartapp.pages.ShoppingCartListPage;

/**
 * Created by ababentc on 9/4/2019.
 */
public class ShoppingCartPageTest extends BaseTest {

    private ShoppingCartListPage shcart = new ShoppingCartListPage(getDriver());

    @Test
    public void checkAddItem()
    {
        shcart.addItemToShoppingCart();
    }



}
