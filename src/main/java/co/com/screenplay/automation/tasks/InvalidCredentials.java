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
public class InvalidCredentials implements Task {

    private String correo, password;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.keyValues(correo).into(TXT_EMAIL),
                SendKeys.of(password).into(TXT_PASSWORD),
                Click.on(BTN_SING_LOGIN)
        );

    }

    public static InvalidCredentials getInto(String correo, String password) {

        return Tasks.instrumented(InvalidCredentials.class,correo,password);
    }
}
