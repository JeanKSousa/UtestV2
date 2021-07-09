package utestv2.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import utestv2.models.UserData;
import utestv2.userinterface.PersonalInformation;

import java.util.List;

import static utestv2.userinterface.PersonalInformation.*;

public class FillOut implements Task {
    public FillOut(List<UserData> userData) {
        this.userData = userData;
    }
    List<UserData> userData;

    public static FillOut personalInformation(List<UserData> userData) {
        return Tasks.instrumented(FillOut.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(FIRSTNAME).andAlignToTop(),
                Enter.theValue(userData.get(0).getFirstName()).into(FIRSTNAME),
                Enter.theValue(userData.get(0).getLastName()).into(LASTNAME),
                Enter.theValue(userData.get(0).getEmail()).into(EMAIL),
                SelectFromOptions.byIndex(6).from(MONTH),
                SelectFromOptions.byIndex(15).from(DAY),
                SelectFromOptions.byIndex(11).from(YEAR),
                Click.on(LANGUAGE),
                Enter.theValue(userData.get(0).getLanguage()).into(LANGUAGE).thenHit(Keys.ENTER),
                Click.on(NEXT_STEP)
        );
    }
}
