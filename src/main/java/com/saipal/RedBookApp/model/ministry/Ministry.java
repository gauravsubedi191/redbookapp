package com.saipal.RedBookApp.model.ministry;

import com.saipal.RedBookApp.model.province.Province;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Ministry {
	@Id
	private int ministry_id;

	private String ministry_code;

	private String ministry_np;

	private String ministry_eng;

	@ManyToOne
	@JoinColumn(name="province_id", nullable=false)
	private Province province;

	
	public Ministry() {
		super();
	}

	public Ministry(int ministry_id, String ministry_code, String ministry_np, String ministry_eng, Province province) {
		super();
		this.ministry_id = ministry_id;
		this.ministry_code = ministry_code;
		this.ministry_np = ministry_np;
		this.ministry_eng = ministry_eng;
		this.province = province;
	}

	public int getMinistry_id() {
		return ministry_id;
	}

	public void setMinistry_id(int ministry_id) {
		this.ministry_id = ministry_id;
	}

	public String getMinistry_code() {
		return ministry_code;
	}

	public void setMinistry_code(String ministry_code) {
		this.ministry_code = ministry_code;
	}

	public String getMinistry_np() {
		return ministry_np;
	}

	public void setMinistry_np(String ministry_np) {
		this.ministry_np = ministry_np;
	}

	public String getMinistry_eng() {
		return ministry_eng;
	}

	public void setMinistry_eng(String ministry_eng) {
		this.ministry_eng = ministry_eng;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	@Override
	public String toString() {
		return "Ministry [ministry_id=" + ministry_id + ", ministry_code=" + ministry_code + ", ministry_np="
				+ ministry_np + ", ministry_eng=" + ministry_eng + ", province=" + province + "]";
	}



}
