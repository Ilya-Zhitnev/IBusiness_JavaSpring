package com.entity;
// Generated 28 янв. 2024 г., 15:09:29 by Hibernate Tools 6.3.1.Final

import java.io.Serializable;

/**
 * ViewSaleId generated by hbm2java
 */
public class ViewSaleId implements java.io.Serializable {

	private Serializable avtor;
	private int branchId;
	private Serializable measure;
	private Serializable name;
	private int productId;
	private Long rowId;
	private Double wbldQty;
	private Double wbldSum;

	public ViewSaleId() {
	}

	public ViewSaleId(Serializable avtor, int branchId, Serializable measure, Serializable name, int productId,
			Long rowId, Double wbldQty, Double wbldSum) {
		this.avtor = avtor;
		this.branchId = branchId;
		this.measure = measure;
		this.name = name;
		this.productId = productId;
		this.rowId = rowId;
		this.wbldQty = wbldQty;
		this.wbldSum = wbldSum;
	}

	public Serializable getAvtor() {
		return this.avtor;
	}

	public void setAvtor(Serializable avtor) {
		this.avtor = avtor;
	}

	public int getBranchId() {
		return this.branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
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

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Long getRowId() {
		return this.rowId;
	}

	public void setRowId(Long rowId) {
		this.rowId = rowId;
	}

	public Double getWbldQty() {
		return this.wbldQty;
	}

	public void setWbldQty(Double wbldQty) {
		this.wbldQty = wbldQty;
	}

	public Double getWbldSum() {
		return this.wbldSum;
	}

	public void setWbldSum(Double wbldSum) {
		this.wbldSum = wbldSum;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ViewSaleId))
			return false;
		ViewSaleId castOther = (ViewSaleId) other;

		return ((this.getAvtor() == castOther.getAvtor()) || (this.getAvtor() != null && castOther.getAvtor() != null
				&& this.getAvtor().equals(castOther.getAvtor())))
				&& (this.getBranchId() == castOther.getBranchId())
				&& ((this.getMeasure() == castOther.getMeasure()) || (this.getMeasure() != null
						&& castOther.getMeasure() != null && this.getMeasure().equals(castOther.getMeasure())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& (this.getProductId() == castOther.getProductId())
				&& ((this.getRowId() == castOther.getRowId()) || (this.getRowId() != null
						&& castOther.getRowId() != null && this.getRowId().equals(castOther.getRowId())))
				&& ((this.getWbldQty() == castOther.getWbldQty()) || (this.getWbldQty() != null
						&& castOther.getWbldQty() != null && this.getWbldQty().equals(castOther.getWbldQty())))
				&& ((this.getWbldSum() == castOther.getWbldSum()) || (this.getWbldSum() != null
						&& castOther.getWbldSum() != null && this.getWbldSum().equals(castOther.getWbldSum())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAvtor() == null ? 0 : this.getAvtor().hashCode());
		result = 37 * result + this.getBranchId();
		result = 37 * result + (getMeasure() == null ? 0 : this.getMeasure().hashCode());
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + this.getProductId();
		result = 37 * result + (getRowId() == null ? 0 : this.getRowId().hashCode());
		result = 37 * result + (getWbldQty() == null ? 0 : this.getWbldQty().hashCode());
		result = 37 * result + (getWbldSum() == null ? 0 : this.getWbldSum().hashCode());
		return result;
	}

}
