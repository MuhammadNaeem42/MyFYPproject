package com.ujjaval.ecommerce.selleraccountservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SellerAccountServiceApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SellerAccountServiceApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SellerAccountServiceApplication.class, args);
    }
}
