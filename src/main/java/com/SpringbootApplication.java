package com;

import org.apache.catalina.connector.Connector;
import org.apache.coyote.http11.Http11NioProtocol;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;

@SpringBootApplication
//配置druid必须加@ServletComponentScan注解，如果不加，访问页面打不开，filter和servlet、
// listener之类的需要单独进行注册才能使用，spring boot里面提供了该注解起到注册作用
@ServletComponentScan
@MapperScan(basePackages = "com.springboot.dao")
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

//	@Override
//	public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
//		configurableEmbeddedServletContainer.setPort(8082);
//	}
//	@Bean
//	public EmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory() throws IOException {
//		TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
//		tomcat.addAdditionalTomcatConnectors(httpConnector());
//		return tomcat;
//	}
//
//	public Connector httpConnector() throws IOException {
//		Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//		Http11NioProtocol http11NioProtocol = (Http11NioProtocol) connector.getProtocolHandler();
//		connector.setPort(8086);
//		//设置最大线程数
//		http11NioProtocol.setMaxThreads(100);
//		//设置初始线程数  最小空闲线程数
//		http11NioProtocol.setMinSpareThreads(20);
//		//设置超时
//		http11NioProtocol.setConnectionTimeout(5000);
//		return connector;
//	}

}
