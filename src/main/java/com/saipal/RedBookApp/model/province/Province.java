package com.saipal.RedBookApp.model.province;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Province {
	
	@Id
	private int province_id;

	private int province_code;

	private String province_np;

	private String province_eng;
	

	public Province() {
		super();
	}

	public Province(int province_id, int province_code, String province_np, String province_eng) {
		super();
		this.province_id = province_id;
		this.province_code = province_code;
		this.province_np = province_np;
		this.province_eng = province_eng;
	}

	public int getProvince_id() {
		return province_id;
	}

	public void setProvince_id(int province_id) {
		this.province_id = province_id;
	}

	public int getProvince_code() {
		return province_code;
	}

	public void setProvince_code(int province_code) {
		this.province_code = province_code;
	}

	public String getProvince_np() {
		return province_np;
	}

	public void setProvince_np(String province_np) {
		this.province_np = province_np;
	}

	public String getProvince_eng() {
		return province_eng;
	}

	public void setProvince_eng(String province_eng) {
		this.province_eng = province_eng;
	}

	@Override
	public String toString() {
		return "province [province_id=" + province_id + ", province_code=" + province_code + ", province_np="
				+ province_np + ", province_eng=" + province_eng + "]";
	}

}
