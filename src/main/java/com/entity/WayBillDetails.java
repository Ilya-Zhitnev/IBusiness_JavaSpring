package com.entity;
// Generated 28 янв. 2024 г., 15:09:29 by Hibernate Tools 6.3.1.Final

/**
 * WayBillDetails generated by hbm2java
 */
public class WayBillDetails implements java.io.Serializable {

	private Integer rowId;
	private Tax tax;
	private WayBills wayBills;
	private int branchId;
	private int productId;
	private int numParty;
	private Double qty;
	private Integer measure;
	private Double priceС;
	private Double procSale;
	private Double sumSale;
	private Double priceWithSale;
	private Double totalPrice;
	private Double totalPriceCur;

	public WayBillDetails() {
	}

	public WayBillDetails(Tax tax, WayBills wayBills, int branchId, int productId, int numParty, Double qty,
			Integer measure, Double priceС, Double procSale, Double sumSale, Double priceWithSale, Double totalPrice,
			Double totalPriceCur) {
		this.tax = tax;
		this.wayBills = wayBills;
		this.branchId = branchId;
		this.productId = productId;
		this.numParty = numParty;
		this.qty = qty;
		this.measure = measure;
		this.priceС = priceС;
		this.procSale = procSale;
		this.sumSale = sumSale;
		this.priceWithSale = priceWithSale;
		this.totalPrice = totalPrice;
		this.totalPriceCur = totalPriceCur;
	}

	public Integer getRowId() {
		return this.rowId;
	}

	public void setRowId(Integer rowId) {
		this.rowId = rowId;
	}

	public Tax getTax() {
		return this.tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public WayBills getWayBills() {
		return this.wayBills;
	}

	public void setWayBills(WayBills wayBills) {
		this.wayBills = wayBills;
	}

	public int getBranchId() {
		return this.branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getNumParty() {
		return this.numParty;
	}

	public void setNumParty(int numParty) {
		this.numParty = numParty;
	}

	public Double getQty() {
		return this.qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Integer getMeasure() {
		return this.measure;
	}

	public void setMeasure(Integer measure) {
		this.measure = measure;
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

	public Double getSumSale() {
		return this.sumSale;
	}

	public void setSumSale(Double sumSale) {
		this.sumSale = sumSale;
	}

	public Double getPriceWithSale() {
		return this.priceWithSale;
	}

	public void setPriceWithSale(Double priceWithSale) {
		this.priceWithSale = priceWithSale;
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

}