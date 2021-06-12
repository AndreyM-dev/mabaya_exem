package com.mokhov.mabaya_exam.repository;

import com.mokhov.mabaya_exam.model.entity.CategoryOfProduct;
import com.mokhov.mabaya_exam.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("from Product p join CategoryOfProduct c on p.category.id=c.id where c.category=?1")
    List<Product> findAllByCategory(String category);

}
