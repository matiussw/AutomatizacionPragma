package com.pragma.demoblaze.stepdefinitions;


import com.pragma.demoblaze.iteractions.Wait;
import com.pragma.demoblaze.questions.ValidationPay;
import com.pragma.demoblaze.tasks.BuyPhone;
import com.pragma.demoblaze.tasks.Pay;
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

public class UserLoggedBuyPayStedDefinitions {

    @Given("the user is on the homepage of {string}")
    public void theUserIsOnTheHomepageOf(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }

    @Given("^User is in the Demo HomePage and Logged$")
    public void userIsInTheDemoHomePageAndLogged(List<Map<String, String>> userAllFields) {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.demoblaze.com/"),
                Wait.theSeconds(5), UserLogged.withDataFrom(userAllFields));
    }
    @When("User buy And Enter Data")
    public void userBuyAndEnterData(List<Map<String, String>> userAllFields) {
        theActorInTheSpotlight().attemptsTo(Wait.theSeconds(2), BuyPhone.phone(), Pay.pays(userAllFields));
    }
    @Then("^User pays his buy and see the message confirm '(.*)'$")
    public void userPaysHisBuy(String expresion) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationPay.inTheScreen(), Matchers.is(expresion)));
    }


    @When("the user clicks on the Laptops button")
    public void theUserClicksOnTheLaptopsButton() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the system displays the products filtered by Laptops")
    public void theSystemDisplaysTheProductsFilteredByLaptops() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user logs in and clicks on the Laptops button and selects a product")
    public void theUserLogsInAndClicksOnTheLaptopsButtonAndSelectsAProduct(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the system should load the selected product and the {string} button should appear")
    public void theSystemShouldLoadTheSelectedProductAndTheButtonShouldAppear(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user clicks on the Phone button")
    public void theUserClicksOnThePhoneButton() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the system displays the products filtered by Phone")
    public void theSystemDisplaysTheProductsFilteredByPhone() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user clicks on the listOfMonitor button")
    public void theUserClicksOnTheListOfMonitorButton() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the system displays the products filtered by list Of Monitor")
    public void theSystemDisplaysTheProductsFilteredByListOfMonitor() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
