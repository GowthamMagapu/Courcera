package com.example.catalog.steps;

import com.example.catalog.factories.ProductFactory;
import com.example.catalog.service.ProductService;
import io.cucumber.java.Before;

public class LoadSteps {
    @Autowired
    private ProductService service;

    @Before
    public void loadTestData() {
        service.createProduct(ProductFactory.createFakeProduct());
    }
}
