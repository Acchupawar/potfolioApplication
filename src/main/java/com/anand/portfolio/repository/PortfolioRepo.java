package com.anand.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anand.portfolio.entities.PortfolioEntity;

@Repository
public interface PortfolioRepo  extends JpaRepository<PortfolioEntity, Integer>{

	
}
