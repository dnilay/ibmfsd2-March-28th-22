package com.example.demo.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		super.configure(http);
		http.csrf().disable();
		http.headers().disable();
		http.formLogin().disable();
		http.authorizeHttpRequests().anyRequest().permitAll();
	}
	
	
	

}
