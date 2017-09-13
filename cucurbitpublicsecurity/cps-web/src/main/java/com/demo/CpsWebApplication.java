package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

@SpringBootApplication
@ImportResource({"classpath:spring-dubbo.xml"})
@ComponentScan("com.demo")
public class CpsWebApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(CpsWebApplication.class, args);
		System.in.read();
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//				new String[] {"spring-dubbo.xml"});
//		context.start();
//		try {
//			System.in.read();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
