package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
//配置druid必须加@ServletComponentScan注解，如果不加，访问页面打不开，filter和servlet、
// listener之类的需要单独进行注册才能使用，spring boot里面提供了该注解起到注册作用
@ServletComponentScan
@MapperScan(basePackages = "com.springboot.mapper")
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
