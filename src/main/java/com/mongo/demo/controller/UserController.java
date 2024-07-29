package com.mongo.demo.controller;

import com.mongo.demo.model.Products;
import com.mongo.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class UserController {
    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public Object getProductById(@PathVariable Long id) {
        String a = null;
        Optional<Object> object = Optional.ofNullable(a);
        return object.orElse("Aca");
    }

    @GetMapping("/getAll")
    public List<Products> getProductAll() {
        return productService.listar();
    }
}
