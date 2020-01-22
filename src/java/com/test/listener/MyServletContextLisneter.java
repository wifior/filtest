package com.test.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @ClassName MyLisneter
 * @Description
 * ServletContextListener 接口作用：监听 ServletContext 对象的生命周期，实际上就是监听 Web 应用的生命周期。
 *  ServletContextListener 接口主要有两个方法，一个在当Servlet 容器启动web应用时调用，另一个是在Servlet 容器终止web应用时调用。
 * @Author Think
 * @Date 2020/1/22 15:52
 * @Version 1.0
 **/
@WebListener
@Slf4j
public class MyServletContextLisneter implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("ServletContextListener的contextInitialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("ServletContextListener的contextDestroyed");
    }
}
