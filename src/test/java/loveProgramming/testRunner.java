package loveProgramming;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\personal\\FacebookFramework\\src\\test\\Features",
        //features ="C:\\Users\\personal\\FacebookFramework\\src\\test\\Examples.Features",
        tags = {"@a"},
        glue = {"Steps"},
        //format = {"json:target/cucumber.json" +
        //        ""}
        plugin = {"pretty", "html:target/cucumber-reports"}
//         plugin = { "pretty", "json:target/cucumber.json" }
)
public class testRunner {

}
