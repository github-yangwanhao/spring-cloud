package cn.yangwanhao.springcloud.controller.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ControllerService2Application {

    public static void main(String[] args) {
        SpringApplication.run(ControllerService2Application.class, args);
    }

}
