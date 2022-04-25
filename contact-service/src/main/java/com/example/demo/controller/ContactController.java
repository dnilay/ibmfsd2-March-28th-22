package com.example.demo.controller;

import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ContactController {

	private final Environment environment;

	@RequestMapping
	public ResponseEntity<?> getStatus() {
		return ResponseEntity
				.ok("contact-ws is up and running on port: " + environment.getProperty("local.server.port"));
	}

}
