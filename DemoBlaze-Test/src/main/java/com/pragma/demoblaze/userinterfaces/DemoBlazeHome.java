package com.pragma.demoblaze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DemoBlazeHome {

    public static final Target LOGIN_INPUT = Target
            .the("Login")
            .locatedBy("//a[@id='login2']");
    public static final Target SIGN_IN = Target
            .the("Registration")
            .locatedBy("//a[@id='signin2']");
    public static final Target USERNAME_LOGIN = Target
            .the("User login")
            .locatedBy("//input[@id='loginusername']");

    public static final Target PASSWORD_LOGIN = Target
            .the("Login password")
            .locatedBy("//input[@id='loginpassword']");

    public static final Target BUTTON_LOGIN = Target
            .the("Login button")
            .locatedBy("//button[@onclick='logIn()']");

    public static final Target USERNAME_SIGN = Target
            .the("User sign")
            .locatedBy("//input[@id='sign-username']");

    public static final Target PASSWORD_SIGN = Target
            .the("sign password")
            .locatedBy("//input[@id='sign-password']");

    public static final Target BUTTON_SIGN = Target
            .the("sign button")
            .locatedBy("//button[@onclick='register()']");

    public static final Target BUTTON_PHONE = Target
            .the("Phone")
            .locatedBy("//a[@onclick=\"byCat('phone')\"]");

    public static final Target BUTTON_LAPTOP = Target
            .the("Laptop")
            .locatedBy("//a[@onclick=\"byCat('notebook')\"]");

    public static final Target BUTTON_MONITOR = Target
            .the("Monitor")
            .locatedBy("//a[@onclick=\"byCat('monitor')\"]");

    public static final Target PHONE_PRODUCT = Target
            .the("Product Phone")
            .locatedBy("//a[@href=\"prod.html?idp_=1\"]");

    public static final Target LAPTOP_PRODUCT = Target
            .the("Product Laptop")
            .locatedBy("//img[@src=\"imgs/macbook_air.jpg\"]");
    public static final Target MONITOR_PRODUCT = Target
            .the("Product Monitor")
            .locatedBy("//img[@src=\"imgs/apple_cinema.jpg\"]");
    public static final Target BUTTON_CART = Target
            .the("Cart")
            .locatedBy("//a[@id='cartur']");
    public static final Target WELCOME_USER = Target
            .the("User")
            .locatedBy("//a[@id='nameofuser']");

}
