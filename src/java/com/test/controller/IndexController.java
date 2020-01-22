package com.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author Think
 * @Date 2020/1/22 15:19
 * @Version 1.0
 **/
@Controller
@Slf4j
public class IndexController {

    @RequestMapping("/index")
    @ResponseBody
    public String index(HttpServletRequest httpServletRequest){
        log.info("进入了controller");
        HttpSession session = httpServletRequest.getSession();
        return "count : "+session.getServletContext().getAttribute("count");
    }
}
