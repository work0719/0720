package com.example.demo022;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class Hello {
    private final static Logger LOGGER= LoggerFactory.getLogger(Hello.class);
    @RequestMapping(value="/hello",method= RequestMethod.GET)
    @ResponseBody
    //GetMapping(value="/hello")
    public String hello() {
        LOGGER.info("接口入");
        List<String> list=new ArrayList<>();
        LOGGER.debug("调试信息");
        try {
            String a=list.get(3);

        }catch(Exception e) {
            String b="tom";
            LOGGER.info("错误{},执行{}", e,b);
        }

        LOGGER.info("接口出");
        return "helloworld";
    }



    @GetMapping(value="/hi")
    public String hi() {
        LOGGER.info("接口进入");
        Map<String,Object> map=new HashMap<>();
        String x="";
        LOGGER.debug("调试信息");
        try {
            String a=(String) map.get(x);

        }catch(Exception e) {
            String b="tom";
            LOGGER.info("{},{}", e,b);
        }

        LOGGER.info("接口离开");
        return "hi";
    }
}
