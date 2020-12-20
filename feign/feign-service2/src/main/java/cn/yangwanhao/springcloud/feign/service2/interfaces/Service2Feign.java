package cn.yangwanhao.springcloud.feign.service2.interfaces;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * Service1Feign
 *
 * @author yangwh@yunrong.cn
 * @version V3.0
 * @since 2020/7/26 21:00
 */
@FeignClient(value = "/service1/feign")
public interface Service2Feign {
}
