package com.pragma.demoblaze.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/user_create_account.feature",
        glue = "com.pragma.demoblaze.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class UserCreationFirefoxRun {
    static {
        System.setProperty("webdriver.driver", "firefox");
    }
}
