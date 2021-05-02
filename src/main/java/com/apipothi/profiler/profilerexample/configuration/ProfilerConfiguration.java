package com.apipothi.profiler.profilerexample.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfilerConfiguration {

	@Profile("dev")
	@Bean
	public void devBean() {
		System.out.println("***I am from DEV Env.***");
	}

	@Profile("qa")
	@Bean
	public void qaBean() {
		System.out.println("***I am from QA Env.***");
	}

	@Profile("uat")
	@Bean
	public void uatBean() {
		System.out.println("***I am from UAT Env.***");
	}

	@Profile("prod")
	@Bean
	public void prdBean() {
		System.out.println("***I am from PROD Env.***");
	}
}