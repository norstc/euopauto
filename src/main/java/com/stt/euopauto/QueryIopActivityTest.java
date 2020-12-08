package com.stt.euopauto;

import static org.junit.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.junit.Test;

public class QueryIopActivityTest {
	public static Logger log = LogManager.getLogger("mylog");
	
	@Test
	public void test_query_iop_activity_from_01705161003() {
		log.info("test query iop activity from 08 started");
		String url = "http://192.168.1.103:8080/wwwApp-web/iopService/batchQueryIOPActivity.do";
		log.info("query_new_iop_url  is "+ url);
		String requestData = "{\"interfaceName\":\"iopL4ActivityQuery\",\"header\":{\"version\":\"1.0\",\"timestamp\":\"1540545125\",\"digest\":\"NjhhMWJhN2Y3NTIzMTcxZDZjN2UxMTAyMTVlOTI2N2E=\",\"conversationId\":\"20200917175629865006347\"},\"data\":{\"iopChannelId\":\"01705161003\",\"iopOperationPositionIds\":[\"017051613257\",\"017051614065\"],\"servNum\":\"15862032301\"}}";
		String responseData =HttpUtil.getJsonRes(url,requestData);
		log.info("responseData is : " + responseData);
		JSONObject jsonValue = (JSONObject)JSONValue.parse(responseData);
		
		log.info("result is : " + jsonValue.get("result"));
		JSONObject resultValue = (JSONObject)(jsonValue.get("result"));
		log.info("responseCode is " + resultValue.get("responseCode"));
		//查询成功，responseCode是 0000
		assertEquals("0000",resultValue.get("responseCode"));
	}
}
