package com.pragma.demoblaze.iteractions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;


public class RefreshPage implements Interaction {
    public RefreshPage() {
    }

    public static RefreshPage page() {
        return Tasks.instrumented(RefreshPage.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().navigate().refresh();
    }
}
