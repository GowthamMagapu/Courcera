package com.example.catalog.factories;

import com.example.catalog.model.Product;

import java.util.concurrent.atomic.AtomicLong;

public class ProductFactory {
    private static final AtomicLong counter = new AtomicLong(1);

    public static Product createProduct(String name, String category, boolean available) {
        Product product = new Product();
        product.setId(counter.getAndIncrement());
        product.setName(name);
        product.setCategory(category);
        product.setAvailable(available);
        return product;
    }

    public static Product createFakeProduct() {
        return createProduct("Sample Product", "Sample Category", true);
    }
}
