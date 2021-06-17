package com.stt.euopauto.iop;

import org.testng.annotations.Factory;
import static org.testng.ConversionUtils.wrapDataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.Arrays;
import java.util.Collection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runners.Parameterized.Parameters;

import com.stt.euopauto.utils.ConfUtil;
import com.stt.euopauto.utils.HttpUtil;

/**
 * 活动审核反馈接口
 * 使用 参数化测试，将所有省侧反馈接口保存到代码中
 * @author zhangjh
 *
 */
public class ActivityFeedbackServiceTest {
	@Factory
	public static Object[] factoryData() {
		return wrapDataProvider(ActivityFeedbackServiceTest.class, data());
	}
	public Logger log = LogManager.getLogger("mylog");
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
		String url=ConfUtil.getConfUtil("config/conf_channel.properties")
				.getConfChannelProperties()
				.getProperty(urlName);
		
		if(url.equals("")) {
			
			log.info(urlName + " is empty!");
			Assert.fail("url is null");
			
		}
		log.info(urlName + " is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if (jsonRes.equals(null)){
			Assert.fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}

	
	
}
