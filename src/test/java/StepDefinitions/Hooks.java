package StepDefinitions;

import Utilities.BasicDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;
import java.time.LocalDateTime;

public class Hooks {
    LocalDateTime startDateTime;

    @Before
    public void beforeScenario() {
        System.out.println("Scenario has started");
        startDateTime = LocalDateTime.now();

    }
    @After
    public void afterScenario(Scenario scenario) {
        System.out.println("Scenario has ended");
        LocalDateTime endTime = LocalDateTime.now();
        Duration duration = Duration.between(startDateTime, endTime);
        if (scenario.isFailed()) {
            final byte[] byteImage = ((TakesScreenshot) BasicDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(byteImage, "image/png", scenario.getName());
        }
           // BasicDriver.quitDriver();
        }

    }

