package co.com.screenplay.automation.stepdefinitions;

import co.com.screenplay.automation.questions.*;
import co.com.screenplay.automation.tasks.CorrectlyCredentials;
import co.com.screenplay.automation.tasks.InvalidCredentials;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.screenplay.automation.util.Constants.ACTOR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutomationStep {

    @When("ingresa el correo {string} y contraseña {string} erroneamente")
    public void EnterCredentialsWrongly(String correo, String password) {
        OnStage.theActorCalled(ACTOR).attemptsTo(InvalidCredentials.getInto(correo,password));
    }
    @Then("visualizaremos una alerta de error en la autenticacion")
    public void WeWillDisplayAnAuthenticationErrorAlert() {
        theActorInTheSpotlight().should(seeThat(
                LoginFailed.validar("Authentication failed."))
        );
    }

    @When("ingresa el correo {string} y contraseña {string} correctamente")
    public void EnterCredentialsCorrectly(String correo, String password) {
        OnStage.theActorCalled(ACTOR).attemptsTo(CorrectlyCredentials.getInto(correo,password));
    }
    @Then("visualizaremos el home de la tienda de compra")
    public void WeWillvisualizeHometheStorePurchase() {
        theActorInTheSpotlight().should(seeThat(
                LoginSuccess.validar("MY ACCOUNT")
        ));
    }
}
