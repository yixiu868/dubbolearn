# dubbo

## dubbo配置文件

### 配置来源

从Dubbo支持配置来源来说，默认有四种配置来源：

* JVM -D参数；
* 外部化配置，Spring的xml文件，Spring Boot的properties文件；
* ServiceConfig、ReferenceConfig等编程接口配置；
* 本地配置文件dubbo.properties

优先级

![configuration](img\configuration.jpg)

## 常用注解

* @Import注解是引入带有@Configuration的java类，类似于spring配置文件里的import标签，将多个配置文件导入到一个主配置文件里
* @ImportResource是引入spring配置文件.xml，管理配置的bean
* @PropertySource注解将properties配置文件中的值存储到Spring的 Environment中，Environment接口提供方法去读取配置文件中的值，参数是properties文件中定义的key值
* @ConfigurationProperties是Spring Boot的注解，用来批量加载配置文件

## 负载均衡

### 随机（默认）

![20210820233439](img\20210820233439.png)

### 轮询

![20210820233711](img\20210820233711.png)

### 最少活跃数

总是挑响应速度最快的

![20210820234004](img\20210820234004.png)

### 一致性哈希

![20210820234158](img\20210820234158.png)

## 服务降级

