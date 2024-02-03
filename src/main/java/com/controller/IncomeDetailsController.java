package com.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.IncomeDetailsDto;
import com.entity.IncomeDetails;
import com.entity.Tax;
import com.service.IncomeDetailsService;


@RestController
@AllArgsConstructor
@RequestMapping("/incomeDt") 
public class IncomeDetailsController {

	private final IncomeDetailsService incomeDetailsService;
	
	@PostMapping
	public ResponseEntity<IncomeDetails> create(@RequestBody IncomeDetailsDto incomeDetailsDto){
		return mappingResponseIncomeDetails(incomeDetailsService.create(incomeDetailsDto));
	}
	
	@GetMapping
	public ResponseEntity<List<IncomeDetails>> readAll(){
		return mappingResponseListIncomeDetails(incomeDetailsService.readAll());
	}
	
	@GetMapping("/{numParty}")
	public ResponseEntity<IncomeDetails> readByNumParty(@RequestBody Integer numParty){
		
		return new ResponseEntity<>(incomeDetailsService.readById(numParty), HttpStatus.OK);
		//return mappingResponseListIncomeDetails(incomeDetailsService.readByTaxId(id));
	}
	/*
	 * //@RequestParam(name = "yourParam") Integer yourParam
	 * 
	 * @GetMapping("/tax/{id}") public ResponseEntity<List<IncomeDetails>>
	 * readByTaxId(@PathVariable Integer id){ return
	 * mappingResponseListIncomeDetails(incomeDetailsService.readByTaxId(id)); }
	 */
	
	//@RequestParam(name = "yourParam") Integer yourParam
	@GetMapping("/tax/{idTax}")
	public ResponseEntity<List<IncomeDetails>> readByTaxId(@PathVariable Integer idTax){
		
		return new ResponseEntity<>(incomeDetailsService.readByTaxId(idTax), HttpStatus.OK);
		//return mappingResponseListIncomeDetails(incomeDetailsService.readByTaxId(id));
	}

	@PutMapping
	public ResponseEntity<IncomeDetails> update(@RequestBody IncomeDetails incomeDetails)
	{
		return mappingResponseIncomeDetails(incomeDetailsService.update(incomeDetails));
	}
	
	@DeleteMapping("{numParty}")
	public HttpStatus delete(@PathVariable Integer numParty) {
		incomeDetailsService.delete(numParty);
		return HttpStatus.OK;
	}
	
	private ResponseEntity<IncomeDetails> mappingResponseIncomeDetails(IncomeDetails incomeDetails)
	{
		return new ResponseEntity<>(incomeDetails, HttpStatus.OK);
	}
	
	private ResponseEntity<List<IncomeDetails>> mappingResponseListIncomeDetails(List<IncomeDetails> incomeDetails)
	{
		return new ResponseEntity<>(incomeDetails, HttpStatus.OK);
	}

}
