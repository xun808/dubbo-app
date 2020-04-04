# spring boot整合dubbo快速入门.
通过spring boot + dubbo构建最基础的dubbo程序,了解dubbo的运行机制以及dubbo项目结构

# 准备
1.开发环境:jdk8,idea,springBoot
2.项目结构:服务提供者 + 服务消费者 + API层
3.项目工厂:dubbo-interface , dubbo-provider,dubbo-web


工程结构及说明:

#### 工程名称 | 说明
- | -
dubbo-interface | 程序接口层: 1.实体类  2.业务接口  
dubbo-provider | 服务提供者:  需要引用接口层,并实现接口方法, 配置为dubbo服务;  然后将服务对外暴露(也就是将服务注册到注册中心,使用zookeeper作为注册中心),供服务消费者使用
dubbo-web | 服务消费者:  应用接口层,配置注册中心,通过注册中心来使用接口的服务实现业务逻辑

