package com.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.IncomeDetails;
import com.entity.Tax;





@Repository
public interface IncomeDetailsRepository extends JpaRepository<IncomeDetails, Integer>{
	List<IncomeDetails> findByTax(Tax tax);

}
