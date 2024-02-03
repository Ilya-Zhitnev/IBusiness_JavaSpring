package com.entity;
// Generated 28 янв. 2024 г., 15:09:29 by Hibernate Tools 6.3.1.Final

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Genre generated by hbm2java
 */
public class Genre implements java.io.Serializable {

	private Integer uid;
	private Serializable name;
	private Serializable description;
	private Boolean audio;
	private Boolean video;
	private Boolean otherProduct;
	private Set genreProducts = new HashSet(0);

	public Genre() {
	}

	public Genre(Serializable name, Serializable description, Boolean audio, Boolean video, Boolean otherProduct,
			Set genreProducts) {
		this.name = name;
		this.description = description;
		this.audio = audio;
		this.video = video;
		this.otherProduct = otherProduct;
		this.genreProducts = genreProducts;
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

	public Serializable getDescription() {
		return this.description;
	}

	public void setDescription(Serializable description) {
		this.description = description;
	}

	public Boolean getAudio() {
		return this.audio;
	}

	public void setAudio(Boolean audio) {
		this.audio = audio;
	}

	public Boolean getVideo() {
		return this.video;
	}

	public void setVideo(Boolean video) {
		this.video = video;
	}

	public Boolean getOtherProduct() {
		return this.otherProduct;
	}

	public void setOtherProduct(Boolean otherProduct) {
		this.otherProduct = otherProduct;
	}

	public Set getGenreProducts() {
		return this.genreProducts;
	}

	public void setGenreProducts(Set genreProducts) {
		this.genreProducts = genreProducts;
	}

}
