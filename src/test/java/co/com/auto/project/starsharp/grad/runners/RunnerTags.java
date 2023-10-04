package co.com.auto.project.starsharp.grad.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/",
        tags = "@CreateBusinessUnits",
        glue = "co/com/auto/project/starsharp/grad/stepdefinitions")

public class RunnerTags {
}
