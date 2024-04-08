package com.pragma.demoblaze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DemoBlazeCart {

    public static final Target BOTTON_PAY = Target
            .the("place order")
            .locatedBy("//button[@class='btn btn-success']");

    public static final Target NAME_INPUT = Target
            .the("Name Input")
            .locatedBy("//input[@id='name']");

    public static final Target COUNTRY_INPUT = Target
            .the("country Input")
            .locatedBy("//input[@id='country']");

    public static final Target CITY_INPUT = Target
            .the("city Input")
            .locatedBy("//input[@id='city']");

    public static final Target CARD_INPUT = Target
            .the("card Input")
            .locatedBy("//input[@id='card']");

    public static final Target MOUNTH_INPUT = Target
            .the("month Input")
            .locatedBy("//input[@id='month']");

    public static final Target YEAR_INPUT = Target
            .the("year Input")
            .locatedBy("//input[@id='year']");

    public static final Target BUTTON_PURCHARSE = Target
            .the("purchase")
            .locatedBy("//button[@onclick='purchaseOrder()']");

    public static final Target BUTTON_OK = Target
            .the("Finish purchase")
            .locatedBy("//button[@class='confirm btn btn-lg btn-primary']");

    public static final Target MESSANGE_CONFIRM = Target
            .the("Confirm purchase")
            .locatedBy("//h2[contains(text(),'Thank you for your purchase!')]");

}
