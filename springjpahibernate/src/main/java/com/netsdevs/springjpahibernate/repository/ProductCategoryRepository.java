package com.netsdevs.springjpahibernate.repository;

import com.netsdevs.springjpahibernate.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}

