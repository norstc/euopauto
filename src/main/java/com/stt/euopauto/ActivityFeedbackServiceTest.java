package com.stt.euopauto;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;

public class ActivityFeedbackServiceTest {
	public Logger log = Logger.getLogger(ActivityFeedbackServiceTest.class);
	
	@Test
	public void test_iop2100_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2100_activity_feedback_url");
		log.info("iop2100_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}

	

	@Test
	public void test_iop2200_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2200_activity_feedback_url");
		log.info("iop2200_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}


	@Test
	public void test_iop2210_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2210_activity_feedback_url");
		log.info("iop2210_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}


	@Test
	public void test_iop2220_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2220_activity_feedback_url");
		log.info("iop2220_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	@Test
	public void test_iop2230_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2230_activity_feedback_url");
		log.info("iop2230_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	
	@Test
	public void test_iop2240_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2240_activity_feedback_url");
		log.info("iop2240_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	@Test
	public void test_iop2250_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2250_activity_feedback_url");
		log.info("iop2250_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	@Test
	public void test_iop2270_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2270_activity_feedback_url");
		log.info("iop2270_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	@Test
	public void test_iop2280_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2280_activity_feedback_url");
		log.info("iop2280_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	@Test
	public void test_iop2290_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2290_activity_feedback_url");
		log.info("iop2290_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	@Test
	public void test_iop2311_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2311_activity_feedback_url");
		log.info("iop2311_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	@Test
	public void test_iop2351_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2351_activity_feedback_url");
		log.info("iop2351_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	@Test
	public void test_iop2371_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2371_activity_feedback_url");
		log.info("iop2371_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	@Test
	public void test_iop2431_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2431_activity_feedback_url");
		log.info("iop2431_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	@Test
	public void test_iop2451_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2451_activity_feedback_url");
		log.info("iop2451_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	@Test
	public void test_iop2471_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2471_activity_feedback_url");
		log.info("iop2471_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	@Test
	public void test_iop2531_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2531_activity_feedback_url");
		log.info("iop2531_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	@Test
	public void test_iop2551_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2551_activity_feedback_url");
		log.info("iop2551_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	@Test
	public void test_iop2571_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2571_activity_feedback_url");
		log.info("iop2571_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	@Test
	public void test_iop2591_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2591_activity_feedback_url");
		log.info("iop2591_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	@Test
	public void test_iop2731_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2731_activity_feedback_url");
		log.info("iop2731_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	@Test
	public void test_iop2771_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2771_activity_feedback_url");
		log.info("iop2771_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	@Test
	public void test_iop2791_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2791_activity_feedback_url");
		log.info("iop2791_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	@Test
	public void test_iop2851_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2851_activity_feedback_url");
		log.info("iop2851_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	@Test
	public void test_iop2871_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2871_activity_feedback_url");
		log.info("iop2871_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	@Test
	public void test_iop2891_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2891_activity_feedback_url");
		log.info("iop2891_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	@Test
	public void test_iop2898_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2898_activity_feedback_url");
		log.info("iop2898_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	@Test
	public void test_iop2931_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2931_activity_feedback_url");
		log.info("iop2931_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	@Test
	public void test_iop2951_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2951_activity_feedback_url");
		log.info("iop2951_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	@Test
	public void test_iop2971_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2971_activity_feedback_url");
		log.info("iop2971_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	@Test
	public void test_iop2991_activity_feedback_url() {
		String url=ConfUtil.getConfUtil()
				.getConfChannelProperties()
				.getProperty("iop2991_activity_feedback_url");
		log.info("iop2991_activity_feedback_url is : "+url);
		String requestLoad =""; 
		String jsonRes = HttpUtil.getJsonRes(url,requestLoad);
		if(url.equals("")) {
			fail("url is null");
			return;
		}
		if (jsonRes.equals(null)){
			fail("no response from target");
		}else {
			log.info("request load is : " + requestLoad);
			log.info("response is : " + jsonRes);
		}
		
	}
	
	
}
