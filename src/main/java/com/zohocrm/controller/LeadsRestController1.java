package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zohocrm.entities.Leads;
import com.zohocrm.repositories.leadsRepository;

@RestController
@RequestMapping("leadss")
public class LeadsRestController1 {
	@Autowired
	private leadsRepository leadRepo;
	
	@GetMapping
	public List<Leads> getAllLeads() {
		List<Leads> leads = leadRepo.findAll();
		return leads;
		
		
	}
	@PostMapping
	public void saveLeads(@RequestBody Leads leads) {
		leadRepo.save(leads);
		
	}

@PutMapping
public void updateLeads(@RequestBody Leads leads) {
	leadRepo.save(leads);
	
}
@DeleteMapping("/delete/{id}")
public void deleteLeads(@PathVariable("id") long id) {
	leadRepo.deleteById(id);
	
}
}
