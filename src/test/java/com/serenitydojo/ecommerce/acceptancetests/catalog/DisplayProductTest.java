package com.serenitydojo.ecommerce.acceptancetests.catalog;

import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.ui.Image;
import net.serenitybdd.screenplay.ui.Link;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;

@ExtendWith(SerenityJUnit5Extension.class)
public class DisplayProductTest extends UIInteractions {

    @Test
    void shouldBeAbleToShowProductDetailsPageFromTheCatalog() {
        openUrl("https://magento.softwaretestingboard.com/");
        //find(By.linkText("Hero Hoodie")).click();
        // or
        //find(Link.withText("Hero Hoodie")).click();
        // or
        find(Image.withAltText("Hero Hoodie")).shouldBeVisible();
        find(Image.withAltText("Hero Hoodie")).click();
        String productTitle = find(".page-title").getText();
        Assertions.assertThat(productTitle).isEqualTo("Hero Hoodie");
    }

    @Test
    void shouldShowPromoCollectionDetails() {
        openUrl("https://magento.softwaretestingboard.com/");
        find(By.partialLinkText("New Luma Yoga Collection")).click();
        String productTitle = find(".page-title").getText();
        Assertions.assertThat(productTitle).isEqualTo("New Luma Yoga Collection");
    }
}
