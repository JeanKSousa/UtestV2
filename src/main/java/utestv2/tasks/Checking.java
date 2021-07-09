package utestv2.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import utestv2.models.UserData;

import java.util.List;

import static utestv2.userinterface.SecurityInformation.*;

public class Checking implements Task {
    public Checking(List<UserData> userData) {
        this.userData = userData;
    }
    List<UserData> userData;
    public static Checking segurityInfomation(List<UserData> userData) {
        return Tasks.instrumented(Checking.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(PASSWORD1).andAlignToTop(),
                Enter.theValue(userData.get(0).getPassword()).into(PASSWORD1),
                Enter.theValue(userData.get(0).getPassword()).into(PASSWORD2),
                Click.on(STAY),
                Click.on(TERMS),
                Click.on(PRIVACY),
                Scroll.to(NAME_STEP).andAlignToTop()
        );

    }
}
