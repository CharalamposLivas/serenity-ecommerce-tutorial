package com.serenitydojo.ecommerce.acceptancetests.cart;

import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
public class DisplayItemsInTheCartTest extends UIInteractions {

    @Test
    void shouldDisplayNoItemsMessageIfCartIsEmpty() {
        openUrl("https://magento.softwaretestingboard.com/");
        $(".showcart").click();
        waitForTextToAppear("You have no items in your shopping cart.");
    }
}
