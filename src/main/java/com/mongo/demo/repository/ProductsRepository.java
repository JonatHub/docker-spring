package com.mongo.demo.repository;

import com.mongo.demo.model.Products;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductsRepository extends MongoRepository<Products, String> {
    // Puedes agregar consultas personalizadas aquí si es necesario
}

