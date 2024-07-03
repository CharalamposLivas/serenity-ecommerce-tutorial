package com.serenitydojo.ecommerce.actions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends PageObject {

    @FindBy(css = ".page-title")
    WebElementFacade searchResultsTitle;

    public String getSearchResultsTitle() {
        return searchResultsTitle.getText();
    }
}
