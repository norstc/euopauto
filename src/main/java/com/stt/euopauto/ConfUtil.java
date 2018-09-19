package com.stt.euopauto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

public class ConfUtil {
	public static Logger log = Logger.getLogger(ConfUtil.class);
	private Properties confChannelProperties;
	private static ConfUtil confUtil = null;

	public Properties getConfChannelProperties() {
		return confChannelProperties;
	}
	//lazy  load singleton pattern
	public static ConfUtil getConfUtil() {
		if(confUtil == null) {
			return new ConfUtil();
		}else {
			return confUtil;
		}
	}
	private ConfUtil(){
		String confChannelPropertiesFilepath ="config/conf_channel.properties";
		confChannelProperties = new Properties();
		try {
			InputStream conf_channel_properties_filepath = new FileInputStream(confChannelPropertiesFilepath);
			confChannelProperties.load(conf_channel_properties_filepath);
			conf_channel_properties_filepath.close();
		}catch (FileNotFoundException f) {
			log.info(f.getStackTrace());
			
		}catch(IOException i) {
			log.info(i.getStackTrace());
			
		}
	}
	public static void main(String[] args) {
		log.info("test conf");
	}
}
