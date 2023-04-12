package com.lead.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lead.entities.Lead;
import com.lead.services.LeadService;
import com.lead.utils.EmailService;

@Controller
public class LeadController {
	//http://localhost:8080/load
	@RequestMapping("/load")
	public String loadPage() {
		return "createLead";
	}
	
	
	@Autowired
	private LeadService leadSer;
	
	@Autowired
	private EmailService emailService;
	
	//http://localhost:8080/create
	@RequestMapping("/create")
	public String createPage(Lead lead,Model model) {
		emailService.sendEmail(lead.getEmail(), "welcome Email", "Testing Email Sending");
		model.addAttribute("create","successfully create an item");
		leadSer.createRecord(lead);
		return "createLead";
	}
	
	//http://localhost:8080/show
	@RequestMapping("/show")
	public String showPage(Model model) {
		List<Lead> showAll = leadSer.showAll();
		model.addAttribute("all", showAll);
		return "showLead";
	}
	
	//http:localhost:8080/delete
	@RequestMapping("/delete")
	public String deleteRecord(@RequestParam("id") Long id,Model model) {
		leadSer.delete(id);
		model.addAttribute("delete","successfully delete one item");
		List<Lead> showAll = leadSer.showAll();
		model.addAttribute("all", showAll);
		return "showLead";
	}
	
	//http:localhost:8080/update
	@RequestMapping("/update")
	public String updateLead(@RequestParam("id") Long id,Model model) {
		Lead id2 = leadSer.updateOneItem(id);
		model.addAttribute("id2", id2);
		return "updateLead";
	}
	
	//http:localhost:8080/updateLead
	@RequestMapping("/updateLead")
	public String updateItem(Lead lead,Model model) {
		leadSer.createRecord(lead);
		model.addAttribute("update","successfully update an item");
		List<Lead> showAll = leadSer.showAll();
		model.addAttribute("all", showAll);
		return "showLead";
	}
	
	

}
