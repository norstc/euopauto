package com.stt.euopauto.channels;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;

import com.stt.euopauto.utils.HttpUtil;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;



public class QueryIopActivityTest {
	public static Logger log = LogManager.getLogger("mylog");
	
	@Test
	public void test_query_iop_activity_from_01705161003_http() {
		//一级iop实时查询接口
		log.info("一级iop实时查询接口");
		String url = "http://192.168.1.123:4100/api/channel/queryIOPActivity";
		// String urlHttps = "https://euop.sh-stt.com:8098/api/channel/queryIOPActivity";
		log.info("query_new_iop_url  is "+ url);
		String requestData = "{\"interfaceName\":\"iopL1ActivityQuery\",\"data\":{\"iopOperationPositionId\":\"017051614065\",\"provId\":\"000\",\"servNum\":\"18853486000\",\"iopChannelId\":\"01705161003\"},\"header\":{\"timestamp\":\"1540545125\",\"conversationId\":\"1540545125485a0\",\"digest\":\"NjhhMWJhN2Y3NTIzMTcxZDZjN2UxMTAyMTVlOTI2N2E=\",\"version\":\"1.0\"}}";
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
	public void test_query_iop_activity_from_01705161003_https() {
		//一级iop实时查询接口
		log.info("一级iop实时查询接口");
		// String url = "http://192.168.1.123:4100/api/channel/queryIOPActivity";
		String urlHttps = "https://euop.sh-stt.com:8098/api/channel/queryIOPActivity";
		log.info("query_new_iop_url  is "+ urlHttps);
		String requestData = "{\"interfaceName\":\"iopL1ActivityQuery\",\"data\":{\"iopOperationPositionId\":\"017051614065\",\"provId\":\"000\",\"servNum\":\"18853486000\",\"iopChannelId\":\"01705161003\"},\"header\":{\"timestamp\":\"1540545125\",\"conversationId\":\"1540545125485a0\",\"digest\":\"NjhhMWJhN2Y3NTIzMTcxZDZjN2UxMTAyMTVlOTI2N2E=\",\"version\":\"1.0\"}}";
		String responseData =HttpUtil.getJsonRes(urlHttps,requestData);
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
		String url = "http://192.168.1.123:4100/api/channel/queryProvinceIOPActivity";
		log.info("query_new_iop_url  is "+ url);
		String requestData = "{\"interfaceName\":\"iopL2ActivityQuery\",\"data\":{\"iopOperationPositionId\":\"0170516112582\",\"provId\":\"290\",\"servNum\":\"13669229162\",\"iopChannelId\":\"1000003\"},\"header\":{\"timestamp\":\"1540545125\",\"conversationId\":\"1540545125485a0\",\"digest\":\"NjhhMWJhN2Y3NTIzMTcxZDZjN2UxMTAyMTVlOTI2N2E=\",\"version\":\"1.0\"}}";
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
		String url = "http://192.168.1.123:4100/api/channel/straightQueryIOPActivity";
		log.info("query_new_iop_url  is "+ url);
		String requestData = "{\"interfaceName\":\"iopL0ActivityQuery\",\"header\":{\"version\":\"1.0\",\"timestamp\":\"1567578264704\",\"digest\":\"YmYzNDA1ZWVlM2RkN2M1YmY0ZGNmNjg4YWE0NTc3M2Y=\",\"conversationId\":\"1567578264704687757\"},\"data\":{\"servNum\":\"15213024302\",\"provId\":000,\"iopChannelId\":\"01710871075\",\"iopOperationPositionId\":\"0171087112592\"}}";
		String responseData =HttpUtil.getJsonRes(url,requestData);
		log.info("responseData is : " + responseData);
		JSONObject jsonValue = (JSONObject)JSONValue.parse(responseData);
		
		log.info("result is : " + jsonValue.get("result"));
		JSONObject resultValue = (JSONObject)(jsonValue.get("result"));
		log.info("responseCode is " + resultValue.get("responseCode"));
		//查询成功，responseCode是 0000
		// 没有活动，返回 0001
		assertEquals("0001",resultValue.get("responseCode"));
	}
	
	@Test
	public void test_straight_query_iop_2931_activity_from_01705161003() {
		//直通iop实时查询接口-省2931
		log.info("直通iop实时查询接口-省2931");
		String url = "http://192.168.1.123:4100/api/channel/straightQueryIOPActivity";
		log.info("query_new_iop_url  is "+ url);
		String requestData = "{\"interfaceName\":\"iopL0ActivityQuery\",\"header\":{\"version\":\"1.0\",\"timestamp\":\"1567578264704\",\"digest\":\"YmYzNDA1ZWVlM2RkN2M1YmY0ZGNmNjg4YWE0NTc3M2Y=\",\"conversationId\":\"1567578264704687757\"},\"data\":{\"servNum\":\"15213024302\",\"provId\":000,\"iopChannelId\":\"01710871075\",\"iopOperationPositionId\":\"0171087112592\"}}";
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
		String url = "http://192.168.1.123:4100/api/channel/batchQueryIOPActivity";
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
		String url = "http://192.168.1.123:4100/api/channel/batchQueryProvinceIOPActivity";
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
		String url = "http://192.168.1.123:4100/api/channel/straightBatchQueryIOPActivityV2";
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
		String url = "http://192.168.1.123:4100/api/channel/straightBatchQueryIOPActivityV2";
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
