package com.mokhov.mabaya_exam.service;

import com.mokhov.mabaya_exam.model.entity.CategoryOfProduct;
import com.mokhov.mabaya_exam.repository.CategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    @Cacheable("category")
    public CategoryOfProduct getOrCreateCategoryIfNotExisted(String category) {

        log.info("Added new category " + category);
        Optional<CategoryOfProduct> category1 = categoryRepository.findCategoryOfProductByCategory(category);
        return category1
                .orElse(categoryRepository.save(CategoryOfProduct.builder()
                        .category(category)
                        .build()));
    }
}
