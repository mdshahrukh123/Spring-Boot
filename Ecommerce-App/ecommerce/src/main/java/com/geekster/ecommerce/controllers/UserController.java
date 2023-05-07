package com.geekster.ecommerce.controllers;


import com.geekster.ecommerce.models.Product;
import com.geekster.ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class UserController {


        @Autowired
        ProductService productService;

        @GetMapping(value = "/User/All")
        List<Product> getAllProducts()
        {
            return productService.getAllProducts();
        }

        @PostMapping(value = "/User")
        String addProduct(@RequestBody Product product)
        {
            return productService.addProduct(product);
        }


    }
