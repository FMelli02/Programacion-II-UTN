package com.example.demo;

import com.example.demo.controller.ProductController;
import com.example.demo.model.Product;

public class Main {
    public static void main(String[] args) {
        ProductController pc = new ProductController();

        Product p1 = new Product(1L, "Teclado", 2500);
        Product p2 = new Product(2L, "Mouse", 1500);

        System.out.println(pc.addProduct(p1));
        System.out.println(pc.addProduct(p2));

        System.out.println("Productos cargados:");
        for (Product p : pc.getAllProducts()) {
            System.out.println(p.getName() + " - $" + p.getPrice());
        }
    }
}
