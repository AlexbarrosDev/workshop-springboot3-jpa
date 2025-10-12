package com.praticandoweb.webservice.repositories;

import com.praticandoweb.webservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
