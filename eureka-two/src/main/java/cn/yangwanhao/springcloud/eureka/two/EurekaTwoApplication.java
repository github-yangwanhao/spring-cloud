package cn.yangwanhao.springcloud.eureka.two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动类
 *
 * @author 杨万浩
 * @version V1.0.0
 * @since 2020/6/20 11:03
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaTwoApplication.class, args);
    }

}
