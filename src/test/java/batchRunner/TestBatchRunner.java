package batchRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import stepDefination.TestMeAppTest;

@RunWith(Cucumber.class)
@CucumberOptions(features="cucCase.feature",glue= {"stepDefination"},
tags= {"@Tag1,@Tag2,@Tag3"},plugin= {"json:target\\cucumber-report.json"})

public class TestBatchRunner {
	

}
