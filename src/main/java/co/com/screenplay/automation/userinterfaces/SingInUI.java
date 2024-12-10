package co.com.screenplay.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SingInUI {

    public static final Target TXT_EMAIL = Target.the("Txt email")
            .located(By.id("email"));
    public static final Target TXT_PASSWORD = Target.the("Txt Password")
            .located(By.id("passwd"));
    public static final Target BTN_SING_LOGIN = Target.the("Boton Sing")
            .located(By.id("SubmitLogin"));
    public static final Target LINK_FORGOT_PASSWORD = Target.the("Link Password")
            .located(By.xpath("//a[contains(text(),'Forgot your password?')]"));

    public static final Target ALERT_INVALID_PASSWORD = Target.the("")
            .located(By.xpath("//li[contains(text(),'Authentication failed.')]"));

}
