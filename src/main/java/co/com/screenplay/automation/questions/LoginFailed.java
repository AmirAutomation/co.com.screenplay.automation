package co.com.screenplay.automation.questions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.screenplay.automation.userinterfaces.SingInUI.ALERT_INVALID_PASSWORD;

@AllArgsConstructor
public class LoginFailed implements Question<Boolean> {

    private String alertLoginFailed;

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        if (alertLoginFailed.equals(ALERT_INVALID_PASSWORD.resolveFor(actor).getText())){
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
