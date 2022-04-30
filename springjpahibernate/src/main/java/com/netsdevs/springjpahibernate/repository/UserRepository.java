package com.netsdevs.springjpahibernate.repository;


import com.netsdevs.springjpahibernate.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

