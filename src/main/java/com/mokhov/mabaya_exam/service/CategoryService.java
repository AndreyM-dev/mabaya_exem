package com.mokhov.mabaya_exam.service;

import com.mokhov.mabaya_exam.model.entity.CategoryOfProduct;

public interface CategoryService {

    CategoryOfProduct getOrCreateCategoryIfNotExisted(String category);
}
