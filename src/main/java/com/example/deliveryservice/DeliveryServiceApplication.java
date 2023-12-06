package com.example.deliveryservice;

import com.example.deliveryservice.database.DatabasePopulator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan({"com.example.deliveryservice.controller","com.example.deliveryservice.repository","com.example.deliveryservice.service","com.example.deliveryservice.database"})
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class DeliveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeliveryServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(DatabasePopulator databasePopulator) {
        return args -> {
            // Call the populate method when the application context is initialized
            databasePopulator.populate();

            // Continue with the rest of your application logic
        };
    }
}
