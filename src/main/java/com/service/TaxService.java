package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dto.TaxDTO;
import com.entity.Tax;
import com.repository.TaxRepository;

import lombok.*;

@Service
@AllArgsConstructor
public class TaxService {
	
	private final TaxRepository taxRepository;
	
	
	public Tax create(TaxDTO dto) {
		return taxRepository.save(Tax.builder()	
				.percent(dto.getPercent())
				.miniDescription((String) dto.getMiniDescription())
				.fullDescription((String) dto.getFullDescription())
				.build());
	}
	
	public List<Tax> readAll()
	{
		return taxRepository.findAll();
	}
	
	public Tax readById(Integer idTax)
	{
		return taxRepository.findById(idTax).orElseThrow(()->
		 new RuntimeException("Код налога не найден!"));
	}
	
	/*
	 * public Tax getById(Tax idTax) { return
	 * taxRepository.findById(idTax.getIdTax()) .orElseThrow(() -> new
	 * RuntimeException("Код налога не найден!")); }
	 */
	public Tax update(Tax tax)
	{
		return taxRepository.save(tax);
	}
	
	public void delete(Integer id)
	{
		taxRepository.deleteById(id);
		
	}

}