package net.wot;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by thipau on 7/1/14.
 */
@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, format = {"pretty", "html:target/cucumber"})
public class AcceptanceTest {
}
