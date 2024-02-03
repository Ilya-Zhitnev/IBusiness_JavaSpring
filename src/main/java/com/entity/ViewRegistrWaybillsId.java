package com.entity;
// Generated 28 янв. 2024 г., 15:09:29 by Hibernate Tools 6.3.1.Final

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * ViewRegistrWaybillsId generated by hbm2java
 */
public class ViewRegistrWaybillsId implements java.io.Serializable {

	private int branchId;
	private Timestamp date;
	private Serializable measure;
	private Serializable name;
	private int numParty;
	private int productId;
	private Double qty;
	private int wayBid;

	public ViewRegistrWaybillsId() {
	}

	public ViewRegistrWaybillsId(int branchId, Timestamp date, Serializable measure, Serializable name, int numParty,
			int productId, Double qty, int wayBid) {
		this.branchId = branchId;
		this.date = date;
		this.measure = measure;
		this.name = name;
		this.numParty = numParty;
		this.productId = productId;
		this.qty = qty;
		this.wayBid = wayBid;
	}

	public int getBranchId() {
		return this.branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
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

	public int getWayBid() {
		return this.wayBid;
	}

	public void setWayBid(int wayBid) {
		this.wayBid = wayBid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ViewRegistrWaybillsId))
			return false;
		ViewRegistrWaybillsId castOther = (ViewRegistrWaybillsId) other;

		return (this.getBranchId() == castOther.getBranchId())
				&& ((this.getDate() == castOther.getDate()) || (this.getDate() != null && castOther.getDate() != null
						&& this.getDate().equals(castOther.getDate())))
				&& ((this.getMeasure() == castOther.getMeasure()) || (this.getMeasure() != null
						&& castOther.getMeasure() != null && this.getMeasure().equals(castOther.getMeasure())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& (this.getNumParty() == castOther.getNumParty()) && (this.getProductId() == castOther.getProductId())
				&& ((this.getQty() == castOther.getQty()) || (this.getQty() != null && castOther.getQty() != null
						&& this.getQty().equals(castOther.getQty())))
				&& (this.getWayBid() == castOther.getWayBid());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getBranchId();
		result = 37 * result + (getDate() == null ? 0 : this.getDate().hashCode());
		result = 37 * result + (getMeasure() == null ? 0 : this.getMeasure().hashCode());
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + this.getNumParty();
		result = 37 * result + this.getProductId();
		result = 37 * result + (getQty() == null ? 0 : this.getQty().hashCode());
		result = 37 * result + this.getWayBid();
		return result;
	}

}
