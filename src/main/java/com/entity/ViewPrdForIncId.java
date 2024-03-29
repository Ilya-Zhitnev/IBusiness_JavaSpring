package com.entity;
// Generated 28 янв. 2024 г., 15:09:29 by Hibernate Tools 6.3.1.Final

import java.io.Serializable;

/**
 * ViewPrdForIncId generated by hbm2java
 */
public class ViewPrdForIncId implements java.io.Serializable {

	private int branchId;
	private Serializable category;
	private Serializable countryName;
	private Serializable description;
	private Serializable measure;
	private Serializable name;
	private Serializable numSert;
	private int productId;
	private Integer qty;

	public ViewPrdForIncId() {
	}

	public ViewPrdForIncId(int branchId, Serializable category, Serializable countryName, Serializable description,
			Serializable measure, Serializable name, Serializable numSert, int productId, Integer qty) {
		this.branchId = branchId;
		this.category = category;
		this.countryName = countryName;
		this.description = description;
		this.measure = measure;
		this.name = name;
		this.numSert = numSert;
		this.productId = productId;
		this.qty = qty;
	}

	public int getBranchId() {
		return this.branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public Serializable getCategory() {
		return this.category;
	}

	public void setCategory(Serializable category) {
		this.category = category;
	}

	public Serializable getCountryName() {
		return this.countryName;
	}

	public void setCountryName(Serializable countryName) {
		this.countryName = countryName;
	}

	public Serializable getDescription() {
		return this.description;
	}

	public void setDescription(Serializable description) {
		this.description = description;
	}

	public Serializable getMeasure() {
		return this.measure;
	}

	public void setMeasure(Serializable measure) {
		this.measure = measure;
	}

	public Serializable getName() {
		return this.name;
	}

	public void setName(Serializable name) {
		this.name = name;
	}

	public Serializable getNumSert() {
		return this.numSert;
	}

	public void setNumSert(Serializable numSert) {
		this.numSert = numSert;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Integer getQty() {
		return this.qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ViewPrdForIncId))
			return false;
		ViewPrdForIncId castOther = (ViewPrdForIncId) other;

		return (this.getBranchId() == castOther.getBranchId())
				&& ((this.getCategory() == castOther.getCategory()) || (this.getCategory() != null
						&& castOther.getCategory() != null && this.getCategory().equals(castOther.getCategory())))
				&& ((this.getCountryName() == castOther.getCountryName())
						|| (this.getCountryName() != null && castOther.getCountryName() != null
								&& this.getCountryName().equals(castOther.getCountryName())))
				&& ((this.getDescription() == castOther.getDescription())
						|| (this.getDescription() != null && castOther.getDescription() != null
								&& this.getDescription().equals(castOther.getDescription())))
				&& ((this.getMeasure() == castOther.getMeasure()) || (this.getMeasure() != null
						&& castOther.getMeasure() != null && this.getMeasure().equals(castOther.getMeasure())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& ((this.getNumSert() == castOther.getNumSert()) || (this.getNumSert() != null
						&& castOther.getNumSert() != null && this.getNumSert().equals(castOther.getNumSert())))
				&& (this.getProductId() == castOther.getProductId())
				&& ((this.getQty() == castOther.getQty()) || (this.getQty() != null && castOther.getQty() != null
						&& this.getQty().equals(castOther.getQty())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getBranchId();
		result = 37 * result + (getCategory() == null ? 0 : this.getCategory().hashCode());
		result = 37 * result + (getCountryName() == null ? 0 : this.getCountryName().hashCode());
		result = 37 * result + (getDescription() == null ? 0 : this.getDescription().hashCode());
		result = 37 * result + (getMeasure() == null ? 0 : this.getMeasure().hashCode());
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getNumSert() == null ? 0 : this.getNumSert().hashCode());
		result = 37 * result + this.getProductId();
		result = 37 * result + (getQty() == null ? 0 : this.getQty().hashCode());
		return result;
	}

}
