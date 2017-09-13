package com.demo.config;

import com.dubbo.test.dubboService.DemoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
//@ImportResource(locations={"classpath:dubbo-consumer.xml"})
public class XmlConfig {

    @Bean
    public ClassPathXmlApplicationContext dubboContext(){
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
       new String[]{"dubbo-consumer.xml"});
       context.start();
       return context;
       //return (DemoService) context.getBean("demoService"); // obtain proxy object for remote invocation
    }
}
