package com.zup.core.infrasctructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZuppayRestMainApplication {

  public static void main(String[] args) {
    SpringApplication.run(ZuppayRestMainApplication.class, args);
  }
}
