package com.geekster.ecommerce.controllers;

import com.geekster.ecommerce.models.Product;
import com.geekster.ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class OrderController {
    @Autowired
    ProductService productService;

    @GetMapping(value = "/Order/All")
    List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }

    @PostMapping(value = "/Order")
    String addProduct(@RequestBody Product product)
    {
        return productService.addProduct(product);
    }


}
