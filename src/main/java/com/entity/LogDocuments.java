package com.entity;
// Generated 28 янв. 2024 г., 15:09:29 by Hibernate Tools 6.3.1.Final

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * LogDocuments generated by hbm2java
 */
public class LogDocuments implements java.io.Serializable {

	private Integer id;
	private Timestamp datetime;
	private Serializable operation;
	private String documents;
	private String docId;
	private Timestamp dateDoc;
	private Integer customerId;
	private Integer status;
	private Integer user;
	private Integer stores;
	private Integer stock;

	public LogDocuments() {
	}

	public LogDocuments(Timestamp datetime, Serializable operation, String documents, String docId, Timestamp dateDoc,
			Integer customerId, Integer status, Integer user, Integer stores, Integer stock) {
		this.datetime = datetime;
		this.operation = operation;
		this.documents = documents;
		this.docId = docId;
		this.dateDoc = dateDoc;
		this.customerId = customerId;
		this.status = status;
		this.user = user;
		this.stores = stores;
		this.stock = stock;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getDatetime() {
		return this.datetime;
	}

	public void setDatetime(Timestamp datetime) {
		this.datetime = datetime;
	}

	public Serializable getOperation() {
		return this.operation;
	}

	public void setOperation(Serializable operation) {
		this.operation = operation;
	}

	public String getDocuments() {
		return this.documents;
	}

	public void setDocuments(String documents) {
		this.documents = documents;
	}

	public String getDocId() {
		return this.docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public Timestamp getDateDoc() {
		return this.dateDoc;
	}

	public void setDateDoc(Timestamp dateDoc) {
		this.dateDoc = dateDoc;
	}

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getUser() {
		return this.user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	public Integer getStores() {
		return this.stores;
	}

	public void setStores(Integer stores) {
		this.stores = stores;
	}

	public Integer getStock() {
		return this.stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

}
