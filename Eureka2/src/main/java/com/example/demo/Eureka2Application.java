package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @SpringBootApplication注解添加了一下所有内容： 
 * 		@Configuration：标记该类作为应用程序上下文的bean定义的来源。。
 * 		@EnableAutoConfiguration：告诉Spring Boot开始添加bean,根据类路径、其他bean和各种属性设置。
 *		@EnableWebMvc： 通常你会为Spring MVC应用程序添加@EnableWebMvc，但SpringBoot会在类路径上看到spring-webmvc时自动添加它。
 *						 这会将应用程序标记为Web应用程序并激活关键行为，例如设置DispatcherServlet。
 * 		@ComponentScan：告诉Spring在hello包中寻找其他组件，配置和服务，允许它找到控制器。
 */
/**
 * @EnableEurekaServer
 * 		启用服务注册中心  
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka2Application {

	public static void main(String[] args) {
		SpringApplication.run(Eureka2Application.class, args);
	}

}
