package com.sady.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.sady.account.model.Customer;

public interface AccountRepository extends JpaRepository<Customer, Long>{
	
	public Customer findByName(@Param(value="name") String name);
	
}
