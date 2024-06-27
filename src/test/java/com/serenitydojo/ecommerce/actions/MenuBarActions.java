package com.serenitydojo.ecommerce.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

import java.util.List;

public class MenuBarActions extends UIInteractions {

    @Step("Read the top level menus")
    public List<String> topLevelMenuItems(NavigationActions navigate) {
        return navigate.findAll(".navigation a.level-top").texts();
    }
}
