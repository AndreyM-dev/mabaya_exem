package com.mokhov.mabaya_exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MabayaExamApplication {

    public static void main(String[] args) {
        SpringApplication.run(MabayaExamApplication.class, args);
    }

}
