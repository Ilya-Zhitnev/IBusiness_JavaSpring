package com.entity;
// Generated 28 янв. 2024 г., 15:09:29 by Hibernate Tools 6.3.1.Final

import java.io.Serializable;

/**
 * ViewInvoceDetailsId generated by hbm2java
 */
public class ViewInvoceDetailsId implements java.io.Serializable {

	private Serializable bar;
	private int branchId;
	private int id;
	private Integer invId;
	private Serializable measure;
	private Serializable name;
	private int numParty;
	private Double priceWithSale;
	private Double priceС;
	private Double procSale;
	private int productId;
	private Double qty;
	private Double sumSale;
	private Integer tax;
	private Double totalPrice;
	private Double totalPriceCur;

	public ViewInvoceDetailsId() {
	}

	public ViewInvoceDetailsId(Serializable bar, int branchId, int id, Integer invId, Serializable measure,
			Serializable name, int numParty, Double priceWithSale, Double priceС, Double procSale, int productId,
			Double qty, Double sumSale, Integer tax, Double totalPrice, Double totalPriceCur) {
		this.bar = bar;
		this.branchId = branchId;
		this.id = id;
		this.invId = invId;
		this.measure = measure;
		this.name = name;
		this.numParty = numParty;
		this.priceWithSale = priceWithSale;
		this.priceС = priceС;
		this.procSale = procSale;
		this.productId = productId;
		this.qty = qty;
		this.sumSale = sumSale;
		this.tax = tax;
		this.totalPrice = totalPrice;
		this.totalPriceCur = totalPriceCur;
	}

	public Serializable getBar() {
		return this.bar;
	}

	public void setBar(Serializable bar) {
		this.bar = bar;
	}

	public int getBranchId() {
		return this.branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getInvId() {
		return this.invId;
	}

	public void setInvId(Integer invId) {
		this.invId = invId;
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

	public Double getPriceWithSale() {
		return this.priceWithSale;
	}

	public void setPriceWithSale(Double priceWithSale) {
		this.priceWithSale = priceWithSale;
	}

	public Double getPriceС() {
		return this.priceС;
	}

	public void setPriceС(Double priceС) {
		this.priceС = priceС;
	}

	public Double getProcSale() {
		return this.procSale;
	}

	public void setProcSale(Double procSale) {
		this.procSale = procSale;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Double getQty() {
		return this.qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Double getSumSale() {
		return this.sumSale;
	}

	public void setSumSale(Double sumSale) {
		this.sumSale = sumSale;
	}

	public Integer getTax() {
		return this.tax;
	}

	public void setTax(Integer tax) {
		this.tax = tax;
	}

	public Double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Double getTotalPriceCur() {
		return this.totalPriceCur;
	}

	public void setTotalPriceCur(Double totalPriceCur) {
		this.totalPriceCur = totalPriceCur;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ViewInvoceDetailsId))
			return false;
		ViewInvoceDetailsId castOther = (ViewInvoceDetailsId) other;

		return ((this.getBar() == castOther.getBar())
				|| (this.getBar() != null && castOther.getBar() != null && this.getBar().equals(castOther.getBar())))
				&& (this.getBranchId() == castOther.getBranchId()) && (this.getId() == castOther.getId())
				&& ((this.getInvId() == castOther.getInvId()) || (this.getInvId() != null
						&& castOther.getInvId() != null && this.getInvId().equals(castOther.getInvId())))
				&& ((this.getMeasure() == castOther.getMeasure()) || (this.getMeasure() != null
						&& castOther.getMeasure() != null && this.getMeasure().equals(castOther.getMeasure())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& (this.getNumParty() == castOther.getNumParty())
				&& ((this.getPriceWithSale() == castOther.getPriceWithSale())
						|| (this.getPriceWithSale() != null && castOther.getPriceWithSale() != null
								&& this.getPriceWithSale().equals(castOther.getPriceWithSale())))
				&& ((this.getPriceС() == castOther.getPriceС()) || (this.getPriceС() != null
						&& castOther.getPriceС() != null && this.getPriceС().equals(castOther.getPriceС())))
				&& ((this.getProcSale() == castOther.getProcSale()) || (this.getProcSale() != null
						&& castOther.getProcSale() != null && this.getProcSale().equals(castOther.getProcSale())))
				&& (this.getProductId() == castOther.getProductId())
				&& ((this.getQty() == castOther.getQty()) || (this.getQty() != null && castOther.getQty() != null
						&& this.getQty().equals(castOther.getQty())))
				&& ((this.getSumSale() == castOther.getSumSale()) || (this.getSumSale() != null
						&& castOther.getSumSale() != null && this.getSumSale().equals(castOther.getSumSale())))
				&& ((this.getTax() == castOther.getTax()) || (this.getTax() != null && castOther.getTax() != null
						&& this.getTax().equals(castOther.getTax())))
				&& ((this.getTotalPrice() == castOther.getTotalPrice()) || (this.getTotalPrice() != null
						&& castOther.getTotalPrice() != null && this.getTotalPrice().equals(castOther.getTotalPrice())))
				&& ((this.getTotalPriceCur() == castOther.getTotalPriceCur())
						|| (this.getTotalPriceCur() != null && castOther.getTotalPriceCur() != null
								&& this.getTotalPriceCur().equals(castOther.getTotalPriceCur())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBar() == null ? 0 : this.getBar().hashCode());
		result = 37 * result + this.getBranchId();
		result = 37 * result + this.getId();
		result = 37 * result + (getInvId() == null ? 0 : this.getInvId().hashCode());
		result = 37 * result + (getMeasure() == null ? 0 : this.getMeasure().hashCode());
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + this.getNumParty();
		result = 37 * result + (getPriceWithSale() == null ? 0 : this.getPriceWithSale().hashCode());
		result = 37 * result + (getPriceС() == null ? 0 : this.getPriceС().hashCode());
		result = 37 * result + (getProcSale() == null ? 0 : this.getProcSale().hashCode());
		result = 37 * result + this.getProductId();
		result = 37 * result + (getQty() == null ? 0 : this.getQty().hashCode());
		result = 37 * result + (getSumSale() == null ? 0 : this.getSumSale().hashCode());
		result = 37 * result + (getTax() == null ? 0 : this.getTax().hashCode());
		result = 37 * result + (getTotalPrice() == null ? 0 : this.getTotalPrice().hashCode());
		result = 37 * result + (getTotalPriceCur() == null ? 0 : this.getTotalPriceCur().hashCode());
		return result;
	}

}
