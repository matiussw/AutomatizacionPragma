package com.pragma.demoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerifyCategory implements Question<Boolean> {

    private Boolean state;

    public VerifyCategory() {
        this.state = true;
    }

    public static VerifyCategory verifyCategory() {
        return new VerifyCategory();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return state;
    }
}
