package com.diamond.cloud.demo.product.web;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Aaron
 * @version 1.0.0
 * @ClassName EchoController.java
 * @Description TODO
 * @createTime 2020年05月06日 14:30:00
 */
@Slf4j
@RestController
public class EchoController {


    @Value("${message}")
    private String msg;

    /**
     * 打印消息
     * @param message
     * @return
     */
    @RequestMapping(value = "/echo/{message}",method = RequestMethod.GET)
    public String echo(@PathVariable String message){
        log.info("message="+message);
        return message;
    }

    /**
     * 读取配置消息
     * @return
     */
    @RequestMapping("/config")
    public String config(){
        return msg;
    }

}
