package com.baqw.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、整合mybatis-plus
 *      1）倒入依赖
 *      <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.3.1</version>
 *      </dependency>
 *      2）配置
 *          1、配置数据源
 *              1) 倒入数据库驱动
 *              2）配置application.yml
 *          2、配置mybatis-plus
 *              1) 使用@MapperScan
 *              2）告诉mbp sql的映射文件在哪
 */
@MapperScan("com.baqw.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
