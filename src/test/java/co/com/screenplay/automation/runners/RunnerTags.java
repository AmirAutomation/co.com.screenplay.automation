package co.com.screenplay.automation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/automation.feature",
        glue = "co.com.screenplay.automation",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@Regresion"
)
public class RunnerTags {
}
