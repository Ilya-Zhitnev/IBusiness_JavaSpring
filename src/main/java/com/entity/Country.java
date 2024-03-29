package com.entity;
// Generated 28 янв. 2024 г., 15:09:29 by Hibernate Tools 6.3.1.Final

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Country generated by hbm2java
 */
public class Country implements java.io.Serializable {

	private int countryId;
	private Serializable countryName;
	private Serializable symbol;
	private Double worldId;
	private Serializable symbolWms;
	private Set productses = new HashSet(0);
	private Set customerses = new HashSet(0);

	public Country() {
	}

	public Country(int countryId, Serializable countryName, Serializable symbol, Double worldId, Serializable symbolWms,
			Set productses, Set customerses) {
		this.countryId = countryId;
		this.countryName = countryName;
		this.symbol = symbol;
		this.worldId = worldId;
		this.symbolWms = symbolWms;
		this.productses = productses;
		this.customerses = customerses;
	}

	public int getCountryId() {
		return this.countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public Serializable getCountryName() {
		return this.countryName;
	}

	public void setCountryName(Serializable countryName) {
		this.countryName = countryName;
	}

	public Serializable getSymbol() {
		return this.symbol;
	}

	public void setSymbol(Serializable symbol) {
		this.symbol = symbol;
	}

	public Double getWorldId() {
		return this.worldId;
	}

	public void setWorldId(Double worldId) {
		this.worldId = worldId;
	}

	public Serializable getSymbolWms() {
		return this.symbolWms;
	}

	public void setSymbolWms(Serializable symbolWms) {
		this.symbolWms = symbolWms;
	}

	public Set getProductses() {
		return this.productses;
	}

	public void setProductses(Set productses) {
		this.productses = productses;
	}

	public Set getCustomerses() {
		return this.customerses;
	}

	public void setCustomerses(Set customerses) {
		this.customerses = customerses;
	}

}
