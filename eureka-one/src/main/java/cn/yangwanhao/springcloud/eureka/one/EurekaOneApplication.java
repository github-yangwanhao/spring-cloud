package cn.yangwanhao.springcloud.eureka.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动类
 *
 * @author 杨万浩
 * @version V1.0.0
 * @since 2020/6/20 10:30
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaOneApplication.class, args);
    }

}
