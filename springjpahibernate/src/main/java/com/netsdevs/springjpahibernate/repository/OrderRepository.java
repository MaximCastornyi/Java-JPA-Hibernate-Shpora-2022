package com.netsdevs.springjpahibernate.repository;

import com.netsdevs.springjpahibernate.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Order findByOrderTrackingNumber(String orderTrackingNumber);
}

