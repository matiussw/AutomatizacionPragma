package com.pragma.demoblaze.tasks;


import com.pragma.demoblaze.iteractions.Wait;
import com.pragma.demoblaze.userinterfaces.DemoBlazeHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateUser implements Task {
    private List<Map<String, String>> userFields;

    public CreateUser(List<Map<String, String>> userFields) {
        this.userFields = userFields;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Wait.theSeconds(3),
                Click.on(DemoBlazeHome.SIGN_IN),
                Wait.theSeconds(3),
                Enter.theValue(userFields.get(0).get("username")).into(DemoBlazeHome.USERNAME_SIGN),
                Enter.theValue(userFields.get(0).get("password")).into(DemoBlazeHome.PASSWORD_SIGN),
                Click.on(DemoBlazeHome.BUTTON_SIGN)
        );
       // MyDriver.okButton();
        actor.attemptsTo(Wait.theSeconds(3));
    }

    public static CreateUser withDataFrom(List<Map<String, String>> userFields) {
        return instrumented(CreateUser.class, userFields);
    }

}
