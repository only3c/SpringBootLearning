package com.cml.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.scheduling.annotation.EnableAsync;

import com.cml.springboot.framework.db.EnableDynamicDataSource;

@Configuration
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@ComponentScan()
@EnableAsync
@PropertySources({ @PropertySource("classpath:config/application-jdbc.properties") })
@EnableDynamicDataSource
public class BootApplication {

	// @Bean
	// public PropertyPlaceholderConfigurer placeHolder() {
	//
	// PropertyPlaceholderConfigurer configure = new
	// PropertyPlaceholderConfigurer();
	// configure.setLocations(null);
	//
	// return configure;
	// }

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BootApplication.class, args);
	}
}
