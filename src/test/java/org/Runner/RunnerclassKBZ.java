package org.Runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvmreport.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.stepDefKBZ",plugin= {"json:C:\\Users\\Sethu\\eclipse-workspace\\KBZBank\\Reports\\jsonReport\\KBZBank.json"})
public class RunnerclassKBZ {
	@AfterClass
	public static void generateAll() {
		JVMReport.jvmReport("C:\\Users\\Sethu\\eclipse-workspace\\KBZBank\\Reports\\jsonReport\\KBZBank.json");

	}

}
