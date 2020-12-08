package com.stt.euopauto;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * EUOP 自动测试程序入口
 *
 */
public class App 
{
	public static Logger log = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        log.info( "EUOP 自动测试开始" );
        //使用Junit 运行测试用例集
        Result result = JUnitCore.runClasses(
        		//基本测试用例集一
        		AppTest.class,
        		//活动反馈接口测试用例集
        		ActivityFeedbackServiceTest.class
        		);
        
        if(result.wasSuccessful()) {
        	log.info("EUOP 自动测试通过");
        }else {
        	log.info("EUOP 测试不通过");
        	for (Failure failure : result.getFailures()) {
            	log.info(failure.toString());
            	log.info(failure.getMessage());
            }
        }
        
    }
}
