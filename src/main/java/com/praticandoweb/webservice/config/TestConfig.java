package com.praticandoweb.webservice.config;

import com.praticandoweb.webservice.entities.User;
import com.praticandoweb.webservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brow", "maria@gmail.com", "9979998", "123456");
        User u2 = new User(null, "Alex Grey", "alex@gmail.com", "9969974", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
