package com.example.demo.controller;

import java.util.List;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Beer;
import com.example.demo.service.BeerService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class BeerController {
	
	private final BeerService beerService;
	private final Environment environment;
	@RequestMapping
	public String getStatus()
	{
		return "beer-service is up and running on port:"+environment.getProperty("local.server.port");
	}
	
	@GetMapping("/beers")
	public List<Beer> getAllBeer()
	{
		return beerService.getAllBeer();
	}
	
	

}
