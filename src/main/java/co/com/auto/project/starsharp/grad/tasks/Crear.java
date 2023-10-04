package co.com.auto.project.starsharp.grad.tasks;

import co.com.auto.project.starsharp.grad.userinterfaces.PaginaSerenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Crear implements Task {
    public static Crear BusinessUnits(){
        return Tasks.instrumented(Crear.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaSerenity.BTN_ORGANIZACION),
                         Click.on(PaginaSerenity.BTN_UNIDADES),
                         Click.on(PaginaSerenity.BTN_NEWUNIDAD),
                         Enter.theValue("FINANCIERA").into(PaginaSerenity.TXT_NEWUNIDAD),
                         Click.on(PaginaSerenity.SELECIONAR),
                         Click.on(PaginaSerenity.SELECT),
                         Click.on(PaginaSerenity.SAVE));
    }
}
