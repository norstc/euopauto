package com.stt.euopauto;

import org.apache.log4j.Logger;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Hello world!
 *
 */
public class App 
{
	public static Logger log = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
        log.info( "Hello World!" );
        Result result = JUnitCore.runClasses(AppTest.class,ActivityFeedbackServiceTest.class);
        
        if(result.wasSuccessful()) {
        	log.info("well done");
        }else {
        	log.info("some thing wrong...");
        	for (Failure failure : result.getFailures()) {
            	log.info(failure.toString());
            	log.info(failure.getMessage());
            }
        }
        
    }
}
