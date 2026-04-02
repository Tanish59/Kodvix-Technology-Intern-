package com.spring.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.model.User;

@Configuration
@ComponentScan("com.spring")
public class AppConfig {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmds.setUsername("root");
		dmds.setPassword("tanish@123");
		dmds.setUrl("jdbc:mysql://localhost:3306/itep16");
		return dmds;
	}
	
	@Bean
	public JdbcTemplate jdbcTemlate(DataSource ds) {
		return new JdbcTemplate(ds);
	}
}








