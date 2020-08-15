package com.ymktb.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

@Configuration
public class PersistenceConfiguration {

    @Bean
    public DataSource dataSource() {

        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:postgresql://localhost:5432/conference_app");
        builder.username("postgres");
        builder.password("123456");
        System.out.println("!!!!!!!! custom datasource bean !!!!!!");
        return builder.build();

    }
}
