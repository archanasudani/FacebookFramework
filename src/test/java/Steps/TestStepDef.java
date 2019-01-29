package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.jws.Oneway;
import java.util.concurrent.TimeUnit;

import static Steps.Hooks.myDriver;

public class TestStepDef {


    //   WebDriver myDriver;
    @Given("^That the user is navigated to the ChromeBrowser$")
    public void step1() {
//        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\personal\\FacebookFramework\\ChromeDriver.exe");
//        myDriver = new ChromeDriver();
        System.out.println("\nChrome Browser Open");
    }

    @When("^I access facebook url$")
    public void step2() {
        System.out.println("\n The Facebook login page is sucessfully opened ");
        myDriver.get("https://www.facebook.com/");

    }

    @Then("^I see facebook homepage$")
    public void step3() {
        System.out.println("I am in then");
        System.out.println(myDriver.getTitle());
        Assert.assertEquals(true, myDriver.getTitle().contains("Facebook"));
        myDriver.quit();
        System.out.println("Close the browser\n");
    }

    @When("^I access gmail url$")
    public void step4() {
        System.out.println("\n The Gmail login page is sucessfully opened ");
        myDriver.get("https://www.gmail.com/");

    }

    @Then("^I see gmail homepage$")
    public void step5() {
        System.out.println("I am in then");
        System.out.println(myDriver.getTitle());
        Assert.assertEquals(true, myDriver.getTitle().contains("Gmail"));
        myDriver.quit();
        System.out.println("Close the browser\n");
    }

    @When("^I access amazon url$")
    public void step6() {
        System.out.println("\n The Amazon login page is sucessfully opened ");
        myDriver.get("http://amazon.co.uk");

    }

    @Then("^I see amazon homepage$")
    public void step7() {
        System.out.println("I am in then");
        System.out.println(myDriver.getTitle());
        Assert.assertEquals(true, myDriver.getTitle().contains("Amazon"));
        myDriver.quit();
        System.out.println("Close the browser\n");
    }

    @When("^I access ebay url$")
    public void step8() {
        System.out.println("\n The ebay login page is sucessfully opened ");
        myDriver.get("https://www.ebay.co.uk/");

    }

    @Then("^I see ebay homepage$")
    public void step9() {
        System.out.println("I am in then");
        System.out.println(myDriver.getTitle());
        Assert.assertEquals(true, myDriver.getTitle().contains("eBay"));
        myDriver.quit();
        System.out.println("Close the browser\n");
    }

    @When("^I access \"([^\"]*)\"Website$")
    public void step10(String arg) {
        myDriver.get(arg);

    }

    @Then("^I can see \"([^\"]*)\"homepage$")
    public void step11(String arg) {
        System.out.println(arg + " website launched in Chrome browser\n");
        System.out.println(myDriver.getTitle() + "\n");
        Assert.assertEquals(true, myDriver.getTitle().contains(arg));
        System.out.println(myDriver.getTitle().contains(arg) + "\n");
        myDriver.quit();
        System.out.println("Close the browser\n");
    }
}