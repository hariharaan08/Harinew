package org.step;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void generateJvmReport(String jsonPath) {
		File f = new File(System.getProperty("user.dir")+"\\target\\Reports\\Cucumber");
		Configuration con = new Configuration(f, "Facebook Project");
		con.addClassifications("Browser Name", "Chrome");
		con.addClassifications("Browser Version", "124");
		
		List<String> l = new ArrayList<String>();
		l.add(jsonPath);
		ReportBuilder r = new ReportBuilder(l, con);
		r.generateReports();
		
		
		

	}

}
