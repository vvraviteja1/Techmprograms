package com.example.simplemongoexample.repository;

import com.example.simplemongoexample.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
