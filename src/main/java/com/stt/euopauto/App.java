package com.stt.euopauto;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Result result = JUnitCore.runClasses(AppTest.class);
        
        if(result.wasSuccessful()) {
        	System.out.println("well done");
        }else {
        	System.out.println("some thing wrong...");
        	for (Failure failure : result.getFailures()) {
            	System.out.println(failure.toString());
            	System.out.println(failure.getMessage());
            }
        }
        
    }
}
