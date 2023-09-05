package tasks.evelartapp.com.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/tasks.evelartapp.com.features/evelartapp.feature",
        glue = "tasks.evelartapp.com.stepDefinitions",
        tags = "@login",
        snippets = SnippetType.CAMELCASE
)
public class evelartappLoginRunner {
}
