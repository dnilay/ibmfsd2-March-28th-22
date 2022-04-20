package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Beer;
@Repository
public class BeerRepositoryImpl implements BeerRepository {
	
	private List<Beer> beers;
	
	

	public BeerRepositoryImpl() {
		beers=new ArrayList<Beer>();
		beers.add(new Beer(UUID.randomUUID().toString(), "LARGE", 110.0));
		beers.add(new Beer(UUID.randomUUID().toString(), "LARGE", 100.0));
		beers.add(new Beer(UUID.randomUUID().toString(), "SMALL", 130.0));
		beers.add(new Beer(UUID.randomUUID().toString(), "SMOOTH", 210.0));
		beers.add(new Beer(UUID.randomUUID().toString(), "LIGHT", 90.0));
	}



	@Override
	public List<Beer> getAllBeer() {
		// TODO Auto-generated method stub
		return beers;
	}

}
