package co.com.auto.project.starsharp.grad.tasks;

import co.com.auto.project.starsharp.grad.userinterfaces.PaginaSerenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Ingresar implements Task {
    public static Ingresar credenciales(){
        return Tasks.instrumented(Ingresar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("admin").into(PaginaSerenity.TXT_USUARIO),
                Enter.theValue("serenity").into(PaginaSerenity.TXT_CONTRASENIA),
                Click.on(PaginaSerenity.BTN_SING_IN));

    }
}
