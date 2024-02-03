package com.entity;
// Generated 28 янв. 2024 г., 15:09:29 by Hibernate Tools 6.3.1.Final

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Incomes generated by hbm2java
 */
public class Incomes implements java.io.Serializable {

	private Integer incId;
	private Users users;
	private Status status;
	private Currency currency;
	private Stores stores;
	private Customers customers;
	private Stock stock;
	private Timestamp wayBillDate;
	private Timestamp incomeDate;
	private Serializable numberIncomes;
	private Serializable comments;
	private Float currencyRate;
	private boolean ready;
	private Set incomeDetailses = new HashSet(0);

	public Incomes() {
	}

	public Incomes(Users users, Status status, Currency currency, Stores stores, Customers customers, Stock stock,
			Timestamp wayBillDate, Timestamp incomeDate, Serializable numberIncomes, Serializable comments,
			Float currencyRate, boolean ready, Set incomeDetailses) {
		this.users = users;
		this.status = status;
		this.currency = currency;
		this.stores = stores;
		this.customers = customers;
		this.stock = stock;
		this.wayBillDate = wayBillDate;
		this.incomeDate = incomeDate;
		this.numberIncomes = numberIncomes;
		this.comments = comments;
		this.currencyRate = currencyRate;
		this.ready = ready;
		this.incomeDetailses = incomeDetailses;
	}

	public Integer getIncId() {
		return this.incId;
	}

	public void setIncId(Integer incId) {
		this.incId = incId;
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

	public Timestamp getWayBillDate() {
		return this.wayBillDate;
	}

	public void setWayBillDate(Timestamp wayBillDate) {
		this.wayBillDate = wayBillDate;
	}

	public Timestamp getIncomeDate() {
		return this.incomeDate;
	}

	public void setIncomeDate(Timestamp incomeDate) {
		this.incomeDate = incomeDate;
	}

	public Serializable getNumberIncomes() {
		return this.numberIncomes;
	}

	public void setNumberIncomes(Serializable numberIncomes) {
		this.numberIncomes = numberIncomes;
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

	public Set getIncomeDetailses() {
		return this.incomeDetailses;
	}

	public void setIncomeDetailses(Set incomeDetailses) {
		this.incomeDetailses = incomeDetailses;
	}

}
