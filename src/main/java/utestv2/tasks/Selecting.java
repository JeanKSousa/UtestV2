package utestv2.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;
import utestv2.models.UserData;

import java.util.List;

import static utestv2.userinterface.DeviceInformation.*;

public class Selecting implements Task {
    public Selecting(List<UserData> userData) {
        this.userData = userData;
    }
    List<UserData> userData;
    public static Selecting deviceInformation(List<UserData> userData) {
        return Tasks.instrumented(Selecting.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(COMPUTER1).andAlignToTop(),
                Click.on(COMPUTER1),
                Enter.theValue(userData.get(0).getComputer()).into(COMPUTER2).thenHit(Keys.ENTER),
                Click.on(VERSION1),
                Enter.theValue(userData.get(0).getVersion()).into(VERSION2).thenHit(Keys.ENTER),
                Click.on(LANGUAGE_DEVICE1),
                Enter.theValue(userData.get(0).getLanguage()).into(LANGUAGE_DEVICE2).thenHit(Keys.ENTER),
                Click.on(MOBIL1),
                Enter.theValue(userData.get(0).getMobil()).into(MOBIL2).thenHit(Keys.ENTER),
                Click.on(MODE1),
                Enter.theValue(userData.get(0).getModel()).into(MODEL2).thenHit(Keys.ENTER),
                Click.on(SYSTEM1),
                Enter.theValue(userData.get(0).getSystem()).into(SYSTEM2).thenHit(Keys.ENTER),
                Click.on(NEXT_STEP3)
        );
    }
}
