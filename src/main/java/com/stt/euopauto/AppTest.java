package com.stt.euopauto;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.SkipException;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
    }

    /**
     * Rigourous Test :-) 测试肯定通过
     */
    @Test
	public void testApp()
    {
        AssertJUnit.assertTrue( true );
    }
    
   //测试失败
    @Test
	public void testFailure()
    {
    	AssertJUnit.assertTrue(false);
    }
    
    //依赖某个测试
    @Test(dependsOnMethods = {"testApp"})
    public void testDependOnOthers() {
    	AssertJUnit.assertTrue(true);
    }
    
    //直接跳过测试
    @Test(enabled=false)
    public void testSkipped() {
    	System.out.println("this test will not execute");
    }
    
    //执行测试后，在某个条件下标识为跳过测试
    @Test
    public void testSkippedInMethod() {
    	System.out.println("this test will be skipped after some thing");
    	throw new SkipException("Skipping this test");
    }
}
