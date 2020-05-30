package com.yanl.server.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: YanL
 * @Time: 23:56 2020/5/30
 * @Email: imyanl.dt@gmail.com
 * @Description: 待秒杀商品
 */

@Controller
public class ItemController {

    /**
     * 类的日志
     */
    private static final Logger log = LoggerFactory.getLogger(ItemController.class);

    /**
     * 请求前缀
     */
    private static final String prefix = "item";

    /**
     * 获取商品列表
     * @return
     */
    @RequestMapping(value = {"/", "/index", prefix + "/list", prefix + "/index.html"}, method = RequestMethod.GET)
    public String list(){
        try {
            //获取待秒杀商品列表


        }catch (Exception e){
            log.error("获取商品列表失败", e.fillInStackTrace());
            return "redirect:/error";
        }
        return "list";
    }


}
