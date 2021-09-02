package com.baqw.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 如何使用Nacos作为配置中心统一配置管理
 * 1、引入依赖
 * 2、创建一个bootstrap.properties配置文件
 *    添加这两个属性：1）spring.application.name=gulimall-coupon
 *                 2）spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 * 3、在Nacos配置中心页面添加一个 "当前模块名.properties" 的配置文件   配置文件添加配置
 * 4、动态获取配置
 *    @RefreshScope 动态刷新配置  添加到类属性上面
 *    @Value(${xxx.xxx}) 获取配置 添加的字段属性上
 * 5、注意  配置中心优先级大于application.properties 优先加载配置中心的
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
