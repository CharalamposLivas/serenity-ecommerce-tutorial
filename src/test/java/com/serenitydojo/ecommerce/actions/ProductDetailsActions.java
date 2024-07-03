package com.serenitydojo.ecommerce.actions;

import com.serenitydojo.ecommerce.pageobjects.ProductDetailsPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.core.steps.UIInteractions;

public class ProductDetailsActions extends UIInteractions {

    ProductDetailsPage productDetailsPage;

    @Step("Get product title")
    public String getProductTitle() {
        return $(".page-title").getText();
    }

    public WebElementState productImageWithAltValueOf(String productName) {
        return $("css:img[alt='" + productName + "']");
    }

    @Step
    public void addToCart() {
        productDetailsPage.addToCart();
    }
}
