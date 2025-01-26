package com.saipal.RedBookApp.model.economicCode;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EconomicCode {
	@Id
	private int economic_id;

	private String eco_code;

	private String economic_name;

	public EconomicCode() {
		super();
	}

	public EconomicCode(int economic_id, String eco_code, String economic_name) {
		super();
		this.economic_id = economic_id;
		this.eco_code = eco_code;
		this.economic_name = economic_name;
	}

	public int getEconomic_id() {
		return economic_id;
	}

	public void setEconomic_id(int economic_id) {
		this.economic_id = economic_id;
	}

	public String getEco_code() {
		return eco_code;
	}

	public void setEco_code(String eco_code) {
		this.eco_code = eco_code;
	}

	public String getEconomic_name() {
		return economic_name;
	}

	public void setEconomic_name(String economic_name) {
		this.economic_name = economic_name;
	}

	@Override
	public String toString() {
		return "economic_code [economic_id=" + economic_id + ", economic_code=" + eco_code + ", economic_name="
				+ economic_name + "]";
	}

}
