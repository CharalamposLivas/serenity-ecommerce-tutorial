package com.serenitydojo.ecommerce.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class HomePageActions extends UIInteractions {

    @Step
    public String getHomePageTitle(NavigationActions navigate) {
        return navigate.getTitle();
    }
}
