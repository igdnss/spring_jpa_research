package com.research.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author ：cn406c0
 * @date ：Created in 2021/3/28 20:03
 * @description：${description}
 */

@SpringBootApplication
@EntityScan("com.research.product.entity")
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class,args);
    }
}
