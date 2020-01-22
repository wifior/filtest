package com.test.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @ClassName MyLisneter
 * @Description TODO
 * @Author Think
 * @Date 2020/1/22 15:58
 * @Version 1.0
 **/
@WebListener
@Slf4j
public class MyServletRequestLisneter implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        log.info("ServletRequestLisneter的requestDestroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        log.info("ServletRequestLisneter的requestInitialized");
    }
}
