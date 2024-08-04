package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.util.EmailServiceImpl;
@Controller
public class EmailController {
	
	@Autowired
	private EmailServiceImpl emailServices;
	@RequestMapping("/sendEmail")
	public String sendEmail(@RequestParam("email") String email, ModelMap modelMap) {
		modelMap.addAttribute("email", email);
		return "composeEmail";
		
	}
	@RequestMapping("/send")
	public String send(@RequestParam("toEmail") String to,@RequestParam("subject") String sub,@RequestParam("emailBody") String emailbody, ModelMap modelMap) {
		emailServices.sendSimpleMessage(to, sub, emailbody);
		return "composeEmail";
		
	}

} 
