package com.mokhov.mabaya_exam.repository;

import com.mokhov.mabaya_exam.model.entity.CategoryOfProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryOfProduct, Long> {
}
