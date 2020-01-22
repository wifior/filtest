package com.test.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @ClassName MyLisneter
 * @Description TODO
 * @Author Think
 * @Date 2020/1/22 15:57
 * @Version 1.0
 **/
@WebListener
@Slf4j
public class MyHttpSessionLisneter implements HttpSessionListener {

    static  int count = 0 ;
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        count++;
        se.getSession().getServletContext().setAttribute("count",count);
        log.info("HttpSessionListener的sessionCreated,count:"+count);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        log.info("HttpSessionListener的sessionDestroyed");
    }
}
