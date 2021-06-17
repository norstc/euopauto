package com.stt.euopauto.channels;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;

import com.stt.euopauto.utils.HttpUtil;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.testng.annotations.Test;


public class QueryIopActivityTest {
	public static Logger log = LogManager.getLogger("mylog");
	
	@Test
	public void test_query_iop_activity_from_01705161003() {
		//一级iop实时查询接口
		log.info("一级iop实时查询接口");
		String url = "http://180.169.129.52:8098/api/channel/queryIOPActivity";
		log.info("query_new_iop_url  is "+ url);
		String requestData = "{\"interfaceName\":\"iopL1ActivityQuery\",\"data\":{\"iopOperationPositionId\":\"017051618201\",\"provId\":\"210\",\"servNum\":\"13427535800\",\"iopChannelId\":\"01705161003\"},\"header\":{\"timestamp\":\"1540545125\",\"conversationId\":\"1540545125485a0\",\"digest\":\"NjhhMWJhN2Y3NTIzMTcxZDZjN2UxMTAyMTVlOTI2N2E=\",\"version\":\"1.0\"}}";
		String responseData =HttpUtil.getJsonRes(url,requestData);
		log.info("responseData is : " + responseData);
		JSONObject jsonValue = (JSONObject)JSONValue.parse(responseData);
		
		log.info("result is : " + jsonValue.get("result"));
		JSONObject resultValue = (JSONObject)(jsonValue.get("result"));
		log.info("responseCode is " + resultValue.get("responseCode"));
		//查询成功，responseCode是 0000
		assertEquals("0000",resultValue.get("responseCode"));
	}
	
	@Test
	public void test_query_province_iop_activity_from_01705161003() {
		//省iop实时查询接口
		log.info("省iop实时查询接口");
		String url = "http://180.169.129.52:8098/api/channel/queryProvinceIOPActivity";
		log.info("query_new_iop_url  is "+ url);
		String requestData = "";
		String responseData =HttpUtil.getJsonRes(url,requestData);
		log.info("responseData is : " + responseData);
		JSONObject jsonValue = (JSONObject)JSONValue.parse(responseData);
		
		log.info("result is : " + jsonValue.get("result"));
		JSONObject resultValue = (JSONObject)(jsonValue.get("result"));
		log.info("responseCode is " + resultValue.get("responseCode"));
		//查询成功，responseCode是 0000
		assertEquals("0000",resultValue.get("responseCode"));
	}
	
	@Test
	public void test_straight_query_iop_1001_activity_from_01705161003() {
		//直通iop实时查询接口-一级
		log.info("直通iop实时查询接口-一级");
		String url = "http://180.169.129.52:8098/api/channel/straightQueryIOPActivity";
		log.info("query_new_iop_url  is "+ url);
		String requestData = "";
		String responseData =HttpUtil.getJsonRes(url,requestData);
		log.info("responseData is : " + responseData);
		JSONObject jsonValue = (JSONObject)JSONValue.parse(responseData);
		
		log.info("result is : " + jsonValue.get("result"));
		JSONObject resultValue = (JSONObject)(jsonValue.get("result"));
		log.info("responseCode is " + resultValue.get("responseCode"));
		//查询成功，responseCode是 0000
		assertEquals("0000",resultValue.get("responseCode"));
	}
	
	@Test
	public void test_straight_query_iop_2931_activity_from_01705161003() {
		//直通iop实时查询接口-省2931
		log.info("直通iop实时查询接口-省2931");
		String url = "http://180.169.129.52:8098/api/channel/straightQueryIOPActivity";
		log.info("query_new_iop_url  is "+ url);
		String requestData = "";
		String responseData =HttpUtil.getJsonRes(url,requestData);
		log.info("responseData is : " + responseData);
		JSONObject jsonValue = (JSONObject)JSONValue.parse(responseData);
		
		log.info("result is : " + jsonValue.get("result"));
		JSONObject resultValue = (JSONObject)(jsonValue.get("result"));
		log.info("responseCode is " + resultValue.get("responseCode"));
		//查询成功，responseCode是 0000
		assertEquals("0000",resultValue.get("responseCode"));
	}
	
	@Test
	public void test_batch_query_iop_1001_activity_from_01705161003() {
		//一级IOP批量实时查询接口
		log.info("一级IOP批量实时查询接口");
		String url = "http://180.169.129.52:8098/api/channel/batchQueryIOPActivity";
		log.info("query_new_iop_url  is "+ url);
		String requestData = "";
		String responseData =HttpUtil.getJsonRes(url,requestData);
		log.info("responseData is : " + responseData);
		JSONObject jsonValue = (JSONObject)JSONValue.parse(responseData);
		
		log.info("result is : " + jsonValue.get("result"));
		JSONObject resultValue = (JSONObject)(jsonValue.get("result"));
		log.info("responseCode is " + resultValue.get("responseCode"));
		//查询成功，responseCode是 0000
		assertEquals("0000",resultValue.get("responseCode"));
	}
	
	@Test
	public void test_batch_query_province_iop_2290_activity_from_01705161003() {
		//省IOP批量实时查询接口-陕西-2290
		log.info("省IOP批量实时查询接口-陕西-2290");
		String url = "http://180.169.129.52:8098/api/channel/batchQueryProvinceIOPActivity";
		log.info("query_new_iop_url  is "+ url);
		String requestData = "";
		String responseData =HttpUtil.getJsonRes(url,requestData);
		log.info("responseData is : " + responseData);
		JSONObject jsonValue = (JSONObject)JSONValue.parse(responseData);
		
		log.info("result is : " + jsonValue.get("result"));
		JSONObject resultValue = (JSONObject)(jsonValue.get("result"));
		log.info("responseCode is " + resultValue.get("responseCode"));
		//查询成功，responseCode是 0000
		assertEquals("0000",resultValue.get("responseCode"));
	}
	
	@Test
	public void test_straight_batch_query_iop_1001_activity_from_01705161003() {
		//直通IOP批量查询接口-一级iop
		log.info("直通IOP批量查询接口-一级iop");
		String url = "http://180.169.129.52:8098/api/channel/straightBatchQueryIOPActivityV2";
		log.info("query_new_iop_url  is "+ url);
		String requestData = "";
		String responseData =HttpUtil.getJsonRes(url,requestData);
		log.info("responseData is : " + responseData);
		JSONObject jsonValue = (JSONObject)JSONValue.parse(responseData);
		
		log.info("result is : " + jsonValue.get("result"));
		JSONObject resultValue = (JSONObject)(jsonValue.get("result"));
		log.info("responseCode is " + resultValue.get("responseCode"));
		//查询成功，responseCode是 0000
		assertEquals("0000",resultValue.get("responseCode"));
	}
	
	@Test
	public void test_straight_batch_query_iop_2290_activity_from_01705161003() {
		//直通IOP批量查询接口-省iop-陕西2290
		log.info("直通IOP批量查询接口-省iop-陕西2290");
		String url = "http://180.169.129.52:8098/api/channel/straightBatchQueryIOPActivityV2";
		log.info("query_new_iop_url  is "+ url);
		String requestData = "";
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
