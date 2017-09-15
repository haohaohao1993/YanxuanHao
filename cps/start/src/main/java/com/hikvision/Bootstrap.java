package com.hikvision;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * MainClass
 *
 */
@SpringBootApplication(scanBasePackages = {"com.hikvision.ga.common.boot", "com.hikvision"})
@EnableDiscoveryClient
public class Bootstrap implements CommandLineRunner {
  
  public static void main(String[] args) {
    System.out.println("===== This is a maven project hik-ga-archetype-application =====");
    System.out.println("===== Hello World! =====");
    SpringApplication.run(Bootstrap.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    // TODO Auto-generated method stub
  }

}
