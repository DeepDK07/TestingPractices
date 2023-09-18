package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features = {"src/test/resources/Features/HRM.feature"} ,
                  glue = {"StepDef"},
                  plugin = {"pretty", "html:target/Reports/reports.html"}
                                    )
public class TestRunner extends AbstractTestNGCucumberTests {
	
}
