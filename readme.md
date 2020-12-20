## Spring Cloud 

### 项目介绍
```
个人的Spring Cloud练习项目，只是为了搭建一个架构，不涉及业务操作。
```

### 目录结构说明
```
├─spring-cloud----------------------------父项目，公共依赖
│  │
│  ├─eureka-one--------------------微服务注册中心1──┤
│  │                                               ├─两个eureka服务模仿高可用注册中心(两个方便启动,实际上一个就够了)
│  ├─eureka-two--------------------微服务注册中心2──┤
│  │
│  ├─save-config-----------------------微服务配置中心
│  │
│  ├─save-monitor-------------------------微服务监控中心
│  │
│  ├─save-gateway--------------------------微服务网关中心
│  │
│  ├─save-business
│  │  │
│  │  ├─save-business-data------------------数据服务中心
│  │  │
│  │  ├─save-business-mall------------------订单服务中心
│  │  │
│  │  ├─save-business-open------------------对接服务中心
│  │  │
│  │  ├─save-business-task------------------任务服务中心
│  │  │
│  │  └─save-business-user------------------用户服务中心
│  │
│  ├─save-api
│  │  │
│  │  ├─save-api-web------------------web服务API
│  │  │
│  │  ├─save-api-app------------------app服务API
│  │  │
│  │  └─save-api-auth------------------权限控制API
│  │
│  ├─save-common
│  │  │
│  │  ├─save-common-base------------------公共POJO基础包
│  │  │
│  │  ├─save-common-config------------------公共配置包
│  │  │
│  │  ├─save-common-core------------------微服务核心依赖包
│  │  │
│  │  ├─save-common-util------------------公共工具包
│  │  │
│  │  ├─save-common-zk------------------zookeeper配置
│  │  │
│  │  ├─save-security-core------------------安全服务核心包
│  │  │
│  │  └─save-security-feign------------------基于auth2的feign配置

### 端口分配
- eureka-one  : 1001
- eureka-two  : 2001
- config  : 3001
- zuul  : 4001
- controller-service1  : 5001
- controller-service2  : 6001

TODO:
1、Eureka加密后,高可用无法使用