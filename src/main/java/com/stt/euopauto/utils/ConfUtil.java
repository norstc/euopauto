package com.stt.euopauto.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConfUtil {
	public static Logger log = LogManager.getLogger(ConfUtil.class);
	private Properties properties;
	private static ConfUtil confUtil = null;

	public Properties getConfChannelProperties() {
		return properties;
	}
	//lazy  load singleton pattern
	public static ConfUtil getConfUtil(String config_file) {
		if(confUtil == null) {
			return new ConfUtil(config_file);
		}else {
			return confUtil;
		}
	}
	private ConfUtil(String config_file){
		String config_file_path =config_file;//"config/conf_channel.properties";
		properties = new Properties();
		try {
			InputStream config_is = new FileInputStream(config_file_path);
			properties.load(config_is);
			config_is.close();
		}catch (FileNotFoundException f) {
			log.info(f.getStackTrace());
			
		}catch(IOException i) {
			log.info(i.getStackTrace());
			
		}
	}
	public static void main(String[] args) {
		log.info("test conf");
		String url = ConfUtil.getConfUtil("config/conf_channel.properties").getConfChannelProperties().getProperty("channel_2571001_opPostitionQuery_url");
		log.info("channel_2571001_opPostitionQuery_url  is "+ url);
	}
}
