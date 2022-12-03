package com.zoho.services;


import java.util.List;

import com.zoho.entites.Lead;

public interface LeadService {

	public void saveLeadInformation(Lead lead);
	public List<Lead> getAllLeads();
	public Lead findLeadById(long id);
	public void deleteOneLead(long id);
}
