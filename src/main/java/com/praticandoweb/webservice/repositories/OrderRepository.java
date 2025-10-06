package com.praticandoweb.webservice.repositories;

import com.praticandoweb.webservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
