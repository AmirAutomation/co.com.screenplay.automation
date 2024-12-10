package co.com.screenplay.automation.questions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.screenplay.automation.userinterfaces.MyAccountUI.*;

@AllArgsConstructor
public class LoginSuccess implements Question<Boolean> {

    private String titleMyAccount;


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        if (titleMyAccount.equals(TITLE_MY_ACCOUNT.resolveFor(actor).getText())){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

    public static LoginSuccess validar(String myAccount) {
        return new LoginSuccess(myAccount);
    }

}
