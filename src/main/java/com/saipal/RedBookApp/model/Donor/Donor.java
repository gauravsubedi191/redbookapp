package com.saipal.RedBookApp.model.Donor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Donor {
	@Id
	private int donor_id;

	private int donor_code;

	private String donor_source;

	public Donor() {
		super();
	}

	public Donor(int donor_id, int donor_code, String donor_source) {
		super();
		this.donor_id = donor_id;
		this.donor_code = donor_code;
		this.donor_source = donor_source;
	}

	public int getDonor_id() {
		return donor_id;
	}

	public void setDonor_id(int donor_id) {
		this.donor_id = donor_id;
	}

	public int getDonor_code() {
		return donor_code;
	}

	public void setDonor_code(int donor_code) {
		this.donor_code = donor_code;
	}

	public String getDonor_source() {
		return donor_source;
	}

	public void setDonor_source(String donor_source) {
		this.donor_source = donor_source;
	}

	@Override
	public String toString() {
		return "Donor [donor_id=" + donor_id + ", donor_code=" + donor_code + ", donor_source=" + donor_source + "]";
	}

	
}
