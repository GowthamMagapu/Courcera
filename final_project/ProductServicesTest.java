package com.example.catalog.service;

import com.example.catalog.model.Product;
import com.example.catalog.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ProductServiceTest {
    private final ProductRepository repository = mock(ProductRepository.class);
    private final ProductService service = new ProductService(repository);

    @Test
    public void testReadProduct() {
        Product product = new Product(1L, "Widget", "Tools", true);
        when(repository.findById(1L)).thenReturn(Optional.of(product));

        Optional<Product> result = service.getProductById(1L);
        assertTrue(result.isPresent());
        assertEquals("Widget", result.get().getName());
    }

    @Test
    public void testUpdateProduct() {
        Product product = new Product(1L, "Widget", "Tools", true);
        when(repository.findById(1L)).thenReturn(Optional.of(product));
        when(repository.save(any(Product.class))).thenReturn(product);

        Product updatedProduct = new Product();
        updatedProduct.setName("Updated Widget");
        updatedProduct.setCategory("Updated Tools");
        updatedProduct.setAvailable(false);

        Product result = service.updateProduct(1L, updatedProduct);
        assertEquals("Updated Widget", result.getName());
    }

    @Test
    public void testDeleteProduct() {
        doNothing().when(repository).deleteById(1L);

        assertDoesNotThrow(() -> service.deleteProduct(1L));
        verify(repository, times(1)).deleteById(1L);
    }

    @Test
    public void testListProducts() {
        when(repository.findAll()).thenReturn(List.of(new Product(1L, "Widget", "Tools", true)));

        assertEquals(1, service.getAllProducts().size());
    }
}
