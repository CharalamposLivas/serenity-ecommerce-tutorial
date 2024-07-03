package com.serenitydojo.ecommerce.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageObject {

    //@FindBy(css = "button[title='Add to Cart']")
    // or
    @FindBy(id = "product-addtocart-button")
    WebElementFacade addToCartButton;

    @FindBy(css = ".loader")
    WebElementFacade spinner;

    public void addToCart() {
        addToCartButton.click();
        spinner.waitUntilVisible();
        spinner.waitUntilNotVisible();
    }
}
