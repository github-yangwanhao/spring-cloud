package cn.yangwanhao.springcloud.feign.service1.hystrix;

import cn.yangwanhao.base.common.support.ResponseMessage;
import cn.yangwanhao.springcloud.feign.service1.interfaces.Service1Feign;
import cn.yangwanhao.springcloud.feign.service1.vo.Service1Vo;

/**
 * @author 杨万浩
 * @version V1.0
 * @since 2020/12/21 20:00
 */
public class Service1Hystrix implements Service1Feign {

    @Override
    public ResponseMessage<Service1Vo> getVo(String name) {
        return ResponseMessage.error();
    }
}
