package com.example.msrestcruddb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MsRestCrudDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsRestCrudDbApplication.class, args);
    }

}
