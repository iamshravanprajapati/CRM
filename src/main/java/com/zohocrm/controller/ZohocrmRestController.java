package com.zohocrm.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zohocrm.entities.Leads;
import com.zohocrm.repositories.leadsRepository;

@RestController
public class ZohocrmRestController {
	
	
	@Autowired
	private leadsRepository leadsRepo;
	
	@RequestMapping("/leads/{id}")
	public Leads getLeads(@PathVariable long id) {
		System.out.println(id);
		Optional<Leads> findById = leadsRepo.findById(id);
		Leads leads = findById.get();
		return leads;
		
	}

}
