package com.mokhov.mabaya_exam;

import com.github.javafaker.Commerce;
import com.github.javafaker.Faker;
import com.mokhov.mabaya_exam.model.entity.CategoryOfProduct;
import com.mokhov.mabaya_exam.model.entity.Product;
import com.mokhov.mabaya_exam.repository.ProductRepository;
import com.mokhov.mabaya_exam.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableCaching
public class MabayaExamApplication {

    public static void main(String[] args) {
        SpringApplication.run(MabayaExamApplication.class, args);
    }

}

@Component
@Slf4j
class TestDataPopulation implements CommandLineRunner {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        Faker faker = new Faker();
        int productAmount = 1000;
        for (int i = 0; i < productAmount; i++) {
            Commerce commerce = faker.commerce();
            log.info("Department: " + commerce.department() + "  Product: " + commerce.productName() + "Price: " + commerce.price());
            CategoryOfProduct category = categoryService.getOrCreateCategoryIfNotExisted(commerce.department());
            productRepository.save(Product.builder()
                    .category(category)
                    .title(commerce.productName())
                    .price(commerce.price())
                    .productSerial(commerce.promotionCode())
                    .build());
        }

    }
}
