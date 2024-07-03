package com.serenitydojo.ecommerce.acceptancetests.navigation;

import com.serenitydojo.ecommerce.actions.HomePageActions;
import com.serenitydojo.ecommerce.actions.MenuBarActions;
import com.serenitydojo.ecommerce.actions.NavigationActions;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
class MenuBarTest extends UIInteractions {

    @Steps
    NavigationActions navigate;

    //@Steps
    //MenuBarActions menuBar;

    //@Steps
    //HomePageActions homePage;

    @Test
    void shouldDisplayTheCorrectTitle() {
        navigate.openTheApplication();
        waitForTitleToAppear("Home Page");
        //assertThat(homePage.getHomePageTitle()).isEqualTo("Home Page");
        assertThat(getTitle()).isEqualTo("Home Page");
    }

    @Test
    void shouldShowTheTopLevelMenuItemsOnTheHomePage() {
        navigate.openTheApplication();
        waitForTitleToAppear("Home Page");
        //assertThat(menuBar.topLevelMenuItems()).contains("What's New", "Women", "Men", "Gear",
        //        "Training", "Sale");
        assertThat(findAll(".navigation a.level-top").texts()).contains("What's New", "Women", "Men",
                "Gear", "Training", "Sale");
    }
}
