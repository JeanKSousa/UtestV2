package utestv2.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;
import utestv2.models.UserData;
import utestv2.userinterface.GlobalAddress;

import java.util.List;

import static utestv2.userinterface.GlobalAddress.*;

public class Entering implements Task {
    public Entering(List<UserData> userData) {
        this.userData = userData;
    }
    List<UserData> userData;
    public static Entering globalAddress(List<UserData> userData) {
        return Tasks.instrumented(Entering.class, userData);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CITY).andAlignToTop(),
                Enter.theValue(userData.get(0).getCity()).into(CITY),
                Enter.theValue(userData.get(0).getPostal()).into(POSTAL),
                Click.on(COUNTRY1),
                Enter.theValue(userData.get(0).getCountry()).into(COUNTRY2).thenHit(Keys.ENTER),
                Click.on(NEXT_STEP2)
        );
    }
}
