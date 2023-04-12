package com.lead.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {
	
	@Autowired
	private JavaMailSender javaMailSender;

	@Override
	public void sendEmail(String to, String sub, String msg) {
		SimpleMailMessage simpleMail=new SimpleMailMessage();
		simpleMail.setTo(to);
		simpleMail.setSubject(sub);
		simpleMail.setText(msg);
		
		javaMailSender.send(simpleMail);
	}
}
