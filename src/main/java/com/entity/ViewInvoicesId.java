package com.entity;
// Generated 28 янв. 2024 г., 15:09:29 by Hibernate Tools 6.3.1.Final

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * ViewInvoicesId generated by hbm2java
 */
public class ViewInvoicesId implements java.io.Serializable {

	private Serializable adress;
	private Serializable adressTwo;
	private Serializable bank;
	private Serializable bic;
	private Serializable comments;
	private Serializable country;
	private Integer currency;
	private Float currencyRate;
	private Integer customers;
	private Timestamp date;
	private Date endDate;
	private int invId;
	private Serializable name;
	private Serializable number;
	private Serializable numberInv;
	private Serializable ownerMini;
	private Serializable paymentAcc;
	private Serializable phone;
	private Integer priceCategories;
	private boolean ready;
	private Integer status;
	private Integer stock;
	private Integer stores;
	private Integer user;
	private Serializable yhh;

	public ViewInvoicesId() {
	}

	public ViewInvoicesId(Serializable adress, Serializable adressTwo, Serializable bank, Serializable bic,
			Serializable comments, Serializable country, Integer currency, Float currencyRate, Integer customers,
			Timestamp date, Date endDate, int invId, Serializable name, Serializable number, Serializable numberInv,
			Serializable ownerMini, Serializable paymentAcc, Serializable phone, Integer priceCategories, boolean ready,
			Integer status, Integer stock, Integer stores, Integer user, Serializable yhh) {
		this.adress = adress;
		this.adressTwo = adressTwo;
		this.bank = bank;
		this.bic = bic;
		this.comments = comments;
		this.country = country;
		this.currency = currency;
		this.currencyRate = currencyRate;
		this.customers = customers;
		this.date = date;
		this.endDate = endDate;
		this.invId = invId;
		this.name = name;
		this.number = number;
		this.numberInv = numberInv;
		this.ownerMini = ownerMini;
		this.paymentAcc = paymentAcc;
		this.phone = phone;
		this.priceCategories = priceCategories;
		this.ready = ready;
		this.status = status;
		this.stock = stock;
		this.stores = stores;
		this.user = user;
		this.yhh = yhh;
	}

	public Serializable getAdress() {
		return this.adress;
	}

	public void setAdress(Serializable adress) {
		this.adress = adress;
	}

	public Serializable getAdressTwo() {
		return this.adressTwo;
	}

	public void setAdressTwo(Serializable adressTwo) {
		this.adressTwo = adressTwo;
	}

	public Serializable getBank() {
		return this.bank;
	}

	public void setBank(Serializable bank) {
		this.bank = bank;
	}

	public Serializable getBic() {
		return this.bic;
	}

	public void setBic(Serializable bic) {
		this.bic = bic;
	}

	public Serializable getComments() {
		return this.comments;
	}

	public void setComments(Serializable comments) {
		this.comments = comments;
	}

	public Serializable getCountry() {
		return this.country;
	}

	public void setCountry(Serializable country) {
		this.country = country;
	}

	public Integer getCurrency() {
		return this.currency;
	}

	public void setCurrency(Integer currency) {
		this.currency = currency;
	}

	public Float getCurrencyRate() {
		return this.currencyRate;
	}

	public void setCurrencyRate(Float currencyRate) {
		this.currencyRate = currencyRate;
	}

	public Integer getCustomers() {
		return this.customers;
	}

	public void setCustomers(Integer customers) {
		this.customers = customers;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getInvId() {
		return this.invId;
	}

	public void setInvId(int invId) {
		this.invId = invId;
	}

	public Serializable getName() {
		return this.name;
	}

	public void setName(Serializable name) {
		this.name = name;
	}

	public Serializable getNumber() {
		return this.number;
	}

	public void setNumber(Serializable number) {
		this.number = number;
	}

	public Serializable getNumberInv() {
		return this.numberInv;
	}

	public void setNumberInv(Serializable numberInv) {
		this.numberInv = numberInv;
	}

	public Serializable getOwnerMini() {
		return this.ownerMini;
	}

	public void setOwnerMini(Serializable ownerMini) {
		this.ownerMini = ownerMini;
	}

	public Serializable getPaymentAcc() {
		return this.paymentAcc;
	}

	public void setPaymentAcc(Serializable paymentAcc) {
		this.paymentAcc = paymentAcc;
	}

	public Serializable getPhone() {
		return this.phone;
	}

	public void setPhone(Serializable phone) {
		this.phone = phone;
	}

	public Integer getPriceCategories() {
		return this.priceCategories;
	}

	public void setPriceCategories(Integer priceCategories) {
		this.priceCategories = priceCategories;
	}

	public boolean isReady() {
		return this.ready;
	}

	public void setReady(boolean ready) {
		this.ready = ready;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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

	public Integer getUser() {
		return this.user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	public Serializable getYhh() {
		return this.yhh;
	}

	public void setYhh(Serializable yhh) {
		this.yhh = yhh;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ViewInvoicesId))
			return false;
		ViewInvoicesId castOther = (ViewInvoicesId) other;

		return ((this.getAdress() == castOther.getAdress()) || (this.getAdress() != null
				&& castOther.getAdress() != null && this.getAdress().equals(castOther.getAdress())))
				&& ((this.getAdressTwo() == castOther.getAdressTwo()) || (this.getAdressTwo() != null
						&& castOther.getAdressTwo() != null && this.getAdressTwo().equals(castOther.getAdressTwo())))
				&& ((this.getBank() == castOther.getBank()) || (this.getBank() != null && castOther.getBank() != null
						&& this.getBank().equals(castOther.getBank())))
				&& ((this.getBic() == castOther.getBic()) || (this.getBic() != null && castOther.getBic() != null
						&& this.getBic().equals(castOther.getBic())))
				&& ((this.getComments() == castOther.getComments()) || (this.getComments() != null
						&& castOther.getComments() != null && this.getComments().equals(castOther.getComments())))
				&& ((this.getCountry() == castOther.getCountry()) || (this.getCountry() != null
						&& castOther.getCountry() != null && this.getCountry().equals(castOther.getCountry())))
				&& ((this.getCurrency() == castOther.getCurrency()) || (this.getCurrency() != null
						&& castOther.getCurrency() != null && this.getCurrency().equals(castOther.getCurrency())))
				&& ((this.getCurrencyRate() == castOther.getCurrencyRate())
						|| (this.getCurrencyRate() != null && castOther.getCurrencyRate() != null
								&& this.getCurrencyRate().equals(castOther.getCurrencyRate())))
				&& ((this.getCustomers() == castOther.getCustomers()) || (this.getCustomers() != null
						&& castOther.getCustomers() != null && this.getCustomers().equals(castOther.getCustomers())))
				&& ((this.getDate() == castOther.getDate()) || (this.getDate() != null && castOther.getDate() != null
						&& this.getDate().equals(castOther.getDate())))
				&& ((this.getEndDate() == castOther.getEndDate()) || (this.getEndDate() != null
						&& castOther.getEndDate() != null && this.getEndDate().equals(castOther.getEndDate())))
				&& (this.getInvId() == castOther.getInvId())
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& ((this.getNumber() == castOther.getNumber()) || (this.getNumber() != null
						&& castOther.getNumber() != null && this.getNumber().equals(castOther.getNumber())))
				&& ((this.getNumberInv() == castOther.getNumberInv()) || (this.getNumberInv() != null
						&& castOther.getNumberInv() != null && this.getNumberInv().equals(castOther.getNumberInv())))
				&& ((this.getOwnerMini() == castOther.getOwnerMini()) || (this.getOwnerMini() != null
						&& castOther.getOwnerMini() != null && this.getOwnerMini().equals(castOther.getOwnerMini())))
				&& ((this.getPaymentAcc() == castOther.getPaymentAcc()) || (this.getPaymentAcc() != null
						&& castOther.getPaymentAcc() != null && this.getPaymentAcc().equals(castOther.getPaymentAcc())))
				&& ((this.getPhone() == castOther.getPhone()) || (this.getPhone() != null
						&& castOther.getPhone() != null && this.getPhone().equals(castOther.getPhone())))
				&& ((this.getPriceCategories() == castOther.getPriceCategories())
						|| (this.getPriceCategories() != null && castOther.getPriceCategories() != null
								&& this.getPriceCategories().equals(castOther.getPriceCategories())))
				&& (this.isReady() == castOther.isReady())
				&& ((this.getStatus() == castOther.getStatus()) || (this.getStatus() != null
						&& castOther.getStatus() != null && this.getStatus().equals(castOther.getStatus())))
				&& ((this.getStock() == castOther.getStock()) || (this.getStock() != null
						&& castOther.getStock() != null && this.getStock().equals(castOther.getStock())))
				&& ((this.getStores() == castOther.getStores()) || (this.getStores() != null
						&& castOther.getStores() != null && this.getStores().equals(castOther.getStores())))
				&& ((this.getUser() == castOther.getUser()) || (this.getUser() != null && castOther.getUser() != null
						&& this.getUser().equals(castOther.getUser())))
				&& ((this.getYhh() == castOther.getYhh()) || (this.getYhh() != null && castOther.getYhh() != null
						&& this.getYhh().equals(castOther.getYhh())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAdress() == null ? 0 : this.getAdress().hashCode());
		result = 37 * result + (getAdressTwo() == null ? 0 : this.getAdressTwo().hashCode());
		result = 37 * result + (getBank() == null ? 0 : this.getBank().hashCode());
		result = 37 * result + (getBic() == null ? 0 : this.getBic().hashCode());
		result = 37 * result + (getComments() == null ? 0 : this.getComments().hashCode());
		result = 37 * result + (getCountry() == null ? 0 : this.getCountry().hashCode());
		result = 37 * result + (getCurrency() == null ? 0 : this.getCurrency().hashCode());
		result = 37 * result + (getCurrencyRate() == null ? 0 : this.getCurrencyRate().hashCode());
		result = 37 * result + (getCustomers() == null ? 0 : this.getCustomers().hashCode());
		result = 37 * result + (getDate() == null ? 0 : this.getDate().hashCode());
		result = 37 * result + (getEndDate() == null ? 0 : this.getEndDate().hashCode());
		result = 37 * result + this.getInvId();
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getNumber() == null ? 0 : this.getNumber().hashCode());
		result = 37 * result + (getNumberInv() == null ? 0 : this.getNumberInv().hashCode());
		result = 37 * result + (getOwnerMini() == null ? 0 : this.getOwnerMini().hashCode());
		result = 37 * result + (getPaymentAcc() == null ? 0 : this.getPaymentAcc().hashCode());
		result = 37 * result + (getPhone() == null ? 0 : this.getPhone().hashCode());
		result = 37 * result + (getPriceCategories() == null ? 0 : this.getPriceCategories().hashCode());
		result = 37 * result + (this.isReady() ? 1 : 0);
		result = 37 * result + (getStatus() == null ? 0 : this.getStatus().hashCode());
		result = 37 * result + (getStock() == null ? 0 : this.getStock().hashCode());
		result = 37 * result + (getStores() == null ? 0 : this.getStores().hashCode());
		result = 37 * result + (getUser() == null ? 0 : this.getUser().hashCode());
		result = 37 * result + (getYhh() == null ? 0 : this.getYhh().hashCode());
		return result;
	}

}
