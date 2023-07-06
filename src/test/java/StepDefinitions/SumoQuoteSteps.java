package StepDefinitions;

import Pages.SumoQuote_Pom;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;

public class SumoQuoteSteps {
    SumoQuote_Pom elements = new SumoQuote_Pom();
    String email;

    @Given("Navigate to the web page")
    public void navigateToTheWebPage() {
        BasicDriver.getDriver().get("https://sumoquoteweb-qa.azurewebsites.net/new-account");
        BasicDriver.getDriver().manage().window().maximize();
    }

    @When("I fill up the new account form,tick the checkbox and click on the save button")
    public void iFillUpTheNewAccountFormTickTheCheckboxAndClickOnTheSaveButton() {
        elements.sendKeysMethod(elements.getOrganizationName(), "Testing");
        elements.sendKeysMethod(elements.getFirstName(), "Mila");
        elements.sendKeysMethod(elements.getLastName(), "Doe");
        ((JavascriptExecutor) BasicDriver.getDriver()).executeScript("window.open()");

        ArrayList<String> tabs = new ArrayList<String>(BasicDriver.getDriver().getWindowHandles());
        BasicDriver.getDriver().switchTo().window(tabs.get(1));
        BasicDriver.getDriver().get("https://generator.email/");
        elements.waitUntilVisible(BasicDriver.getDriver().findElement(By.cssSelector("span[id=email_ch_text]")));
        email = BasicDriver.getDriver().findElement(By.cssSelector("span[id=email_ch_text]")).getText();
        BasicDriver.getDriver().switchTo().window(tabs.get(0));
        elements.sendKeysMethod(elements.getEmail(), email);
        elements.sendKeysMethod(elements.getPhoneNumber(), "123 456 7777");
        elements.sendKeysMethod(elements.getPassword(), "Malnal1234@@");
        elements.sendKeysMethod(elements.getConfirmPassword(), "Malnal1234@@");
        elements.clickMethod(elements.getSelectOneBtn());
        elements.clickMethod(elements.getAboutSumoQuote());
        elements.waitMethod(2);
        elements.clickMethod(elements.getCheckBox());
        elements.clickMethod(elements.getSaveButton());
        BasicDriver.getDriver().switchTo().window(tabs.get(1));
        elements.waitMethod(15);
        // elements.clickMethod(elements.getRefreshBtn());
        // elements.waitMethod(7);
        //elements.clickMethod(elements.getVerifyBtn());
        BasicDriver.getDriver().switchTo().window(tabs.get(0));


    }

    @And("I login the page with valid values")
    public void iLoginThePageWithValidValues() {
        elements.clickMethod(elements.getLogIn());
        elements.sendKeysMethod(elements.getEmailOnLogin(), email);
        elements.sendKeysMethod(elements.getPasswordOnLogin(), "Malnal1234@@");
        elements.clickMethod(elements.getLoginButton());
    }

    @And("I click on get started button")
    public void iClickOnGetStartedButton() {
        elements.clickMethod(elements.getGetStartedButton());
    }

    @And("I fill up the title page content")
    public void iFillUpTheTitlePageContent() {
        String pathFile = "/Users/nurdane/IdeaProjects/Assignment/src/test/java/Pics/My-most-popular-pic-since-I-started-dog-photography-5a0b38cbd5e1e__880.jpeg";
        //  elements.clickMethod(elements.getCompanyLogo());
        // elements.sendKeysMethod(elements.getCompanyLogo(), pathFile);
        elements.waitUntilVisible(elements.getHelpingLine1());
        elements.sendKeysMethod(elements.getHelpingLine1(), "Roofing, Siding, Gutters");
        elements.sendKeysMethod(elements.getHelpingLine2(), "Residential & Commercial");



    }

    @When("I login the page with valid credentials")
    public void iLoginThePageWithValidCredentials() {
        elements.clickMethod(elements.getLogIn());
        elements.waitUntilVisible(elements.getEmailOnLogin());
        elements.sendKeysMethod(elements.getEmailOnLogin(), "wanja1971@fhvxkg2t.xyz");
        elements.waitUntilVisible(elements.getPasswordOnLogin());
        elements.sendKeysMethod(elements.getPasswordOnLogin(), "Calgary11@");
        elements.clickMethod(elements.getLoginButton());
    }

    @And("I click  See my brand button")
    public void iClickSeeMyBrandButton() {
        elements.waitUntilVisible(elements.getSeeMyBrandBtn());
        elements.getSeeMyBrandBtn().click();
        elements.clickMethod(elements.getMyBrand());
    }

    @And("I select my brand")
    public void iSelectMyBrand() {
        elements.clickMethod(elements.getMyBrand());
    }

    @And("I click on brand confirm button")
    public void iClickOnBrandConfirmButton() {
        elements.clickMethod(elements.getBrandConfirmBtn());
    }

    @And("I select type of work")
    public void iSelectTypeOfWork() {
        elements.clickMethod(elements.getTypeOfWork());
    }

    @And("I click on finish button")
    public void iClickOnFinishButton() {
        elements.clickMethod(elements.getFinishBtn());
    }

    @Then("I click on Let's Go button")
    public void iClickOnLetSGoButton() {
        elements.clickMethod(elements.getLetsGoBtn());
    }

}

