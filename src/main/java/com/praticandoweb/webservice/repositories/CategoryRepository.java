package com.praticandoweb.webservice.repositories;

import com.praticandoweb.webservice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
