package com.stt.euopauto.framework;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomisedListner implements ITestListener {
	
	public Logger log = LogManager.getLogger("CustomisedListener");
	// 自定义测试日志输出

	public void onFinish(ITestContext testContext) {
		log.info("Passed test cases");
		Set<ITestResult> testResults = testContext.getPassedTests().getAllResults();
		for(ITestResult result : testResults) {
			log.info(result.getName());
		}
		
		log.info("Failed test cases");
		testResults = testContext.getFailedTests().getAllResults();
		for(ITestResult result : testResults) {
			log.info(result.getName());
		}
		
		log.info("Test completed on: " + testContext.getEndDate().toString());

	}
	

}
