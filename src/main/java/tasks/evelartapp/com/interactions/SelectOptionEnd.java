package tasks.evelartapp.com.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionEnd implements Interaction {
    Target element;
    String text;

    public SelectOptionEnd(Target element, String text) {
        this.element = element;
        this.text = text;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebElement listlocation = element.resolveFor(actor);
        Select select = new Select(listlocation);
        select.selectByVisibleText(text);


    }

    public static SelectOptionEnd here(Target element, String text) {
        return Instrumented.instanceOf(SelectOptionEnd.class).withProperties(element, text);
    }
}
