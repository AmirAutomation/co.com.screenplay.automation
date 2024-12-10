package co.com.screenplay.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.screenplay.automation.userinterfaces.HomeUI.BTN_SING_IN;

public class SignIn implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_SING_IN)
        );
    }

    public static SignIn navegationTo() {
        return Tasks.instrumented(SignIn.class);
    }

}
