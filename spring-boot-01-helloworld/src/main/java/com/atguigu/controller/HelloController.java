package com.atguigu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class HelloController {

    private final static Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        LOGGER.info("接口：hello,入");
        String name = "linlin";

        LOGGER.debug("接口,hello,调试");
        List<String> list = new ArrayList<String>();
        try{
            String myName = list.get(3);
        }catch (Exception e){
            String xiaoming = "xiaoming";
            LOGGER.error("接口:hello,错误信息：{},执行者:{}","哈哈",xiaoming);
        }

        LOGGER.info("接口:hello,出");
        return "Hello World!";
    }


    @GetMapping(value = "/hi")
    public String html(){
        return "hellolin";
    }
}






















