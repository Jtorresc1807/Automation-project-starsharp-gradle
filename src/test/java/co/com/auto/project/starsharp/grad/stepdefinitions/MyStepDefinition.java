package co.com.auto.project.starsharp.grad.stepdefinitions;

import co.com.auto.project.starsharp.grad.questions.Verificar;
import co.com.auto.project.starsharp.grad.tasks.AbrirPagina;
import co.com.auto.project.starsharp.grad.tasks.Crear;
import co.com.auto.project.starsharp.grad.tasks.Ingresar;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;


public class MyStepDefinition {

    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that Jaime enters the page serenity")
    public void thatJaimeEntersThePageSerenity() {
        OnStage.theActorCalled("Jaime").wasAbleTo(AbrirPagina.urlApp());
    }

    @When("Enter the credentials and enter the page")
    public void enterTheCredentialsAndEnterThePage() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.credenciales());
    }

    @Then("Verify that you were able to enter correctly")
    public void verifyThatYouWereAbleToEnterCorrectly() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.resultado(),
                Matchers.is(true)));
    }

    @When("enter the organization menu")
    public void enterTheOrganizationMenu() {
        OnStage.theActorInTheSpotlight().attemptsTo(Crear.BusinessUnits());
    }

    @And("enter the business unit menu")
    public void enterTheBusinessUnitMenu() {
    }

    @And("created the business unit")
    public void createdTheBusinessUnit() {
    }
}