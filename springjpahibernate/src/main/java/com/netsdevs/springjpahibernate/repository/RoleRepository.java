package com.netsdevs.springjpahibernate.repository;


import com.netsdevs.springjpahibernate.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}

