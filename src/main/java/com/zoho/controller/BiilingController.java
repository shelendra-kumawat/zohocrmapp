package com.zoho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.entites.Billing;
import com.zoho.entites.Contacts;
import com.zoho.services.BillingService;
import com.zoho.services.ContactService;

@Controller
public class BiilingController {
	
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/billingForm")
	public String viewBillingForm(@RequestParam("contactId") long id, Model model) {
		Contacts contact = contactService.findContactsById(id);
		model.addAttribute("contact", contact);
		return "create_bill";
	}
	
	@RequestMapping("/generateBill")
	public String generateBill(@ModelAttribute("billing")Billing billing) {
		billingService.generateInvoice(billing);
		return "create_bill";
	}
	
	//http://localhost:8080/listBill
	@RequestMapping("/listBill")
	public String listBills(Model model) {
		List<Billing> billing = billingService.getAllBill();
		model.addAttribute("billing", billing);
		return "list_bill";
	}
}
