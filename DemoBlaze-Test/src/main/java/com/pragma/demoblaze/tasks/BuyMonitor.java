package com.pragma.demoblaze.tasks;


import com.pragma.demoblaze.iteractions.Wait;
import com.pragma.demoblaze.userinterfaces.DemoBlazeHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.pragma.demoblaze.userinterfaces.DemoBlazeProduct.ADD_TO_CART;
import static com.pragma.demoblaze.userinterfaces.DemoBlazeProduct.BOTTON_HOME;


public class BuyMonitor implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Wait.theSeconds(3),
                Click.on(DemoBlazeHome.BUTTON_MONITOR),
                Wait.theSeconds(2),
                Click.on(DemoBlazeHome.MONITOR_PRODUCT),
                Wait.theSeconds(2),
                Click.on(ADD_TO_CART)
        );

        actor.attemptsTo(Click.on(BOTTON_HOME));
    }

    public static BuyMonitor monitor() {
        return new BuyMonitor();
    }

}
