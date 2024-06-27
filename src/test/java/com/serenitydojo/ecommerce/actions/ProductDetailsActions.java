package com.serenitydojo.ecommerce.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.By;

public class ProductDetailsActions extends UIInteractions {

    @Step("Get product title")
    public String getProductTitle() {
        return $(".page-title").getText();
    }

    public WebElementState productImageWithAltValueOf(String productName) {
        return $("css:img[alt='" + productName + "']");
    }
}
