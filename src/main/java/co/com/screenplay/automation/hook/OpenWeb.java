package co.com.screenplay.automation.hook;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.util.EnvironmentVariables;

import static co.com.screenplay.automation.util.Constants.WEB_URL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenWeb implements Task {

    private EnvironmentVariables environmentVariables;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String pathWebURL = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(WEB_URL);
        actor.
                attemptsTo(Open.url(pathWebURL));
    }

    public static OpenWeb browserURL() {
        return instrumented(OpenWeb.class);
    }
}
