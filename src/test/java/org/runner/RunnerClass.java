package org.runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.step.JvmReport;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\resources",glue="org.step",dryRun=false,
plugin = {"html:target\\Reports",
"junit:target\\Reports\\facebook.xml",
"json:target\\Reports\\face.json",
"rerun:src\\test\\resources\\Rerun\\failed.txt"
})

public class RunnerClass extends JvmReport{
	@AfterClass
	public static void callReport() {
		generateJvmReport(System.getProperty("user.dir")+"\\target\\Reports\\face.json");
		
	
	}

}
