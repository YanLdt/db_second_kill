package com.yanl.server.controller;

import com.yanl.api.enums.StatusCode;
import com.yanl.api.response.BaseResponse;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: YanL
 * @Time: 17:16 2020/5/27
 * @Email: imyanl.dt@gmail.com
 * @Description: 基础控制器
 */
@Controller
@RequestMapping("base")
public class BaseController {
    public static final Logger log = LoggerFactory.getLogger(BaseController.class);

    /**
     * 页面跳转
     * @param name
     * @param modelMap
     * @return
     */
    @GetMapping("/welcome")
    public String welcome(String name, ModelMap modelMap){
        if(StringUtils.isBlank(name)){
            name = "你好啊";
        }
        modelMap.put("name", name);
        return "welcome";
    }

    /**
     * 异步请求返回后端的数据
     * @param name
     * @return
     */
    @RequestMapping(value = "/data", method = RequestMethod.GET)
    @ResponseBody
    public String data(String name){
        if(StringUtils.isBlank(name)){
            name="这是返回的名字";
        }
        return name;
    }

    @RequestMapping(value = "/response", method = RequestMethod.GET)
    @ResponseBody
    public BaseResponse response(String name){
        BaseResponse response = new BaseResponse(StatusCode.Success);
        if(StringUtils.isBlank(name)){
            name="这是返回的名字";
        }
        response.setData(name);
        return response;
    }

}
