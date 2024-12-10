package co.com.screenplay.automation.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI {

    public static final Target BTN_SING_IN = Target.the("Boton Sing in")
            .located(By.className("login"));

}
