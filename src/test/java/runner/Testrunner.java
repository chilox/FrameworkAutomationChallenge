package runner;

import com.intuit.karate.junit5.Karate;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/features",
        glue = {"seleniumgluecode"},
        snippets = SnippetType.CAMELCASE,
        plugin = {"json:.report/report.json"},
        tags = ("@browser, @appium, ~@ignore, @run")
)



public class Testrunner {

    @AfterClass
    public static void generateReport(){
        try {
            System.out.println("generando reporte");
            String[] cmd = {"cmd.exe", "/c", "npm run report"};
            Runtime.getRuntime().exec(cmd);
            System.out.println("Reporte generado satisfacrotiamente");

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }


}
