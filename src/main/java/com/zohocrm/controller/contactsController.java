package com.zohocrm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.dto.saveCcontactsInfo;
@Controller
public class contactsController {
	@RequestMapping("/contacts")
	public String contactsinfo( saveCcontactsInfo info) {
		System.out.println(info.getEmail());
		System.out.println(info.getCompany());
		return "saveContacts";
		
	}

}
