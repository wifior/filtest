package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @ClassName IndexApplication
 * @Description TODO
 * @Author Think
 * @Date 2020/1/22 15:09
 * @Version 1.0
 **/
@SpringBootApplication
@ServletComponentScan
public class IndexApplication {
    public static void main(String[] args) {
        SpringApplication.run(IndexApplication.class,args);
    }
}
