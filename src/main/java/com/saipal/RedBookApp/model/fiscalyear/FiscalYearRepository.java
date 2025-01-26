package com.saipal.RedBookApp.model.fiscalyear;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiscalYearRepository extends JpaRepository<FiscalYear, Integer> {

}
