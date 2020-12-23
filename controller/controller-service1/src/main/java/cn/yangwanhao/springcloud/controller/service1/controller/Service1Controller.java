package cn.yangwanhao.springcloud.controller.service1.controller;

import org.springframework.web.bind.annotation.RestController;

import cn.yangwanhao.base.common.support.ResponseMessage;
import cn.yangwanhao.springcloud.feign.service1.interfaces.Service1Feign;
import cn.yangwanhao.springcloud.feign.service1.vo.Service1Vo;

/**
 * @author 杨万浩
 * @version V1.0
 * @since 2020/12/21 20:04
 */
@RestController
public class Service1Controller implements Service1Feign {

    @Override
    public ResponseMessage<Service1Vo> getVo(String name) {
        System.out.println(name);
        Service1Vo vo = new Service1Vo(name);
        System.out.println(vo);
        return ResponseMessage.handleResult(vo);
    }
}
