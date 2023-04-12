package com.lead.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lead.entities.Lead;
import com.lead.repositories.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
	@Autowired
	private LeadRepository leadRepo;

	@Override
	public void createRecord(Lead lead) {
		leadRepo.save(lead);
	}

	@Override
	public List<Lead> showAll() {
		List<Lead> all = leadRepo.findAll();
		return all;
	}

	@Override
	public void delete(Long id) {
		leadRepo.deleteById(id);
	}

	@Override
	public Lead updateOneItem(Long id) {
		Optional<Lead> id2 = leadRepo.findById(id);
		Lead lead = id2.get();
		return lead;
	}

	@Override
	public List<Lead> update(Lead lead) {
		List<Lead> update = leadRepo.findAll();
		return update;
	}
}
