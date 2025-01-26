package com.saipal.RedBookApp.model.fiscalyear;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FiscalYear {

	@Id 
	private int  fiscal_year_id;
	
	private String year;
	
	
	public FiscalYear() {
		super();
	}
	public FiscalYear(int fiscal_year_id, String year) {
		super();
		this.fiscal_year_id = fiscal_year_id;
		this.year = year;
	}
	public int getFiscal_year_id() {
		return fiscal_year_id;
	}
	public void setFiscal_year_id(int fiscal_year_id) {
		this.fiscal_year_id = fiscal_year_id;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "fiscal_year [fiscal_year_id=" + fiscal_year_id + ", year=" + year + "]";
	}
	
	
}
