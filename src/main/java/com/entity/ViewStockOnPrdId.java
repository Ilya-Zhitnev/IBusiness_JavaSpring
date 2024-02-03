package com.entity;
// Generated 28 янв. 2024 г., 15:09:29 by Hibernate Tools 6.3.1.Final

import java.io.Serializable;

/**
 * ViewStockOnPrdId generated by hbm2java
 */
public class ViewStockOnPrdId implements java.io.Serializable {

	private Serializable avtor;
	private int branchId;
	private Serializable measure;
	private Serializable name;
	private int productId;
	private Double qtyInc;
	private Double qtyInv;
	private Double qtyStock;
	private Double qtyStockInv;
	private Double qtyWbl;
	private Integer stock;
	private Integer stores;

	public ViewStockOnPrdId() {
	}

	public ViewStockOnPrdId(Serializable avtor, int branchId, Serializable measure, Serializable name, int productId,
			Double qtyInc, Double qtyInv, Double qtyStock, Double qtyStockInv, Double qtyWbl, Integer stock,
			Integer stores) {
		this.avtor = avtor;
		this.branchId = branchId;
		this.measure = measure;
		this.name = name;
		this.productId = productId;
		this.qtyInc = qtyInc;
		this.qtyInv = qtyInv;
		this.qtyStock = qtyStock;
		this.qtyStockInv = qtyStockInv;
		this.qtyWbl = qtyWbl;
		this.stock = stock;
		this.stores = stores;
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

	public Double getQtyInc() {
		return this.qtyInc;
	}

	public void setQtyInc(Double qtyInc) {
		this.qtyInc = qtyInc;
	}

	public Double getQtyInv() {
		return this.qtyInv;
	}

	public void setQtyInv(Double qtyInv) {
		this.qtyInv = qtyInv;
	}

	public Double getQtyStock() {
		return this.qtyStock;
	}

	public void setQtyStock(Double qtyStock) {
		this.qtyStock = qtyStock;
	}

	public Double getQtyStockInv() {
		return this.qtyStockInv;
	}

	public void setQtyStockInv(Double qtyStockInv) {
		this.qtyStockInv = qtyStockInv;
	}

	public Double getQtyWbl() {
		return this.qtyWbl;
	}

	public void setQtyWbl(Double qtyWbl) {
		this.qtyWbl = qtyWbl;
	}

	public Integer getStock() {
		return this.stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getStores() {
		return this.stores;
	}

	public void setStores(Integer stores) {
		this.stores = stores;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ViewStockOnPrdId))
			return false;
		ViewStockOnPrdId castOther = (ViewStockOnPrdId) other;

		return ((this.getAvtor() == castOther.getAvtor()) || (this.getAvtor() != null && castOther.getAvtor() != null
				&& this.getAvtor().equals(castOther.getAvtor())))
				&& (this.getBranchId() == castOther.getBranchId())
				&& ((this.getMeasure() == castOther.getMeasure()) || (this.getMeasure() != null
						&& castOther.getMeasure() != null && this.getMeasure().equals(castOther.getMeasure())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& (this.getProductId() == castOther.getProductId())
				&& ((this.getQtyInc() == castOther.getQtyInc()) || (this.getQtyInc() != null
						&& castOther.getQtyInc() != null && this.getQtyInc().equals(castOther.getQtyInc())))
				&& ((this.getQtyInv() == castOther.getQtyInv()) || (this.getQtyInv() != null
						&& castOther.getQtyInv() != null && this.getQtyInv().equals(castOther.getQtyInv())))
				&& ((this.getQtyStock() == castOther.getQtyStock()) || (this.getQtyStock() != null
						&& castOther.getQtyStock() != null && this.getQtyStock().equals(castOther.getQtyStock())))
				&& ((this.getQtyStockInv() == castOther.getQtyStockInv())
						|| (this.getQtyStockInv() != null && castOther.getQtyStockInv() != null
								&& this.getQtyStockInv().equals(castOther.getQtyStockInv())))
				&& ((this.getQtyWbl() == castOther.getQtyWbl()) || (this.getQtyWbl() != null
						&& castOther.getQtyWbl() != null && this.getQtyWbl().equals(castOther.getQtyWbl())))
				&& ((this.getStock() == castOther.getStock()) || (this.getStock() != null
						&& castOther.getStock() != null && this.getStock().equals(castOther.getStock())))
				&& ((this.getStores() == castOther.getStores()) || (this.getStores() != null
						&& castOther.getStores() != null && this.getStores().equals(castOther.getStores())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAvtor() == null ? 0 : this.getAvtor().hashCode());
		result = 37 * result + this.getBranchId();
		result = 37 * result + (getMeasure() == null ? 0 : this.getMeasure().hashCode());
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + this.getProductId();
		result = 37 * result + (getQtyInc() == null ? 0 : this.getQtyInc().hashCode());
		result = 37 * result + (getQtyInv() == null ? 0 : this.getQtyInv().hashCode());
		result = 37 * result + (getQtyStock() == null ? 0 : this.getQtyStock().hashCode());
		result = 37 * result + (getQtyStockInv() == null ? 0 : this.getQtyStockInv().hashCode());
		result = 37 * result + (getQtyWbl() == null ? 0 : this.getQtyWbl().hashCode());
		result = 37 * result + (getStock() == null ? 0 : this.getStock().hashCode());
		result = 37 * result + (getStores() == null ? 0 : this.getStores().hashCode());
		return result;
	}

}