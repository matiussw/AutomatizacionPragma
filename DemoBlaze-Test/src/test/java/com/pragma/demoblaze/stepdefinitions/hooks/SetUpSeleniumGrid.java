package com.pragma.demoblaze.stepdefinitions.hooks;

import io.appium.java_client.windows.WindowsDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SetUpSeleniumGrid {

    WebDriver hisdriver;

    @Before
    public void setSeleniumGrid() throws MalformedURLException {

        String browser = System.getProperty("webdriver.driver", "chrome");

        WebDriver driver;
        switch (browser) {
            case "firefox":
                FirefoxOptions firefox = new FirefoxOptions();
                firefox.addPreference("media.navigator.permission.disabled", true);
                firefox.addPreference("media.navigator.streams.fake", true);
                firefox.addArguments("--disable-smooth-scrolling");
                firefox.addArguments("--disable-popup-blocking");
                firefox.addArguments("--start-maximized");
                firefox.addArguments("--test-type");
                firefox.addPreference("security.cert_pinning.enforcement_level", 0);
                firefox.addArguments("--allow-running-insecure-content");
                firefox.addArguments("--always-authorize-plugins");
                firefox.addArguments("--disable-extensions");
                firefox.addArguments("--disable-gpu");
                firefox.addArguments("--disable-translate");
                firefox.addArguments("--no-sandbox");
                firefox.addArguments("--log-level=1");
                firefox.addArguments("--use-file-for-fake-video-capture=/teo.y4m");
                driver = new RemoteWebDriver(new URL("http://localhost:4444/"), firefox);
                break;

            case "chrome":
            default:
                ChromeOptions chrome = new ChromeOptions();
                chrome.addArguments("--allow-file-access");
                chrome.addArguments("--use-fake-ui-for-media-stream");
                chrome.addArguments("--use-fake-device-for-media-stream");
                chrome.addArguments("--disable-smooth-scrolling");
                chrome.addArguments("--disable-popup-blocking");
                chrome.addArguments("--disable-download-notification");
                chrome.addArguments("--start-maximized");
                chrome.addArguments("--test-type");
                chrome.addArguments("--ignore-certificate-errors");
                chrome.addArguments("--ignore-urlfetcher-cert-requests");
                chrome.addArguments("--allow-running-insecure-content");
                chrome.addArguments("--always-authorize-plugins");
                chrome.addArguments("--disable-extensions");
                chrome.addArguments("--disable-dev-shm-usage");
                chrome.addArguments("--disable-gpu");
                chrome.addArguments("--disable-translate");
                chrome.addArguments("--no-sandbox");
                chrome.addArguments("--log-level=1");
                chrome.addArguments("--use-file-for-fake-video-capture=/teo.y4m");
                driver=new RemoteWebDriver(new URL("http://localhost:4444/"), chrome);
                break;
        }

        hisdriver = driver;
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisdriver));

    }
    @After
    public void quitDriver() {
        hisdriver.quit();
    }
}
