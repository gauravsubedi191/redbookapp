package com.saipal.RedBookApp.model.funding;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FundingMethodRepository extends JpaRepository<FundingMethod, Integer> {
	
}
