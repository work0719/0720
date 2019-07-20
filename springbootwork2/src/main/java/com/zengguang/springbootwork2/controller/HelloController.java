package com.zengguang.springbootwork2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class HelloController {
    private final static Logger logger= LoggerFactory.getLogger(HelloController.class);
    @RequestMapping("/hello2")
    @ResponseBody
    public String hello(){
        logger.info("hi接口入");
        logger.debug("debug模式");
        logger.warn("warn模式");
        logger.error("error模式");
        logger.info("hi接口出");
        return "helloworld";
    }
    @RequestMapping( "/hello3")
    public String index(){
        logger.info("hi接口入");
        logger.debug("debug模式");
        logger.warn("warn模式");
        logger.error("error模式");
        logger.info("hi接口出");
        return "hi";
    }
}
