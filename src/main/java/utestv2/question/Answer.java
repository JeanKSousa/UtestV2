package utestv2.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import utestv2.models.UserData;
import utestv2.userinterface.SearchNameStep;

import java.util.List;

public class Answer implements Question<Boolean>{
    public Answer(List<UserData> userData) {
        this.userData = userData;
    }
    List<UserData> userData;
    public static Answer toThe(List<UserData> userData) {
        return new Answer(userData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse = Text.of(SearchNameStep.NAME_STEP).viewedBy(actor).asString();
        if (userData.get(0).getCompleted().equals(nameCourse)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
