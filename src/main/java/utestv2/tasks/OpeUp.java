package utestv2.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import utestv2.userinterface.UtestPage;

import static utestv2.userinterface.UtestPage.*;

public class OpeUp implements Task {
    private UtestPage utestPage;
    public static OpeUp thePage() {
        return Tasks.instrumented(OpeUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestPage), Click.on(SIGUP));
    }
}
