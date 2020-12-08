package com.stt.euopauto;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * 活动审核反馈接口
 * 使用Junit 参数化测试，将所有省侧反馈接口保存到代码中
 * @author zhangjh
 *
 */
@RunWith(Parameterized.class)
public class ActivityFeedbackServiceTest {
	public Logger log = LogManager.getLogger(ActivityFeedbackServiceTest.class);
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{"iop2100_activity_feedback_url",""},
			{"iop2200_activity_feedback_url",""},
			{"iop2210_activity_feedback_url","http://211.136.164.120:20110/oppf?appId=501096&method=IOP-R50001&version=vsersion1.1.3&timestamp=20180531174324"},
			{"iop2220_activity_feedback_url",""},
			{"iop2230_activity_feedback_url",""},
			{"iop2240_activity_feedback_url",""},
			{"iop2250_activity_feedback_url",""},
			{"iop2270_activity_feedback_url",""},
			{"iop2280_activity_feedback_url",""},
			{"iop2290_activity_feedback_url",""},
			{"iop2311_activity_feedback_url",""},
			{"iop2351_activity_feedback_url",""},
			{"iop2371_activity_feedback_url",""},
			{"iop2431_activity_feedback_url",""},
			{"iop2451_activity_feedback_url",""},
			{"iop2471_activity_feedback_url",""},
			{"iop2531_activity_feedback_url",""},
			{"iop2551_activity_feedback_url",""},
			{"iop2571_activity_feedback_url",""},
			{"iop2591_activity_feedback_url",""},
			{"iop2731_activity_feedback_url",""},
			{"iop2771_activity_feedback_url",""},
			{"iop2791_activity_feedback_url",""},
			{"iop2851_activity_feedback_url",""},
			{"iop2871_activity_feedback_url","http://123.59.26.108/subitemReviewFeedBack/reviewFeedBack"},
			{"iop2891_activity_feedback_url",""},
			{"iop2898_activity_feedback_url",""},
			{"iop2931_activity_feedback_url",""},
			{"iop2951_activity_feedback_url",""},
			{"iop2971_activity_feedback_url",""},
			{"iop2991_activity_feedback_url",""}
			
		});
	}
	private String urlName;
	private String urlAddress;
	public ActivityFeedbackServiceTest(String urlName, String urlAddress) {
		this.urlName = urlName;
		this.urlAddress = urlAddress;
	}
	@Test
	public void test_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty(urlName);
		
		if(url.equals("")) {
			
			log.info(urlName + " is empty!");
			fail("url is null");
			
		}
		log.info(urlName + " is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}

	
	
}
