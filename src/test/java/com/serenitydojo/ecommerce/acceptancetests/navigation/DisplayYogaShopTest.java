package com.serenitydojo.ecommerce.acceptancetests.navigation;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.PageElement;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
public class DisplayYogaShopTest extends UIInteractions {

    @Test
    void shouldDisplayTheYogaShop() {
        openUrl("https://magento.softwaretestingboard.com/");
        //elementWithText("Shop New Yoga").click(); // Right click -> Extract method
        // or
        find(Button.withText("Shop New Yoga")).click();
        String pageTitle = find("//h1[@id='page-title-heading']").getText();
        Assertions.assertThat(pageTitle).isEqualTo("New Luma Yoga Collection");
    }

    @Test
    void shouldDisplayEcoFriendlySection() {
        openUrl("https://magento.softwaretestingboard.com/");
        //elementWithText("Eco-Friendly").click(); // Right click -> Extract method
        // or
        find(PageElement.containingText("Eco-Friendly")).click();
        String pageTitle = find("//h1[@id='page-title-heading']").getText();
        Assertions.assertThat(pageTitle).isEqualTo("Eco Friendly");
    }

    private WebElementFacade elementWithText(String text) {
        return findBy("//span[contains(., '{0}')]", text);
    }
}
