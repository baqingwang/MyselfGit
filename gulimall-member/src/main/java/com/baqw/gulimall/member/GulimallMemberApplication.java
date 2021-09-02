package com.baqw.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 1、想要远程调用别的服务
 *  1）引入open-feign包还有loadbalance
 *  2）编写一个接口，告诉springcloud这个接口
 *      1)声明接口的每一个方法都是调用哪个远程服务的请求的方法
 *  3）开启远程调用方法@EnableFeignClients(basePackages = "com.baqw.gulimall.member.feign")
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.baqw.gulimall.member.feign")
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
