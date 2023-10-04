package co.com.auto.project.starsharp.grad.tasks;

import co.com.auto.project.starsharp.grad.userinterfaces.PaginaSerenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {
    private PaginaSerenity paginaSerenity;
    public static AbrirPagina urlApp(){
        return Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaSerenity));

    }
}
