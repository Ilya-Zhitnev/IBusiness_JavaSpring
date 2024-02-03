package com.dto;



import lombok.Data;

@Data
public class TaxDTO {

	/*
	 * public Serializable Name; public Serializable Description; public Integer
	 * Branch;
	 * 
	 * private Integer Measure; private Integer Qty; private Integer Sert; private
	 * Integer Country;
	 */
	
	//private int IdTax;
	private Float Percent;
	private String MiniDescription;
	private String FullDescription;


}
