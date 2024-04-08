package com.pragma.demoblaze.stepdefinitions;


import com.pragma.demoblaze.iteractions.OkButton;
import com.pragma.demoblaze.iteractions.RefreshPage;
import com.pragma.demoblaze.iteractions.Wait;
import com.pragma.demoblaze.questions.ValidateLogin;
import com.pragma.demoblaze.questions.ValidationPay;
import com.pragma.demoblaze.tasks.CreateUser;
import com.pragma.demoblaze.tasks.UserLogged;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UserCreationStedDefinitions {

    @When("^User Creates an account$")
    public void userCreatesAnAccount(List<Map<String, String>> userAllFields) {
        theActorInTheSpotlight().attemptsTo(CreateUser.withDataFrom(userAllFields), Wait.theSeconds(2), OkButton.button(), RefreshPage.page(),
                UserLogged.withDataFrom(userAllFields),Wait.theSeconds(2));
    }

    @Then("User account is create and can See His Username {string}")
    public void userAccountIsCreateAndCanSeeHisUsername(String text) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateLogin.login(), Matchers.is(text)));
    }

}
