package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dto.IncomeDetailsDto;

import com.entity.IncomeDetails;
import com.entity.Tax;
import com.repository.IncomeDetailsRepository;


import lombok.*;

@Service
@AllArgsConstructor
public class IncomeDetailsService {
	
	private final IncomeDetailsRepository incomeDetailsRepository;
	
	private final TaxService taxService;
	
	
	
	
	public IncomeDetails create(IncomeDetailsDto dto) {
		// Tax tax = taxService.getById(dto.getTax());
		return incomeDetailsRepository.save(IncomeDetails.builder()	
				.branchId(dto.getBranchId())
				.productId(dto.getProductId())
				.qty(dto.getQty())
				.measure(dto.getMeasure())
				.priceC(dto.getPriceC())
				.priceCallowance(dto.getPriceCallowance())
				.sumPriceCr(dto.getSumPriceCr())
				.wholeSaleSurcharge(dto.getWholeSaleSurcharge())
				.sumWprice(dto.getSumWprice())
				.tax(taxService.readById(dto.getIdTax()))
				.taxSumR(dto.getTaxSumR())
				.taxSumW(dto.getTaxSumW())
				.totalPriceR(dto.getTotalPriceR())
				.totalPriceCurR(dto.getTotalPriceCurR())
				.totalPriceW(dto.getTotalPriceR())
				.totalPriceCurW(dto.getTotalPriceCurW())
				.prod(dto.getProd())
				.build());
	}
	

	public List<IncomeDetails> readAll() {
		return incomeDetailsRepository.findAll();
	}

	public List<IncomeDetails> readByTaxId (Integer idTax) {
		Tax tax = taxService.readById(idTax);
		return incomeDetailsRepository.findByTax(tax);
	}
	
	public IncomeDetails readById(Integer idNumParty)
	{
		return incomeDetailsRepository.findById(idNumParty).orElseThrow(()->
		 new RuntimeException("Номер партии не найден!"));
	}
	
	
	public IncomeDetails update(IncomeDetails incomeDetails)
	{
		return incomeDetailsRepository.save(incomeDetails);
	}
	
	public void delete(Integer id)
	{
		incomeDetailsRepository.deleteById(id);
		
	}
	
	
}
