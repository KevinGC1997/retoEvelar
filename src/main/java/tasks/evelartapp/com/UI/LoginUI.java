package tasks.evelartapp.com.UI;

import net.serenitybdd.screenplay.targets.Target;


public class    LoginUI {

    public static final Target TXT_USER = Target.the("user")
            .locatedBy("//input[@name='username']");
    public static final Target TXT_PASSWORD = Target.the("password")
            .locatedBy("//input[@name='password']");
    public static final Target BTN_SEND_BUTTON = Target.the("send button")
            .locatedBy("//button[@type='submit']");
    public static final Target TXT_TITLE = Target.the("tittle")
            .locatedBy("//h1[@class='text-center text-3xl p-3 m-3']");
}
