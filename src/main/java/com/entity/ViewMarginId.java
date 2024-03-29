package com.entity;
// Generated 28 янв. 2024 г., 15:09:29 by Hibernate Tools 6.3.1.Final

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * ViewMarginId generated by hbm2java
 */
public class ViewMarginId implements java.io.Serializable {

	private int branchId;
	private Double margin;
	private Serializable measure;
	private Serializable name;
	private int numParty;
	private Double priceC;
	private int productId;
	private Long rowId;
	private Timestamp wblDate;
	private Double wblPriceC;
	private Double wbldPriceWithSale;
	private Double wbldQty;

	public ViewMarginId() {
	}

	public ViewMarginId(int branchId, Double margin, Serializable measure, Serializable name, int numParty,
			Double priceC, int productId, Long rowId, Timestamp wblDate, Double wblPriceC, Double wbldPriceWithSale,
			Double wbldQty) {
		this.branchId = branchId;
		this.margin = margin;
		this.measure = measure;
		this.name = name;
		this.numParty = numParty;
		this.priceC = priceC;
		this.productId = productId;
		this.rowId = rowId;
		this.wblDate = wblDate;
		this.wblPriceC = wblPriceC;
		this.wbldPriceWithSale = wbldPriceWithSale;
		this.wbldQty = wbldQty;
	}

	public int getBranchId() {
		return this.branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public Double getMargin() {
		return this.margin;
	}

	public void setMargin(Double margin) {
		this.margin = margin;
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

	public int getNumParty() {
		return this.numParty;
	}

	public void setNumParty(int numParty) {
		this.numParty = numParty;
	}

	public Double getPriceC() {
		return this.priceC;
	}

	public void setPriceC(Double priceC) {
		this.priceC = priceC;
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

	public Timestamp getWblDate() {
		return this.wblDate;
	}

	public void setWblDate(Timestamp wblDate) {
		this.wblDate = wblDate;
	}

	public Double getWblPriceC() {
		return this.wblPriceC;
	}

	public void setWblPriceC(Double wblPriceC) {
		this.wblPriceC = wblPriceC;
	}

	public Double getWbldPriceWithSale() {
		return this.wbldPriceWithSale;
	}

	public void setWbldPriceWithSale(Double wbldPriceWithSale) {
		this.wbldPriceWithSale = wbldPriceWithSale;
	}

	public Double getWbldQty() {
		return this.wbldQty;
	}

	public void setWbldQty(Double wbldQty) {
		this.wbldQty = wbldQty;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ViewMarginId))
			return false;
		ViewMarginId castOther = (ViewMarginId) other;

		return (this.getBranchId() == castOther.getBranchId())
				&& ((this.getMargin() == castOther.getMargin()) || (this.getMargin() != null
						&& castOther.getMargin() != null && this.getMargin().equals(castOther.getMargin())))
				&& ((this.getMeasure() == castOther.getMeasure()) || (this.getMeasure() != null
						&& castOther.getMeasure() != null && this.getMeasure().equals(castOther.getMeasure())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& (this.getNumParty() == castOther.getNumParty())
				&& ((this.getPriceC() == castOther.getPriceC()) || (this.getPriceC() != null
						&& castOther.getPriceC() != null && this.getPriceC().equals(castOther.getPriceC())))
				&& (this.getProductId() == castOther.getProductId())
				&& ((this.getRowId() == castOther.getRowId()) || (this.getRowId() != null
						&& castOther.getRowId() != null && this.getRowId().equals(castOther.getRowId())))
				&& ((this.getWblDate() == castOther.getWblDate()) || (this.getWblDate() != null
						&& castOther.getWblDate() != null && this.getWblDate().equals(castOther.getWblDate())))
				&& ((this.getWblPriceC() == castOther.getWblPriceC()) || (this.getWblPriceC() != null
						&& castOther.getWblPriceC() != null && this.getWblPriceC().equals(castOther.getWblPriceC())))
				&& ((this.getWbldPriceWithSale() == castOther.getWbldPriceWithSale())
						|| (this.getWbldPriceWithSale() != null && castOther.getWbldPriceWithSale() != null
								&& this.getWbldPriceWithSale().equals(castOther.getWbldPriceWithSale())))
				&& ((this.getWbldQty() == castOther.getWbldQty()) || (this.getWbldQty() != null
						&& castOther.getWbldQty() != null && this.getWbldQty().equals(castOther.getWbldQty())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getBranchId();
		result = 37 * result + (getMargin() == null ? 0 : this.getMargin().hashCode());
		result = 37 * result + (getMeasure() == null ? 0 : this.getMeasure().hashCode());
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + this.getNumParty();
		result = 37 * result + (getPriceC() == null ? 0 : this.getPriceC().hashCode());
		result = 37 * result + this.getProductId();
		result = 37 * result + (getRowId() == null ? 0 : this.getRowId().hashCode());
		result = 37 * result + (getWblDate() == null ? 0 : this.getWblDate().hashCode());
		result = 37 * result + (getWblPriceC() == null ? 0 : this.getWblPriceC().hashCode());
		result = 37 * result + (getWbldPriceWithSale() == null ? 0 : this.getWbldPriceWithSale().hashCode());
		result = 37 * result + (getWbldQty() == null ? 0 : this.getWbldQty().hashCode());
		return result;
	}

}
