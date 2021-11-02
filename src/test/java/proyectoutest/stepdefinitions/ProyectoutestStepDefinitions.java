package proyectoutest.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import proyectoutest.questions.Answer;
import proyectoutest.tasks.JoinToday;
import proyectoutest.tasks.OpenUp;

public class ProyectoutestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that the program is in manual we must automate$")
    public void thatTheProgramIsInManualWeMustAutomate() {
        OnStage.theActorCalled("program").wasAbleTo(OpenUp.thePage(), (JoinToday.onThePage()));
    }


    @When("^looking for the page to enter the login$")
    public void lookingForThePageToEnterTheLogin() {

    }

    @Then("^find everything related in it$")
    public void findEverythingRelatedInIt(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
