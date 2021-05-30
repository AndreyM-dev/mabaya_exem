package com.mokhov.mabaya_exam.repository;

import com.mokhov.mabaya_exam.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
