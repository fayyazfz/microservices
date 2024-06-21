package com.application.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
@EnableMongoRepositories("com.application.repository")
public class CustomerApplication implements CommandLineRunner {
    public static void main(String[]args){
        SpringApplication.run(CustomerApplication.class,args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
