# initializr-gradle-start
## Spring Boot的配置详解

###Spring Boot的自动配置
按照"约定大于配置"的原则,Spring Boot通过扫描依赖关系来使用类路径中可用的库,对于每个pom文件中的
"Spring-boot-starter-`*`"依赖,Spring Booth会执行默认的AutoConfiguration类
AutoConfiguration类使用`*`AutoConfiguration词法模式,其中`*`代表类库,例如,JPA存储库的自动配置是通过
JpaRepositoriesAutoConfiguration来实现的.


###重写默认的配置信息
重写的配置值配置在application.properties文件
比如,如果想更改应用程序启动端号,则可以在文件中添加
```
server.port = 8081
```



