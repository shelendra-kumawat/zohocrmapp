package com.zoho.services;

import java.util.List;

import com.zoho.entites.Billing;

public interface BillingService {
	
	public void generateInvoice(Billing billing);

	public List<Billing> getAllBill();
}
