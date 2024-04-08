package com.pragma.demoblaze.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class DemoBlazeProduct {

    public static final Target BOTTON_HOME = Target
            .the("Home")
            .locatedBy("//a[@id='nava']");

    public static final Target ADD_TO_CART = Target
            .the("Home")
            .locatedBy("//a[@class='btn btn-success btn-lg']");
}
