package com.zoho.services;


import java.util.List;

import com.zoho.entites.Contacts;

public interface ContactService {

	public void saveContactsInformation(Contacts contacts);
	public List<Contacts> getAllContacts();
	public Contacts findContactsById(long id);
	
}
