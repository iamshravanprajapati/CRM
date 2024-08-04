package com.zohocrm.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
@Component
public class EmailServiceImpl implements EmailService {
	
	 @Autowired
	    private JavaMailSender emailSender;

	    public void sendSimpleMessage( String to, String subject, String emailBody) {
	    	 SimpleMailMessage message = new SimpleMailMessage(); 
	         message.setFrom("spdemo26@gmail.com");
	         message.setTo(to); 
	         message.setSubject(subject); 
	         message.setText(emailBody);
	         emailSender.send(message);
	         System.out.println(to);
	    	
	    }

}
