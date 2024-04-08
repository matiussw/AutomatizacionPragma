package com.pragma.demoblaze.questions;


import com.pragma.demoblaze.userinterfaces.DemoBlazeCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationPay implements Question<String> {
    public String answeredBy(Actor actor) {
        System.out.println(Text.of(DemoBlazeCart.MESSANGE_CONFIRM).answeredBy(actor));
        return Text.of(DemoBlazeCart.MESSANGE_CONFIRM).answeredBy(actor);
    }

    public static ValidationPay inTheScreen() {
        return new ValidationPay();
    }
}
