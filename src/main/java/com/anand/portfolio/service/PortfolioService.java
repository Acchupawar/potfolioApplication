package com.anand.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anand.portfolio.entities.PortfolioEntity;
import com.anand.portfolio.repository.PortfolioRepo;

@Service
public class PortfolioService {

	@Autowired
	private PortfolioRepo repo;

	// Create data
	public PortfolioEntity creatData(PortfolioEntity entity) {
		return repo.save(entity);

	}

	// find All Data
	public Iterable<PortfolioEntity> getAllData() {
		return repo.findAll();
	}

	// get by id person details
	public PortfolioEntity getById(int personId) {
		return repo.findById(personId).orElse(new PortfolioEntity());
	}

	// update profile
	public PortfolioEntity updateData(int personId, String newCantact, String newEmail) {

		PortfolioEntity entity = getById(personId);
		entity.setContact(newCantact);
		entity.setEmail(newEmail);

		return repo.save(entity);
	}

	// delet Data
	public void deletData(int personId) {

		repo.deleteById(personId);
	}

	// delet all data from portfolio database
	public void deletAllData() {
		repo.deleteAll();
	}

}
