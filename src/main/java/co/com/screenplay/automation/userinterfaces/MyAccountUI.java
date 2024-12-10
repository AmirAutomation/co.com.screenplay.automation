package co.com.screenplay.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MyAccountUI {

    public static final Target TITLE_MY_ACCOUNT = Target.the("").
            located(By.className("page-heading"));
}
