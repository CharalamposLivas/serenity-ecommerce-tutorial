package com.serenitydojo.ecommerce.acceptancetests.catalog;

import com.serenitydojo.ecommerce.actions.NavigationActions;
import com.serenitydojo.ecommerce.actions.SearchActions;
import com.serenitydojo.ecommerce.actions.SearchResultsPage;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
public class SearchTest extends UIInteractions {

    @Steps
    NavigationActions navigate;

    @Steps
    SearchActions search;

    SearchResultsPage searchResultsPage;

    @Test
    void shouldDisplayTheSearchResults() {
        navigate.openTheApplication();
        //find("#search").type("Hero Hoodie");
        //find(Button.withAriaLabel("Search")).click();
        // or
        search.forProduct("Hero Hoodie");
        String resultTitle = searchResultsPage.getSearchResultsTitle();
        Assertions.assertThat(resultTitle).isEqualTo("Search results for: 'Hero Hoodie'");
    }
}
