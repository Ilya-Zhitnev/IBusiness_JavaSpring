package com.entity;
// Generated 28 янв. 2024 г., 15:09:29 by Hibernate Tools 6.3.1.Final

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Invoices generated by hbm2java
 */
public class Invoices implements java.io.Serializable {

	private Integer invId;
	private Users users;
	private Status status;
	private Currency currency;
	private PriceCategories priceCategories;
	private Stores stores;
	private Customers customers;
	private Stock stock;
	private Timestamp date;
	private Serializable numberInv;
	private Serializable comments;
	private Float currencyRate;
	private boolean ready;
	private Set invoiceDetailses = new HashSet(0);

	public Invoices() {
	}

	public Invoices(Users users, Status status, Currency currency, PriceCategories priceCategories, Stores stores,
			Customers customers, Stock stock, Timestamp date, Serializable numberInv, Serializable comments,
			Float currencyRate, boolean ready, Set invoiceDetailses) {
		this.users = users;
		this.status = status;
		this.currency = currency;
		this.priceCategories = priceCategories;
		this.stores = stores;
		this.customers = customers;
		this.stock = stock;
		this.date = date;
		this.numberInv = numberInv;
		this.comments = comments;
		this.currencyRate = currencyRate;
		this.ready = ready;
		this.invoiceDetailses = invoiceDetailses;
	}

	public Integer getInvId() {
		return this.invId;
	}

	public void setInvId(Integer invId) {
		this.invId = invId;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Currency getCurrency() {
		return this.currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public PriceCategories getPriceCategories() {
		return this.priceCategories;
	}

	public void setPriceCategories(PriceCategories priceCategories) {
		this.priceCategories = priceCategories;
	}

	public Stores getStores() {
		return this.stores;
	}

	public void setStores(Stores stores) {
		this.stores = stores;
	}

	public Customers getCustomers() {
		return this.customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

	public Stock getStock() {
		return this.stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public Serializable getNumberInv() {
		return this.numberInv;
	}

	public void setNumberInv(Serializable numberInv) {
		this.numberInv = numberInv;
	}

	public Serializable getComments() {
		return this.comments;
	}

	public void setComments(Serializable comments) {
		this.comments = comments;
	}

	public Float getCurrencyRate() {
		return this.currencyRate;
	}

	public void setCurrencyRate(Float currencyRate) {
		this.currencyRate = currencyRate;
	}

	public boolean isReady() {
		return this.ready;
	}

	public void setReady(boolean ready) {
		this.ready = ready;
	}

	public Set getInvoiceDetailses() {
		return this.invoiceDetailses;
	}

	public void setInvoiceDetailses(Set invoiceDetailses) {
		this.invoiceDetailses = invoiceDetailses;
	}

}
