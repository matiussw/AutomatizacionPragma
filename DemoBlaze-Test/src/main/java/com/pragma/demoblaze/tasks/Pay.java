package com.pragma.demoblaze.tasks;

import com.pragma.demoblaze.iteractions.Wait;
import com.pragma.demoblaze.userinterfaces.DemoBlazeHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;


import static com.pragma.demoblaze.userinterfaces.DemoBlazeCart.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Pay implements Task {
    private List<Map<String, String>> userFields;

    public Pay(List<Map<String, String>> userFields) {
        this.userFields = userFields;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.theSeconds(3),
                Click.on(DemoBlazeHome.BUTTON_CART),
                Wait.theSeconds(3),
                Click.on(BOTTON_PAY),
                Enter.theValue(userFields.get(0).get("name")).into(NAME_INPUT),
                Enter.theValue(userFields.get(0).get("country")).into(COUNTRY_INPUT),
                Enter.theValue(userFields.get(0).get("city")).into(CITY_INPUT),
                Enter.theValue(userFields.get(0).get("cardnumber")).into(CARD_INPUT),
                Enter.theValue(userFields.get(0).get("mounth")).into(MOUNTH_INPUT),
                Enter.theValue(userFields.get(0).get("year")).into(YEAR_INPUT),
                Click.on(BUTTON_PURCHARSE),
                Wait.theSeconds(3));
    }

    public static Pay pays(List<Map<String, String>> userFields) {
        return instrumented(Pay.class, userFields);
    }

}
