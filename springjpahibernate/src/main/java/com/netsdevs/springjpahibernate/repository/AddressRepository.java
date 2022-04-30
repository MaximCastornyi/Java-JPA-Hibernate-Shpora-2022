package com.netsdevs.springjpahibernate.repository;


import com.netsdevs.springjpahibernate.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}

