package tasks.evelartapp.com.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InteractWithThis implements Interaction {

    Target element;
    String text;

    public InteractWithThis(Target element, String text) {
        this.element = element;
        this.text = text;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebElement listLocation = element.resolveFor(actor);
        List<WebElement> options = listLocation.findElements(By.tagName("a"));
        for (WebElement i : options) {
            if (i.getText().contains(text)){
                i.click();
                break;
            }
        }
    }
    public static InteractWithThis list(Target element, String text){
        return Instrumented.instanceOf(InteractWithThis.class).withProperties(element, text);
    }
}
