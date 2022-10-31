package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {

	public static ExtentReports extent;
	public static ExtentReports getReports() {
		
		String path="C:\\Users\\Dell\\Desktop\\Visionfolder\\Framework_Batch14\\Reports\\index.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("Batch 14 Automation Test Reports");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project Name", "FaceBook Testing");
		extent.setSystemInfo("Module Name", "Login");
		extent.setSystemInfo("Automation Tool", "Selenium WebDriver");
		extent.setSystemInfo("O.S.", "Windows 10");
		extent.setSystemInfo("QA Name", "ABC");
		return extent;
		
		
	}
}
