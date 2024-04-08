package com.pragma.demoblaze.tasks;


import com.pragma.demoblaze.iteractions.Wait;
import com.pragma.demoblaze.userinterfaces.DemoBlazeHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.pragma.demoblaze.userinterfaces.DemoBlazeProduct.ADD_TO_CART;
import static com.pragma.demoblaze.userinterfaces.DemoBlazeProduct.BOTTON_HOME;


public class BuyLaptop implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Wait.theSeconds(3),
                Click.on(DemoBlazeHome.BUTTON_LAPTOP),
                Wait.theSeconds(2),
                Click.on(DemoBlazeHome.LAPTOP_PRODUCT),
                Wait.theSeconds(2),
                Click.on(ADD_TO_CART),
                Wait.theSeconds(3)
        );

        actor.attemptsTo(Click.on(BOTTON_HOME));
    }

    public static BuyLaptop laptop() {
        return new BuyLaptop();
    }

}
