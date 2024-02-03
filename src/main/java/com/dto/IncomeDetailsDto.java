package com.dto;


import lombok.Data;
import com.entity.Tax;

@Data
public class IncomeDetailsDto {
	
	private int Incomes;
	private int BranchId;
	private int ProductId;
	private Double Qty;
	private Integer Measure;
	private Double PriceC;
	private Double PriceCallowance;
	private Double SumPriceCr;
	private Double WholeSaleSurcharge;
	private Double SumWprice;
	private Double TaxSumR;
	private Double TaxSumW;
	private Double TotalPriceR;
	private Double TotalPriceCurR;
	private Double TotalPriceW;
	private Double TotalPriceCurW;
	private Boolean Prod;
	private Integer idTax;

}
