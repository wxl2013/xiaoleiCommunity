package com.java.xiaoleiCommunity.common;

import java.io.Serializable;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextUtil implements Serializable {

    private static final long serialVersionUID = -7780002457319136576L;

 //   private static Logger logger = LoggerFactory.getLogger(ApplicationContextUtil.class);

    private static ApplicationContext context;

    static {
        try {
            context = new ClassPathXmlApplicationContext("spring/application.xml");
        } catch (Exception e) {
//            logger.error("init application context fail:" + e.getMessage(), e);
        }
    }

    public static ApplicationContext getApplicationContext() {
        return context;
    }
}
