package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/features",
        glue = {"seleniumgluecode"},
        snippets = SnippetType.CAMELCASE,
        plugin = {"json:.report/report.json"},
        tags = ("@appium, ~@ignore")
)
public class AppiumRunner {
}
