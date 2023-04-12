package com.lead.services;


import java.util.List;

import com.lead.entities.Lead;

public interface LeadService {

	public void createRecord(Lead lead);

	public List<Lead> showAll();

	public void delete(Long id);

	public Lead updateOneItem(Long id);

	public List<Lead> update(Lead lead);
}
