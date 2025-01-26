package com.saipal.RedBookApp.model.funding;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FundingMethod{
	@Id
	private int funding_method_id;
	private String funding_method_code;
	private String funding_method_source;

	public FundingMethod() {
		super();
	}

	public FundingMethod(int funding_method_id, String funding_method_code, String funding_method_source) {
		super();
		this.funding_method_id = funding_method_id;
		this.funding_method_code = funding_method_code;
		this.funding_method_source = funding_method_source;
	}

	public int getFunding_method_id() {
		return funding_method_id;
	}

	public void setFunding_method_id(int funding_method_id) {
		this.funding_method_id = funding_method_id;
	}

	public String getFunding_method_code() {
		return funding_method_code;
	}

	public void setFunding_method_code(String funding_method_name) {
		this.funding_method_code= funding_method_name;
	}

	public String getFunding_method_source() {
		return funding_method_source;
	}

	public void setFunding_method_source(String funding_method_source) {
		this.funding_method_source = funding_method_source;
	}

	@Override
	public String toString() {
		return "government_fund [funding_method_id=" + funding_method_id + ", funding_method_name="
				+ funding_method_code + ", funding_method_source=" + funding_method_source + "]";
	}

}
