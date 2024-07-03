package com.serenitydojo.ecommerce.acceptancetests.cart;

import com.serenitydojo.ecommerce.actions.CartActions;
import com.serenitydojo.ecommerce.actions.NavigationActions;
import com.serenitydojo.ecommerce.actions.ProductItemActions;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class DisplayItemsInTheCartTest extends UIInteractions {

    @Steps
    NavigationActions navigate;

    @Steps
    CartActions cart;

    @Steps
    ProductItemActions productItem;

    @Test
    void shouldDisplayNoItemsMessageIfCartIsEmpty() {
        navigate.openTheApplication();
        cart.showCartSummary();
        waitForTextToAppear("You have no items in your shopping cart.");
    }

    @Test
    void shouldBeAbleToAddASingleItemToTheCart() {
        navigate.openTheApplication();
        productItem.addItemToCart("Push It Messenger Bag");
        assertThat(cart.itemsInTheCart()).contains("Push It Messenger Bag");
    }

    @Test
    void shouldBeAbleToAddMultipleItemsToTheCart() {
        navigate.openTheApplication();
        productItem.addItemToCart("Push It Messenger Bag");

        navigate.openTheApplication();
        productItem.addItemToCart("Hero Hoodie", "M", "Gray");

        assertThat(cart.itemsInTheCart()).contains("Hero Hoodie", "Push It Messenger Bag");
    }
}
