package com.qf.vo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MyTest {
    public static final Logger logger = LoggerFactory.getLogger(MyTest.class);

    public static void main(String[] args) {
        logger.info("slf4j for info");
        logger.debug("slf4j for debug");
        logger.error("slf4j for error");
        logger.warn("slf4j for warn");
        String message="Hello slf4j";
        logger.info("slf4j message : {}",message);
    }
}
