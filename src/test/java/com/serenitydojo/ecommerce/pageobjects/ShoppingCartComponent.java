package com.serenitydojo.ecommerce.pageobjects;

import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShoppingCartComponent extends PageComponent {

    @FindBy(css = ".showcart")
    WebElementFacade showCartIcon;

    public static final String MINI_CART_PRODUCT_ITEM_NAME = "#mini-cart .product-item-name";

    public void showCartSummary() {
        showCartIcon.click();
    }

    public List<String> getItems() {
        return findAll(MINI_CART_PRODUCT_ITEM_NAME).texts();
    }
}
