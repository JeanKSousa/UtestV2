package utestv2.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import utestv2.models.UserData;
import utestv2.question.Answer;
import utestv2.tasks.*;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class UtestStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^i enter on Utest web site$")
    public void iEnterOnUtestWebSite() throws Exception {
        theActorCalled("Jean").wasAbleTo(OpeUp.thePage());
    }

    @When("^I type my personal information$")
    public void iTypeMyPersonalInformation(List<UserData> userData) throws Exception {
        theActorInTheSpotlight().attemptsTo(
                FillOut.personalInformation(userData),
                Entering.globalAddress(userData),
                Selecting.deviceInformation(userData),
                Checking.segurityInfomation(userData)

        );
    }

    @Then("^I complete my Register$")
    public void iCompleteMyRegister(List<UserData> userData) throws Exception {
        theActorInTheSpotlight().should(seeThat(Answer.toThe(userData)));
    }
}
