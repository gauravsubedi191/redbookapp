package com.saipal.RedBookApp.model.budget;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saipal.RedBookApp.model.economicCode.EconomicCode;
import com.saipal.RedBookApp.model.economicCode.EconomicCodeService;
import com.saipal.RedBookApp.model.fiscalyear.FiscalYear;
import com.saipal.RedBookApp.model.fiscalyear.FiscalYearService;
import com.saipal.RedBookApp.model.funding.FundingService;
import com.saipal.RedBookApp.model.ministry.MinistryService;
import com.saipal.RedBookApp.model.province.ProvinceService;

import jakarta.transaction.Transactional;

@Service

public class BudgetService {

	@Autowired
	private BudgetRepository budgetRepository;

	public List<Budget> getAllBudgets() {
		return budgetRepository.findAll();
	}

	public Budget saveBudget(Budget budget) {
		return budgetRepository.save(budget);
	}

	public Budget getBudgetById(int budget_id) {
		return budgetRepository.findById(budget_id).orElse(null);
	}

	public void deleteBudget(int budget_id) {
		budgetRepository.deleteById(budget_id);
	}

}
