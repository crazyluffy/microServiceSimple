# microServiceSimple
微服务基本模型

spring cloud 技术体系：

|         | 第一代                          | 第二代                                |
|---------|------------------------------|------------------------------------|
| 服务发现    | eureka                       | nacos                              |
| 客户端辅助均衡 | ribbon                       | dubbo LB、spring cloud load balance |
| 熔断器     | hystrix                      | Alibaba sentinel                   |
| 网关      | zuul                         | spring cloud gateway               |
| 配置中心    | spring cloud config          | nacos、Apollo                       |
| 服务调用    | feign                        | dubbo rpc                          |
| 消息驱动    | spring cloud stream          |                                    |
| 链路追踪    | spring cloud sleuth / zipkin |                                    |
|         |                              | Alibaba seata 分布式事务方案              |
