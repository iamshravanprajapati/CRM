package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Leads;
import com.zohocrm.repositories.leadsRepository;

@Service
public class LeadsServiceImpl implements LeadsService {
      @Autowired
      private leadsRepository leadRepo;
	@Override
	public void saveLeads(Leads lead) {
		leadRepo.save(lead);
		
		
	}
	@Override
	public List<Leads> getAllLeads() {
		List<Leads> leads = leadRepo.findAll();
		return leads;
	}
	@Override
	public Leads findById(long id) {
		Optional<Leads> findById = leadRepo.findById(id);
		Leads lead = findById.get();
		return lead;
	}

}
