package com.mongo.demo.service;

import com.mongo.demo.model.Products;
import com.mongo.demo.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductsRepository repositorio;

    public Products guardar(Products entidad) {
        return repositorio.save(entidad);
    }

    public Products encontrarPorId(String id) {
        return repositorio.findById(id).orElse(null);
    }

    public List<Products> listar() {
        return repositorio.findAll();
    }
}
