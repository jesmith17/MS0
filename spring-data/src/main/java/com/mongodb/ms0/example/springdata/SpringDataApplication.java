package com.mongodb.ms0.example.springdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = com.mongodb.ms0.example.springdata.repository.mongodb.CustomerMongoRepository.class)
@EnableJpaRepositories(basePackageClasses = com.mongodb.ms0.example.springdata.repository.mysql.CustomerMysqlRepository.class)
@SpringBootApplication
public class SpringDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataApplication.class, args);
    }

}
