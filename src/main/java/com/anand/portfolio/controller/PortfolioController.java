package com.anand.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.anand.portfolio.entities.PortfolioEntity;
import com.anand.portfolio.service.PortfolioService;

@RestController
public class PortfolioController {

	@Autowired
	private PortfolioService service;

	@PostMapping(value = "/save") // done
	public PortfolioEntity save(@RequestBody PortfolioEntity entity) {

		return service.creatData(entity);
	}

	@GetMapping(value = "/{getId}") // done
	public PortfolioEntity getById(@PathVariable("getId") int personId) {

		return service.getById(personId);
	}

	@GetMapping(value = "/all") // done
	public @ResponseBody Iterable<PortfolioEntity> getAll() {
		return service.getAllData();

	}

	@PutMapping(value = "/{id}/{contact}/{email}")
	public PortfolioEntity update(@PathVariable("id") int id, @PathVariable("contact") String newContact,
			@PathVariable("email") String newEmail) {

		return service.updateData(id, newContact, newEmail);
	}

	@DeleteMapping(value = "/{personId}")
	public void deletePerson(@PathVariable("personId") int id) {
		service.deletData(id);
	}
	
	@DeleteMapping(value = "deletAll")
	public void deletAllPerson() {
		service.deletAllData();
	}
}
