package co.com.auto.project.starsharp.grad.questions;

import co.com.auto.project.starsharp.grad.userinterfaces.PaginaSerenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Verificar implements Question {

    public static Verificar resultado(){
        return new Verificar();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean compare=PaginaSerenity.LBL_DASHBOARD.resolveFor(actor).getText().equals("Orders");
        return compare;
    }
}
