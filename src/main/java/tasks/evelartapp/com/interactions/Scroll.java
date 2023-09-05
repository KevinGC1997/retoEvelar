package tasks.evelartapp.com.interactions;


import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import static tasks.evelartapp.com.util.WebDriverFactory.driver;


public class Scroll implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,600)");
        try{Thread.sleep(6000);}catch(InterruptedException e){Thread.currentThread().interrupt();}
    }
    public static Scroll onTheFront() {
        return Instrumented.instanceOf(Scroll.class).withProperties();
    }
}
