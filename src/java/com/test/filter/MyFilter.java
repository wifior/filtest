package com.test.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @ClassName MyFilter
 * @Description TODO
 * @Author Think
 * @Date 2020/1/22 15:11
 * @Version 1.0
 **/
@WebFilter(filterName = "MyFilter",urlPatterns = "/*")
@Slf4j
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        log.info("进入了dofilter");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("进入了filter的Init ");
    }

    @Override
    public void destroy() {
        log.info("进入了filter的destroy ");
    }
}
