package co.com.screenplay.automation.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;

import static co.com.screenplay.automation.userinterfaces.SingInUI.*;

@AllArgsConstructor
public class CorrectlyCredentials implements Task {

    private String correo,passsword;
    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Enter.keyValues(correo).into(TXT_EMAIL),
                    SendKeys.of(passsword).into(TXT_PASSWORD),
                    Click.on(BTN_SING_LOGIN)
            );
    }

    public static CorrectlyCredentials getInto(String correo, String passsword) {
        return Tasks.instrumented(CorrectlyCredentials.class, correo, passsword);
    }
}
