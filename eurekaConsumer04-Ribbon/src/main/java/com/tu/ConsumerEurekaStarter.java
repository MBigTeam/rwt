package com.tu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient("eurekaclient-provider")
public class ConsumerEurekaStarter {

    public static void main(String[] args){
        SpringApplication.run(ConsumerEurekaStarter.class,args);

        //大家好
        //我是张家辉
        //贪玩蓝月
        //这是你没有玩过的全新版本
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
