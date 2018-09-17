package com.guoguo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author shu.fangjian
 * @since 1.0
 */
@SpringBootApplication
@MapperScan(basePackages = "com.guoguo.dao", markerInterface = org.hswebframework.web.dao.Dao.class)
public class MiniBackApplication {
    public static void main(String[] args) {
        SpringApplication.run(MiniBackApplication.class,args);
    }
}
