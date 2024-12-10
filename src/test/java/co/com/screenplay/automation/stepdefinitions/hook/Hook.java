package co.com.screenplay.automation.stepdefinitions.hook;

import co.com.screenplay.automation.hook.OpenWeb;
import co.com.screenplay.automation.tasks.SignIn;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.screenplay.automation.util.Constants.ACTOR;

public class Hook {

    @Before
    public  void setSatge(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que el actor abre el navegador en la pagina de your company")
    public void HeOpensTheBrowserOnYourCompanyPage() {

        OnStage.theActorCalled(ACTOR).attemptsTo(OpenWeb.browserURL());
    }
    @And("ingresa al modulo Sign in")
    public void enterModuleSignIn() {
        OnStage.theActorCalled(ACTOR).attemptsTo(SignIn.navegationTo());
    }
}
