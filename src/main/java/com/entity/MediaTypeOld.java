package com.entity;
// Generated 28 янв. 2024 г., 15:09:29 by Hibernate Tools 6.3.1.Final

import java.io.Serializable;

/**
 * MediaTypeOld generated by hbm2java
 */
public class MediaTypeOld implements java.io.Serializable {

	private Integer uid;
	private Serializable name;

	public MediaTypeOld() {
	}

	public MediaTypeOld(Serializable name) {
		this.name = name;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Serializable getName() {
		return this.name;
	}

	public void setName(Serializable name) {
		this.name = name;
	}

}
