package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Leads;
import com.zohocrm.services.LeadsService;

@Controller
public class LeadsController {
	
	
	
	@Autowired
	private LeadsService leadsService;
	
	@RequestMapping("/leads")
	public String showLeadsPage() {
		return "createLeads";
		
	}
	@RequestMapping("/saveLeads")
	public String saveLeadsinfo(@ModelAttribute("lead") Leads leads, ModelMap modelmap) {
         leadsService.saveLeads(leads);
         modelmap.addAttribute("msg","lead is saved");
		return "createLeads";
	}
	@RequestMapping("/getLeads")
	public String getLeads(ModelMap modelMap) {
		List<Leads> leads = leadsService.getAllLeads();
		modelMap.addAttribute("leads", leads);
		return "searchResult";
		
	}
	@RequestMapping("/getLeadInfo")
	public String getLeadInfo(@RequestParam("id")long id, ModelMap modelMap) {
		Leads lead = leadsService.findById(id);
		modelMap.addAttribute("lead", lead);
		return "leadInfo";
		
	}

}
