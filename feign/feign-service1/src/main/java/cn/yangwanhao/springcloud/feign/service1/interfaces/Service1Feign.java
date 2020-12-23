package cn.yangwanhao.springcloud.feign.service1.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.yangwanhao.base.common.support.ResponseMessage;
import cn.yangwanhao.springcloud.feign.service1.hystrix.Service1Hystrix;
import cn.yangwanhao.springcloud.feign.service1.vo.Service1Vo;

/**
 * Service1Feign
 *
 * @author yangwh@yunrong.cn
 * @version V3.0
 * @since 2020/7/26 21:00
 */
@FeignClient(name = "service1", fallback = Service1Hystrix.class)
@RequestMapping("/feign/service1")
public interface Service1Feign {

    @GetMapping("/get")
    ResponseMessage<Service1Vo> getVo(String name);

}
