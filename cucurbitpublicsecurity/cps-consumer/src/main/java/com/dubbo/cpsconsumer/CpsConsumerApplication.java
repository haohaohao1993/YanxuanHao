package com.dubbo.cpsconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

@SpringBootApplication
@ComponentScan("com.demo")
public class CpsConsumerApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(CpsConsumerApplication.class, args);
		System.in.read();
	}
}
