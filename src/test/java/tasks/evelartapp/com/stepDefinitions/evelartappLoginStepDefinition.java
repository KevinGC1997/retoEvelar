package tasks.evelartapp.com.stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.evelartapp.com.models.evelartAppLogin;
import tasks.evelartapp.com.tasks.LoginEvelartApp;
import tasks.evelartapp.com.util.WebDriverFactory;

import java.util.List;

import static tasks.evelartapp.com.UI.LoginUI.TXT_TITLE;

public class evelartappLoginStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^That Brandon access successfully to the (.*)$")
    public void thatBrandonAccessSuccessfully(String website) {
        OnStage.theActorCalled("brandon").can(BrowseTheWeb.with(WebDriverFactory.goToWeb(website)));
    }


    @When("^Brandon logins on the site$")
    public void brandonLoginsOnTheSite(List<evelartAppLogin> evelartappLogins) {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginEvelartApp.onThesite()
                .Email(evelartappLogins.get(0).getEmail())
                .Password(evelartappLogins  .get(0).getPassword()));
    }

    @Then("^validate title (.*)$")
    public void validateTitlePruebaDeAutomatización(String validate) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion
                .the(TXT_TITLE), WebElementStateMatchers.containsText(validate)));
    }
}
