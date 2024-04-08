package com.pragma.demoblaze.questions;



import com.pragma.demoblaze.userinterfaces.DemoBlazeProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationPage implements Question<String> {
    public String answeredBy(Actor actor) {
        return Text.of(DemoBlazeProductPage.BUTTON_ADD_CART).answeredBy(actor).toString();
    }

    public static ValidationPage inTheScreen() {
        return new ValidationPage();
    }
}
