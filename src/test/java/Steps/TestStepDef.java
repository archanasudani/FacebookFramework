package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestStepDef {

    WebDriver myDriver;
    @Given("^That the user is navigated to the ChromeBrowser$")
    public void step1() {
        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\personal\\FacebookFramework\\ChromeDriver.exe");
        myDriver = new ChromeDriver();
        System.out.println("\nChrome Browser Open");
    }

    @When("^I access facebook url$")
    public void step2() {
        System.out.println("\n The Facebook login page is sucessfully opened ");
        myDriver.get("https://www.facebook.com/");

    }
    @Then("^I see facebook homepage$")
    public void step3(){
        System.out.println("I am in then");
        System.out.println("myDriver.getTitle()");
        Assert.assertEquals(true,myDriver.getTitle().contains("Facebook"));
        myDriver.quit();
          }

}



