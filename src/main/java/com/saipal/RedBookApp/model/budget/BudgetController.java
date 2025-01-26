package com.saipal.RedBookApp.model.budget;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.saipal.RedBookApp.model.Donor.Donor;
import com.saipal.RedBookApp.model.Donor.DonorService;
import com.saipal.RedBookApp.model.economicCode.EconomicCode;
import com.saipal.RedBookApp.model.economicCode.EconomicCodeService;
import com.saipal.RedBookApp.model.fiscalyear.FiscalYear;
import com.saipal.RedBookApp.model.fiscalyear.FiscalYearService;
import com.saipal.RedBookApp.model.funding.FundingMethod;
import com.saipal.RedBookApp.model.funding.FundingService;
import com.saipal.RedBookApp.model.ministry.Ministry;
import com.saipal.RedBookApp.model.ministry.MinistryService;
import com.saipal.RedBookApp.model.province.Province;
import com.saipal.RedBookApp.model.province.ProvinceService;

import jakarta.validation.Valid;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/budget")
public class BudgetController {

	public BudgetController(BudgetService budgetService) {
		super();
		this.budgetService = budgetService;
	}

	@Autowired
	private BudgetService budgetService;

	@Autowired
	private DonorService donorService;

	@Autowired
	private EconomicCodeService economicCodeService;

	@Autowired
	private FiscalYearService fiscalYearService;

	@Autowired
	private FundingService fundingService;

	@Autowired
	private MinistryService ministryService;

	@Autowired
	private ProvinceService provinceService;
	/*
	 * @GetMapping("/list") public String listAllBudgets(ModelMap model) {
	 * List<Budget> budget = budgetService.getAllBudgets();
	 * model.addAttribute("budgets", budget); return "list"; }
	 */

	@GetMapping("/list")
	public ModelAndView listAllBudgets() {
		List<Budget> budget = budgetService.getAllBudgets();
		ModelAndView model = new ModelAndView("budget_list");
		model.addObject("budgets", budget);
		return model;
	}

	/* deleteMapping */
	@RequestMapping("/delete/{id}")
	public ModelAndView deleteById(@PathVariable("id") Integer budget_id) {
		budgetService.deleteBudget(budget_id);
		List<Budget> budget = budgetService.getAllBudgets();
		return new ModelAndView("budget_list").addObject("budgets", budget);
	}

	@GetMapping("/add-budget-form")
	public ModelAndView openBudgetForm() {
		List<Budget> budget = budgetService.getAllBudgets();
		List<Donor> donor = donorService.getAllDonors();
		List<EconomicCode> economicCode = economicCodeService.getAllEconomicCodes();
		List<FiscalYear> fiscalYear = fiscalYearService.getAllFiscalYears();
		List<FundingMethod> fundingMethod = fundingService.getAllFundingMethods();
		List<Ministry> ministry = ministryService.getAllMinistries();
		List<Province> province = provinceService.getAllProvinces();

		ModelAndView model = new ModelAndView("budget_form");

		model.addObject("budgets", budget);
		model.addObject("donors", donor);
		model.addObject("economicCodes", economicCode);
		model.addObject("fiscalYears", fiscalYear);
		model.addObject("fundingMethods", fundingMethod);
		model.addObject("ministries", ministry);
		model.addObject("provinces", province);

		return model;
	}

	@PostMapping(value = "/save")
	public ModelAndView saveBudget(@ModelAttribute Budget budget) {
		try {
			budgetService.saveBudget(budget);
			return new ModelAndView("redirect:/budget/list");
		} catch (Exception e) {
			e.printStackTrace();
			ModelAndView modelAndView = new ModelAndView("budget_form");
			modelAndView.addObject("errorMessage", "Failed to save budget: " + e.getMessage());
			return modelAndView;
		}
	}

	@GetMapping("/update/{id}")
	public ModelAndView updateById(@PathVariable("id") int budget_id) {
		ModelAndView model = new ModelAndView("budget_form");
		// budget.setBudget_id(budget_id);
		Budget budget = budgetService.getBudgetById(budget_id);

		model.addObject("budget", budget);
		model.addObject("budgets", budgetService.getAllBudgets());
		model.addObject("donors", donorService.getAllDonors());
		model.addObject("economicCodes", economicCodeService.getAllEconomicCodes());
		model.addObject("fiscalYears", fiscalYearService.getAllFiscalYears());
		model.addObject("fundingMethods", fundingService.getAllFundingMethods());
		model.addObject("ministries", ministryService.getAllMinistries());
		model.addObject("provinces", provinceService.getAllProvinces());

		return model;
	}

}
