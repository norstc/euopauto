package com.stt.euopauto;

import static org.junit.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.junit.Test;

public class PodServicesTest {
	public static Logger log = LogManager.getLogger("mylog");
	
	@Test
	public void pod_49_1_batch_query_iop_activity_from_01705161003() {
		// 从38.1 向 49.1 发起查询请求
		log.info("从38.1 向 49.1 发起一级IOP批量查询请求");
		String url = "http://10.24.49.1:8480/api/channel/batchQueryIOPActivity";
		log.info("query_new_iop_url  is "+ url);
		String requestData = "{\"interfaceName\":\"iopL4ActivityQuery\",\"header\":{\"version\":\"1.0\",\"timestamp\":1579056356804,\"digest\":\"ZjBmM2U1ZDA2ZTAzMWNkOTJiZjA4NmRiMzY0MmZkM2M=\",\"conversationId\":\"20201009175629865006347\"},\"data\":{\"iopChannelId\":\"01705161003\",\"iopOperationPositionIds\":[\"017051616425\",\"017051616457\"],\"servNum\":\"15967123616\"}}";
		String responseData =HttpUtil.getJsonRes(url,requestData);
		log.info("responseData is : " + responseData);
		JSONObject jsonValue = (JSONObject)JSONValue.parse(responseData);
		
		log.info("result is : " + jsonValue.get("result"));
		JSONObject resultValue = (JSONObject)(jsonValue.get("result"));
		log.info("responseCode is " + resultValue.get("responseCode"));
		//查询成功，responseCode是 0002，部分位置有活动
		assertEquals("0002",resultValue.get("responseCode"));
	}
}
