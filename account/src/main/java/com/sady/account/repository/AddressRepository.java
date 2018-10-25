package com.sady.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sady.account.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
