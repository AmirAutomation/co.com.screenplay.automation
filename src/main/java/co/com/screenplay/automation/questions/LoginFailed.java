package co.com.screenplay.automation.questions;

import co.com.screenplay.automation.userinterfaces.SingInUI;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.screenplay.automation.userinterfaces.SingInUI.*;

@AllArgsConstructor
public class LoginFailed implements Question<Boolean> {

    private String alertLoginFailed;

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        if (alertLoginFailed.equals(SingInUI.ALERT_ERROR(alertLoginFailed).resolveFor(actor).getText())){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

    public static LoginFailed validar(String alertLoginFailed) {
        return new LoginFailed(alertLoginFailed);
    }
}
