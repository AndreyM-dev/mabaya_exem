package com.mokhov.mabaya_exam.repository;

import com.mokhov.mabaya_exam.model.entity.CategoryOfProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<CategoryOfProduct, Long> {
    Optional<CategoryOfProduct> findCategoryOfProductByCategory(String category);
}
