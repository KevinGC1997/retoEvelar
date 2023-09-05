package tasks.evelartapp.com.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import tasks.evelartapp.com.interactions.ExplicitWait;
import tasks.evelartapp.com.util.DatosExcel;

import java.io.IOException;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static tasks.evelartapp.com.UI.ResponseUI.*;

public class ResponseEvelartApp implements Task {

    public static Target response1 = null;



    @Override
    public <T extends Actor> void performAs(T actor) {
        DatosExcel datos = new DatosExcel();
        {
            try {
                System.out.println(datos.leerDatoExcel("Hoja de datos", "data.xlsx", 1, 0));
                for (int i = 0; i<10; i++){
                    actor.attemptsTo(
                            WaitUntil.the(TXT_AREA, isVisible()).forNoMoreThan(5).seconds(),
                            Enter.theValue(datos.leerDatoExcel("Hoja de datos", "data.xlsx", 1, i)).into(TXT_AREA)
                    );
                    for (int j = 2; j <=datos.leerDatoExcel("Hoja de datos", "data.xlsx", 11, i).length(); j++ ){
                        System.out.println("lengt para segunda vuelta "+datos.leerDatoExcel("Hoja de datos", "data.xlsx", 11, i).length());
                        System.out.println(datos.leerDatoExcel("Hoja de datos", "data.xlsx", 11, i));
                        response1 = Target.the("click in response one")
                                .locatedBy("//input[@value='"+""+datos.leerDatoExcel("Hoja de datos", "data.xlsx", j, i)+"']");
                        actor.attemptsTo(
                                WaitUntil.the(response1, isVisible()).forNoMoreThan(5).seconds(),
                                Click.on(response1)
                        );
                    }
                    actor.attemptsTo(
                            Click.on(BTN_SEND)
                    );
                }
                actor.attemptsTo(
                        ExplicitWait.here(10)
                );

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static ResponseEvelartApp onThesite(){
        return Instrumented.instanceOf(ResponseEvelartApp.class).withProperties();
    }
}
