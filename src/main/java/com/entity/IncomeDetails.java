package com.entity;
// Generated 28 янв. 2024 г., 15:09:29 by Hibernate Tools 6.3.1.Final

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "IncomeDetails", schema = "dbo", catalog = "AVBusiness")
public class IncomeDetails {

	@Id
	private Integer numParty;
	
	private int incId;
	private int branchId;
	private int productId;
	private Double qty;
	private Integer measure;
	private Double priceC;
	private Double priceCallowance;
	private Double sumPriceCr;
	private Double wholeSaleSurcharge;
	private Double sumWprice;
	private Double taxSumR;
	private Double taxSumW;
	private Double totalPriceR;
	private Double totalPriceCurR;
	private Double totalPriceW;
	private Double totalPriceCurW;
	private Boolean prod;
	
	@ManyToOne
	@JoinColumn(name="tax")
	private Tax tax;

	@Column(name = "[NumParty]", unique = true, nullable = false)
	public Integer getNumParty() {
		return this.numParty;
	}

	public void setNumParty(Integer numParty) {
		this.numParty = numParty;
	}

	//@Column(name="Tax")
	public Tax getTax() {
		return this.tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public int getIncomes() {
		return this.incId;
	}

	public void setIncomes(int incId) {
		this.incId = incId;
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

	public Double getPriceC() {
		return this.priceC;
	}

	public void setPriceC(Double priceC) {
		this.priceC = priceC;
	}

	public Double getPriceCallowance() {
		return this.priceCallowance;
	}

	public void setPriceCallowance(Double priceCallowance) {
		this.priceCallowance = priceCallowance;
	}

	public Double getSumPriceCr() {
		return this.sumPriceCr;
	}

	public void setSumPriceCr(Double sumPriceCr) {
		this.sumPriceCr = sumPriceCr;
	}

	public Double getWholeSaleSurcharge() {
		return this.wholeSaleSurcharge;
	}

	public void setWholeSaleSurcharge(Double wholeSaleSurcharge) {
		this.wholeSaleSurcharge = wholeSaleSurcharge;
	}

	public Double getSumWprice() {
		return this.sumWprice;
	}

	public void setSumWprice(Double sumWprice) {
		this.sumWprice = sumWprice;
	}

	public Double getTaxSumR() {
		return this.taxSumR;
	}

	public void setTaxSumR(Double taxSumR) {
		this.taxSumR = taxSumR;
	}

	public Double getTaxSumW() {
		return this.taxSumW;
	}

	public void setTaxSumW(Double taxSumW) {
		this.taxSumW = taxSumW;
	}

	public Double getTotalPriceR() {
		return this.totalPriceR;
	}

	public void setTotalPriceR(Double totalPriceR) {
		this.totalPriceR = totalPriceR;
	}

	public Double getTotalPriceCurR() {
		return this.totalPriceCurR;
	}

	public void setTotalPriceCurR(Double totalPriceCurR) {
		this.totalPriceCurR = totalPriceCurR;
	}

	public Double getTotalPriceW() {
		return this.totalPriceW;
	}

	public void setTotalPriceW(Double totalPriceW) {
		this.totalPriceW = totalPriceW;
	}

	public Double getTotalPriceCurW() {
		return this.totalPriceCurW;
	}

	public void setTotalPriceCurW(Double totalPriceCurW) {
		this.totalPriceCurW = totalPriceCurW;
	}

	public Boolean getProd() {
		return this.prod;
	}

	public void setProd(Boolean prod) {
		this.prod = prod;
	}

}
