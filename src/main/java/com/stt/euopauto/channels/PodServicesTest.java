package com.stt.euopauto.channels;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;

import com.stt.euopauto.utils.HttpUtil;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.testng.annotations.Test;


public class PodServicesTest {
	public static Logger log = LogManager.getLogger("mylog");
	
	@Test
	public void batch_query_iop_activity_from_01705161003() {
		log.info("一级IOP批量查询请求");
		String url = "http://180.169.129.52:8098/api/channel/batchQueryIOPActivity";
		log.info("query_new_iop_url  is "+ url);
		String requestData = "{\"interfaceName\":\"iopL4ActivityQuery\",\"header\":{\"version\":\"1.0\",\"timestamp\":1579056356804,\"digest\":\"ZjBmM2U1ZDA2ZTAzMWNkOTJiZjA4NmRiMzY0MmZkM2M=\",\"conversationId\":\"20201009175629865006347\"},\"data\":{\"iopChannelId\":\"01705161003\",\"iopOperationPositionIds\":[\"017051616425\",\"017051616457\"],\"servNum\":\"15967123616\"}}";
		String responseData =HttpUtil.getJsonRes(url,requestData);
		log.info("responseData is : " + responseData);
		JSONObject jsonValue = (JSONObject)JSONValue.parse(responseData);
		
		log.info("result is : " + jsonValue.get("result"));
		JSONObject resultValue = (JSONObject)(jsonValue.get("result"));
		log.info("responseCode is " + resultValue.get("responseCode"));
		//查询成功，responseCode是 0002，部分位置有活动
		assertEquals("0001",resultValue.get("responseCode"));
	}
}
