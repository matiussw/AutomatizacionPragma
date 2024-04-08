package com.pragma.demoblaze.questions;

import com.pragma.demoblaze.userinterfaces.DemoBlazeHome;
import com.pragma.demoblaze.userinterfaces.DemoBlazeProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateLogin implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(DemoBlazeHome.WELCOME_USER).answeredBy(actor).toString();
    }
    public static ValidateLogin login(){
        return new ValidateLogin();
    }
}
