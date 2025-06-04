package com.project.service;

import com.project.model.Product;
import com.project.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class ProductServiceTest {

    private ProductRepository productRepository;
    private ProductService productService;

    @BeforeEach
    public void setUp() {
        productRepository = mock(ProductRepository.class);
        productService = new ProductService(productRepository);
    }

    @Test
    public void testGetProductById_found() {
        Product product = new Product(1L, "Monitor", 300.0);
        when(productRepository.findById(1L)).thenReturn(Optional.of(product));

        Optional<Product> result = productService.getProductById(1L);

        assertTrue(result.isPresent());
        assertEquals("Monitor", result.get().getName());
        verify(productRepository).findById(1L);
    }

    @Test
    public void testCreateProduct_success() {
        Product newProduct = new Product(null, "Teclado", 50.0);
        Product savedProduct = new Product(2L, "Teclado", 50.0);
        when(productRepository.save(newProduct)).thenReturn(savedProduct);

        Product result = productService.createProduct(newProduct);

        assertNotNull(result);
        assertEquals(2L, result.getId());
        assertEquals("Teclado", result.getName());
        verify(productRepository).save(newProduct);
    }
}


