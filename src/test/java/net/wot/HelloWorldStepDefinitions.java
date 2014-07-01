package net.wot;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;


/**
 * Created by thipau on 7/1/14.
 */
public class HelloWorldStepDefinitions {

    private String user = null;

    @Given("^a user (\\w*)$")
    public void a_user(String user) throws Throwable {
        this.user = user;
    }

    @When("^.*logs in$")
    public void logs_in() throws Throwable {
        //do nothing
    }

    @Then("^a greeting is displayed saying \"(.*?)\"$")
    public void a_greeting_is_displayed_saying(String greeting) throws Throwable {
        assertThat("Hello Bob!", is(equalTo(greeting)));
    }
}
