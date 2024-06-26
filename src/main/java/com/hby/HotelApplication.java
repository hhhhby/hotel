package com.hby;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(exposeProxy = true)
@MapperScan("com.hby.mapper")
@SpringBootApplication
public class HotelApplication {

    // 启动之前务必在redis客户端提前写好以下命令：XGROUP CREATE stream.orders g1 0 MKSTREAM
    public static void main(String[] args) {
        SpringApplication.run(HotelApplication.class, args);
    }
}
