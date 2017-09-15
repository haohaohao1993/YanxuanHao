package com.hikvision.ga.nobug;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * MainClass
 *
 */
@SpringBootApplication(scanBasePackages = {"com.hikvision.ga.common.boot", "com.hikvision.ga.nobug"})
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
