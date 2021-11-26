package com.example.customermanagement.config;

import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 26, November 2021
 * Time: 7:31 AM
 * Project: customer-management
 * Package Name: com.example.customermanagement.config
 * To change this template use File | Settings | File and Code Template
 */
@Configuration
@Profile("clean")
public class CleanDB {

    @Bean
    public FlywayMigrationStrategy clean(){
        return flyway -> {
            flyway.clean();
            flyway.migrate();
        };
    }
}
