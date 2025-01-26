package com.saipal.RedBookApp.model.economicCode;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EconomicCodeRepository extends JpaRepository<EconomicCode, Integer> {

}
