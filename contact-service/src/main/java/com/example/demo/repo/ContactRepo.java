package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact, Integer> {

	public List<Contact> findByAddress(String address);
	public List<Contact> findByContactName(String contactName);

}
