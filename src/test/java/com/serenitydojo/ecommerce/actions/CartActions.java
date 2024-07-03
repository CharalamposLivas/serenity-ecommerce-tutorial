package com.serenitydojo.ecommerce.actions;

import com.serenitydojo.ecommerce.pageobjects.ShoppingCartComponent;
import net.serenitybdd.annotations.Step;

import java.util.List;

public class CartActions {

    ShoppingCartComponent shoppingCart;

    @Step("Show the shopping cart summary")
    public void showCartSummary() {
        shoppingCart.showCartSummary();
    }

    @Step("View items in the cart")
    public List<String> itemsInTheCart() {
        showCartSummary();
        return shoppingCart.getItems();
    }
}
