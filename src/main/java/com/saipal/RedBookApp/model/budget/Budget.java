package com.saipal.RedBookApp.model.budget;

import java.math.BigDecimal;

import com.saipal.RedBookApp.model.Donor.Donor;
import com.saipal.RedBookApp.model.economicCode.EconomicCode;
import com.saipal.RedBookApp.model.fiscalyear.FiscalYear;
import com.saipal.RedBookApp.model.funding.FundingMethod;
import com.saipal.RedBookApp.model.ministry.Ministry;
import com.saipal.RedBookApp.model.province.Province;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Budget {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int budget_id;

	private Integer fiscal_year_id;
	@ManyToOne
	@JoinColumn(name = "fiscal_year_id", nullable = false, insertable = false, updatable = false)
	private FiscalYear fiscalYear;

	private Integer province_id;
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "province_id", nullable = false, insertable = false, updatable = false)
	private Province province;

	private Integer ministry_id;
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "ministry_id", nullable = false, insertable = false, updatable = false)
	private Ministry ministry;

	private Integer economic_id;
	@ManyToOne
	@JoinColumn(name = "economic_id", nullable = false, insertable = false, updatable = false)
	private EconomicCode economicCode;

	private Integer donor_id;
	@ManyToOne
	@JoinColumn(name = "donor_id", nullable = false, insertable = false, updatable = false)
	private Donor donor;

	private Integer funding_method_id;
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "funding_method_id", nullable = false, insertable = false, updatable = false)
	private FundingMethod fundingMethod;

	@Column(nullable = false, precision = 20, scale = 2)
	private BigDecimal budget_amount;

	@Column(nullable = false, precision = 20, scale = 2)
	private BigDecimal expenditure_amount;

	public Budget() {
		super();
	}

	public Budget(int budget_id, Integer fiscal_year_id, FiscalYear fiscalYear, Integer province_id, Province province,
			Integer ministry_id, Ministry ministry, Integer economic_id, EconomicCode economicCode, Integer donor_id,
			Donor donor, Integer funding_method_id, FundingMethod fundingMethod, BigDecimal budget_amount,
			BigDecimal expenditure_amount) {
		super();
		this.budget_id = budget_id;
		this.fiscal_year_id = fiscal_year_id;
		this.fiscalYear = fiscalYear;
		this.province_id = province_id;
		this.province = province;
		this.ministry_id = ministry_id;
		this.ministry = ministry;
		this.economic_id = economic_id;
		this.economicCode = economicCode;
		this.donor_id = donor_id;
		this.donor = donor;
		this.funding_method_id = funding_method_id;
		this.fundingMethod = fundingMethod;
		this.budget_amount = budget_amount;
		this.expenditure_amount = expenditure_amount;
	}

	public int getBudget_id() {
		return budget_id;
	}

	public void setBudget_id(int budget_id) {
		this.budget_id = budget_id;
	}

	public Integer getFiscal_year_id() {
		return fiscal_year_id;
	}

	public void setFiscal_year_id(Integer fiscal_year_id) {
		this.fiscal_year_id = fiscal_year_id;
	}

	public FiscalYear getFiscalYear() {
		return fiscalYear;
	}

	public void setFiscalYear(FiscalYear fiscalYear) {
		this.fiscalYear = fiscalYear;
	}

	public Integer getProvince_id() {
		return province_id;
	}

	public void setProvince_id(Integer province_id) {
		this.province_id = province_id;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public Integer getMinistry_id() {
		return ministry_id;
	}

	public void setMinistry_id(Integer ministry_id) {
		this.ministry_id = ministry_id;
	}

	public Ministry getMinistry() {
		return ministry;
	}

	public void setMinistry(Ministry ministry) {
		this.ministry = ministry;
	}

	public Integer getEconomic_id() {
		return economic_id;
	}

	public void setEconomic_id(Integer economic_id) {
		this.economic_id = economic_id;
	}

	public EconomicCode getEconomicCode() {
		return economicCode;
	}

	public void setEconomicCode(EconomicCode economicCode) {
		this.economicCode = economicCode;
	}

	public Integer getDonor_id() {
		return donor_id;
	}

	public void setDonor_id(Integer donor_id) {
		this.donor_id = donor_id;
	}

	public Donor getDonor() {
		return donor;
	}

	public void setDonor(Donor donor) {
		this.donor = donor;
	}

	public Integer getFunding_method_id() {
		return funding_method_id;
	}

	public void setFunding_method_id(Integer funding_method_id) {
		this.funding_method_id = funding_method_id;
	}

	public FundingMethod getFundingMethod() {
		return fundingMethod;
	}

	public void setFundingMethod(FundingMethod fundingMethod) {
		this.fundingMethod = fundingMethod;
	}

	public BigDecimal getBudget_amount() {
		return budget_amount;
	}

	public void setBudget_amount(BigDecimal budget_amount) {
		this.budget_amount = budget_amount;
	}

	public BigDecimal getExpenditure_amount() {
		return expenditure_amount;
	}

	public void setExpenditure_amount(BigDecimal expenditure_amount) {
		this.expenditure_amount = expenditure_amount;
	}

	@Override
	public String toString() {
		return "Budget [budget_id=" + budget_id + ", fiscal_year_id=" + fiscal_year_id + ", fiscalYear=" + fiscalYear
				+ ", province_id=" + province_id + ", province=" + province + ", ministry_id=" + ministry_id
				+ ", ministry=" + ministry + ", economic_id=" + economic_id + ", economicCode=" + economicCode
				+ ", donor_id=" + donor_id + ", donor=" + donor + ", funding_method_id=" + funding_method_id
				+ ", fundingMethod=" + fundingMethod + ", budget_amount=" + budget_amount + ", expenditure_amount="
				+ expenditure_amount + "]";
	}

}
