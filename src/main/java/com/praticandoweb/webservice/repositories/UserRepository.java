package com.praticandoweb.webservice.repositories;

import com.praticandoweb.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
