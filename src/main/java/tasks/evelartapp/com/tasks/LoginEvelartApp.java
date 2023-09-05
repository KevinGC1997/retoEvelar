package tasks.evelartapp.com.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.interactions.Actions;
import tasks.evelartapp.com.interactions.ExplicitWait;
import tasks.evelartapp.com.util.DatosExcel;

import java.io.IOException;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static tasks.evelartapp.com.UI.LoginUI.*;
import static tasks.evelartapp.com.util.WebDriverFactory.*;


public class LoginEvelartApp implements Task {

    private String email;
    private String password;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                ExplicitWait.here(20),
                Enter.theValue(email).into(TXT_USER),
                Enter.theValue(password).into(TXT_PASSWORD),
                ExplicitWait.here(10),
                WaitUntil.the(BTN_SEND_BUTTON, isVisible()).forNoMoreThan(129).seconds(),
                JavaScriptClick.on(BTN_SEND_BUTTON),
                WaitUntil.the(TXT_TITLE, isVisible()).forNoMoreThan(30).seconds()
        );
    }
    public static LoginEvelartApp onThesite(){
        return Instrumented.instanceOf(LoginEvelartApp.class).withProperties();
    }

    public LoginEvelartApp Email(String email) {
        this.email = email;
        return this;
    }
    public LoginEvelartApp Password(String password) {
        this.password = password;
        return this;
    }


}
