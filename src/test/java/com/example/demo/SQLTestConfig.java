package com.example.demo;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SQLTestConfig {



        @Bean
        DataSource dataSource() {
            HikariConfig config = new HikariConfig();
            config.setMaximumPoolSize(2);
            config.setDriverClassName("org.");
            config.setJdbcUrl("jdbc:postgresql://localhost:5432/spring_test?useSSL=false&amp;serverTimezone=UTC");
            config.setUsername("hbstudent");
            config.setPassword("hbstudent");
            return new HikariDataSource(config);
        }
    }

