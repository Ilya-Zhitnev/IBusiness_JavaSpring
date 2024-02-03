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

import com.dto.TaxDTO;
import com.entity.Tax;
import com.service.TaxService;

@RestController
@AllArgsConstructor
@RequestMapping("/tax") 
public class TaxController {
	
	private final TaxService taxService;
	
	@PostMapping
	public ResponseEntity<Tax> create(@RequestBody TaxDTO dto){
		return new ResponseEntity<>(taxService.create(dto), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Tax>> readAll(){
		return new ResponseEntity<>(taxService.readAll(), HttpStatus.OK);
	}
	
	@GetMapping("{idTax}")
	public ResponseEntity<Tax> readTax(@RequestBody Integer idTax){
		return new ResponseEntity<>(taxService.readById(idTax), HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<Tax> update(@RequestBody Tax tax)
	{
		return new ResponseEntity<>(taxService.update(tax), HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public HttpStatus delete(@PathVariable Integer id) {
		taxService.delete(id);
		return HttpStatus.OK;
	}
}
