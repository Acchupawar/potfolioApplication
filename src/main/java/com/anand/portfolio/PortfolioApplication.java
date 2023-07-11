package com.anand.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.anand.portfolio.entities.PortfolioEntity;
import com.anand.portfolio.repository.PortfolioRepo;
import com.anand.portfolio.service.PortfolioService;

@SpringBootApplication
public class PortfolioApplication {

	@Autowired
	private PortfolioService service;

	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);

		System.out.println("Portfolio Application started..");
	}

}
