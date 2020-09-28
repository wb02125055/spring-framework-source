### 源码分析专用工程。

##### 微信搜索：'菜鸟封神记'公众号，定期分享Spring源码系列内容。
![avatar](2.png)


----------------------------------------------------------------------------------
spring-webmvc: 主要是对mvc的支持，包括restful协议,spring-webmvc中依赖了spring-web

spring-web：主要是对远程调用和远程服务的支持

spring-webflux：Spring WebFlux是Spring Framework 5.0中引入的新的反应式Web框架。
    与Spring MVC不同，它不需要Servlet API，完全异步和非阻塞， 并通过Reactor项目
    实现Reactive Streams规范。 并且可以在诸如Netty，Undertow和Servlet 3.1+容器的服务器上运行。

spring-context-indexer：在SpringFramework5.0引入了一个注解@Indexed ，它可以为
    Spring的模式注解添加索引，以提升应用启动性能。比如，使用了@Service或者@Repository
    模式注解标注的组件，如果在标注了@Indexed注解之后，在执行编译的时候，会自动在classpath
    下生成一个META-INF/spring.components文件。当Spring应用上下文执行ComponentScan扫描时，
    META-INT/spring.components将会被CandidateComponentsIndexLoader 读取并加载，转换为
    CandidateComponentsIndex对象，这样的话@ComponentScan不在扫描指定的package，而是读取
    CandidateComponentsIndex对象，从而达到提升性能的目的。（有坑：在一个项目中如果引用了两个
    jar包，假设这两个jar中都使用了模式注解，在a.jar中使用了@Indexed，在b.jar中没有使用@Indexed，
    那么同时引入这两个jar包之后，通过@ComponentScan扫描项目中的bean组件，没有标注@Indexed的
    组件将不会被扫描到）
    
