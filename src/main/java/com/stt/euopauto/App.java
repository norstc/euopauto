package com.stt.euopauto;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.TestNG;
import org.testng.xml.Parser;
import org.testng.xml.XmlSuite;



/**
 * EUOP 自动测试程序入口
 *
 */
public class App 
{
	public static Logger log = LogManager.getLogger("mylog");
    public static void main( String[] args )
    {
    	System.out.println("hello euop tester");
        log.info( "EUOP 自动测试开始" );
        //使用testng xml运行测试用例集
        String xmlFileName = "testng.xml";
        List<XmlSuite> suite;
        TestNG testNG = new TestNG();
        try {
        	suite = (List <XmlSuite>)(new Parser(xmlFileName).parse());
        	
            testNG.setXmlSuites(suite);
            
        }catch (Exception e) {
        	e.printStackTrace();
        }
        
        testNG.run();
        
    }
}
