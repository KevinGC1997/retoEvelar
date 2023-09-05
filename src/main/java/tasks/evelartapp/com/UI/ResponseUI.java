package tasks.evelartapp.com.UI;

import net.serenitybdd.screenplay.targets.Target;

public class ResponseUI {

    public static final Target TXT_AREA = Target.the("Send text")
            .locatedBy("//textarea[@class='border-2 border-black rounded-sm p-2 resize-y']");

    public static final Target BTN_SEND = Target.the("button send")
            .locatedBy("//button[@type='submit']");

}
