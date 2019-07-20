package com.taiji.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    private final static Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
    @RequestMapping(method = RequestMethod.GET,value = "/hello")

    @ResponseBody
    public String HelloWord(){
        LOGGER.info("接口：hello,入");
        String name="欢迎";
        LOGGER.debug("接口：hello,调试");

        List<String> list=new ArrayList<>();

        try {
            String myname=list.get(3);
        }catch (Exception x){
            String xiaoming="xiaoming";
            LOGGER.error("接口：hello,错误信息：{}，执行者：{}，x,xiaoming");
        }
        LOGGER.info("接口：hello,出");
        return name;


    }
    @RequestMapping(value = "/hi")
    public String Hi(){
        return "hi";
    }
}
