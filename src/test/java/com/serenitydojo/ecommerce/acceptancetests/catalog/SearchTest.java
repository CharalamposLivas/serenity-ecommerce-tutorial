package com.serenitydojo.ecommerce.acceptancetests.catalog;

import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.InputField;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.Keys;

@ExtendWith(SerenityJUnit5Extension.class)
public class SearchTest extends UIInteractions {

    @Test
    void searchWithValidEntry() {
        openUrl("https://magento.softwaretestingboard.com/");
        find("#search").type("Hero Hoodie");
        //find(Button.withAriaLabel("Search")).click();
        // or
        find(InputField.withPlaceholder("Search entire store here..."))
                .type("Hero Hoodie", Keys.ENTER);
        String resultTitle = find(".page-title").getText();
        Assertions.assertThat(resultTitle).isEqualTo("Search results for: 'Hero Hoodie'");
    }
}
