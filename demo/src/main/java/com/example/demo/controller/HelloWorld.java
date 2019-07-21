package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloWorld {
    private final static Logger LOGGER= LoggerFactory.getLogger(HelloWorld.class);
    @RequestMapping("/hello")
    @ResponseBody
    public String Hello(){
        LOGGER.info("接口：hello,入");

        LOGGER.debug("接口：hello，调试");
        String name="HelloWorld";
        List<String>list=new ArrayList();
        try {
            String myName=list.get(3);
        }catch (Exception x){
            String xiaoming="xiaoming";
            List<String> list1=new ArrayList();
            LOGGER.error("接口：hello,错误信息{}，执行者:{}",x,xiaoming);
        }
        LOGGER.info("接口：hello,出");
        return name;
    }
    @RequestMapping("/hi")
    public String Hi(){
        LOGGER.info("接口：hi,入");

        LOGGER.debug("接口：hi，调试");
        System.out.println("fff");


        LOGGER.info("接口：hello,出");
        return "hi";

    }

}
