package tasks.evelartapp.com.stepDefinitions;

import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.evelartapp.com.models.evelartAppLogin;
import tasks.evelartapp.com.tasks.LoginEvelartApp;
import tasks.evelartapp.com.tasks.ResponseEvelartApp;

import java.util.List;

public class evelarApppResponseQuestionStepDefinitions {

    @When("^Brandon logins on the site and response question$")
    public void brandonLoginsOnTheSiteAndResponseQuestion(List<evelartAppLogin> evelartappLogins) {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginEvelartApp.onThesite()
                .Email(evelartappLogins.get(0).getEmail())
                .Password(evelartappLogins  .get(0).getPassword()),
                ResponseEvelartApp.onThesite());
    }
}
