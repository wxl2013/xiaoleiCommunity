package com.java.xiaoleiCommunity.common;

import java.io.InputStream;
import java.util.Properties;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class ConfigUtil {

    private static Properties appProp = null;

    private static final String APP_PROP_PATH = "/config/app.properties";

    private static class Holder {
        static final ConfigUtil instance = new ConfigUtil();
    }

 //   private static Logger logger = LoggerFactory.getLogger(ConfigUtil.class);

    private ConfigUtil() {
    }

    static {
        try {
            appProp = new Properties();
            InputStream in = ConfigUtil.class.getResourceAsStream(APP_PROP_PATH);
            appProp.load(in);
 //           logger.info("Load Config Properties File " + APP_PROP_PATH + " Successful!");
        } catch (Exception e) {
  //          logger.error(e.getMessage(), e);
        }
    }

    public static ConfigUtil getInstance() {
        return Holder.instance;
    }

    public String getProperty(String key) {
        String value = null;
        if (appProp != null) {
            value = appProp.getProperty(key);
        }
        return value;
    }

    public void setProperty(String key, String value) {
        if (appProp != null) {
            appProp.setProperty(key, value);
        }
    }

}
